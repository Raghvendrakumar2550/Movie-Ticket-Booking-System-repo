import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get form data
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String password = request.getParameter("password");

        // Database connection details
        String jdbcURL = "jdbc:mysql://localhost:3306/userDB";
        String dbUsername = "root";
        String dbPassword = "yourpassword";
        String insertSQL = "INSERT INTO users (name, address, email, mobile, password) VALUES (?, ?, ?, ?, ?)";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Load database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish a connection to the database
            connection = DriverManager.getConnection(jdbcURL, dbUsername, dbPassword);
            
            // Prepare SQL statement
            preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, address);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, mobile);
            preparedStatement.setString(5, password);
            
            // Execute the statement
            int rowsInserted = preparedStatement.executeUpdate();
            
            // Check if data is inserted
            if (rowsInserted > 0) {
                response.sendRedirect("success.jsp");  // Redirect to success page
            } else {
                response.sendRedirect("error.jsp");  // Redirect to error page
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");  // Redirect to error page if there's an issue
        } finally {
            // Close resources
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
