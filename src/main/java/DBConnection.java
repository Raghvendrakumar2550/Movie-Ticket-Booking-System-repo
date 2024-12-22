import java.sql.*;

public class DBConnection {
    private static final String jdbcURL = "jdbc:mysql://localhost:3306/userDBS";
    private static final String dbUsername = "root";
    private static final String dbPassword = "Raghvendra@2006";
    private static Connection connection;

    // Establish connection
    public static Connection getConnection() throws SQLException {
        try {
            if (connection == null || connection.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(jdbcURL, dbUsername, dbPassword);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new SQLException("Error connecting to the database");
        }
        return connection;
    }

    // Close the connection
    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
