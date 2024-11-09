package com.user.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MovieDAO {
	private String jdbcURL="jdbc:mysql://localhost:3306/UserDb";
	private String jdbcUserName="root";
	private String jdbcPassword="root";
	
	private static final String INSERT_USER_SQL="INSERT INTO users"+"(UserName,Email,paswd,country) VALUES "+" (?,?,?,?)";
	private static final String SELECT_USER_BY_NAME="SELECT * FROM users where UserName=?";
	private static final String SELECT_ALL_USER="SELECT * FROM users";
	private static final String DELETE_USER_SQL="delete from users where UserName=?";
	private static final String UPDATE_USERS_SQL="update users set UserName=?,Email=?,paswd=?,country=?  where UserName=?";
	public MovieDAO() 
	{

	}
	
	//database connection
	public Connection getConnection()
	{
		Connection connection=null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(jdbcURL, jdbcUserName, jdbcPassword);
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		return connection;
     }
	
   public static void main(String[] args)
   {
	   MovieDAO dao=new MovieDAO();
	   if(dao.getConnection()!=null)
	   {
		   System.out.println("Successfully connected to the database");

	   }
	   else {
		   System.out.println("problem in database connection");

	   }
	   
   }
    

			
}	    




