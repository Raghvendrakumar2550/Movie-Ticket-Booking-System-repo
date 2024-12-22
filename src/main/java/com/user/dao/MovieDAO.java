package com.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.user.model.User;

public class MovieDAO {
	private String jdbcURL = "jdbc:mysql://localhost:3306/Userdb";
	private String jdbcUserName = "root";
	private String jdbcPassword = "Raghvendra@2006";
	
	private static final String INSERT_USER_SQL = "INSERT INTO users (UserName, Email, paswd, country) VALUES (?, ?, ?, ?)";
	private static final String SELECT_USER_BY_ID = "SELECT * FROM users WHERE Id=?";
	private static final String SELECT_ALL_USER = "SELECT * FROM users";
	private static final String DELETE_USER_SQL = "DELETE FROM users WHERE UserName=?";
	private static final String UPDATE_USERS_SQL = "UPDATE users SET UserName=?, Email=?, paswd=?, country=? WHERE UserName=?";

	// Constructor
	public MovieDAO() {
	}

	// Database connection
	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUserName, jdbcPassword);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public void insertUser(User user) {
		try (Connection connection = getConnection()) {
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_SQL);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getPassword()); // Adjust according to User class
			preparedStatement.setString(4, user.getCountry());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public User selectUser(int Id) {
		User user = null;
		try (Connection connection = getConnection()) {
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);
			preparedStatement.setInt(1, Id);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				String UserName = resultSet.getString("UserName");
				String Email = resultSet.getString("Email");
				String paswd = resultSet.getString("paswd");
				String country = resultSet.getString("country");
				user = new User(Id, UserName, Email, paswd, country);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	public List<User> selectAllUsers() {
		List<User> users = new ArrayList<>();
		try (Connection connection = getConnection()) {
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USER);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				int Id = resultSet.getInt("Id");
				String UserName = resultSet.getString("UserName");
				String Email = resultSet.getString("Email");
				String paswd = resultSet.getString("paswd");
				String country = resultSet.getString("country");
				users.add(new User(Id, UserName, Email, paswd, country));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	public boolean deleteUser(int Id) {
		boolean status = false;
		try (Connection connection = getConnection()) {
			PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER_SQL);
			preparedStatement.setInt(1, Id);
			status = preparedStatement.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}

	public boolean updateUser(User user) {
		boolean status = false;
		try (Connection connection = getConnection()) {
			PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getPassword());
			preparedStatement.setString(4, user.getCountry());
			preparedStatement.setString(5, user.getName()); // Assuming UserName is used as the unique identifier
			status = preparedStatement.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}

	public static void main(String[] args) {
		MovieDAO dao = new MovieDAO();
		if (dao.getConnection() != null) {
			System.out.println("Successfully connected to the database");
		} else {
			System.out.println("Problem in database connection");
		}
		
		User user = new User(0, "Raghvendra", "raghvendrakumar2550@gmail.com", "1234", "India");
		dao.insertUser(user);
		User user1 = dao.selectUser(0); // Adjust ID as necessary
		System.out.println(user1);
	}
}
