package testJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionExample {
    public static void main(String[] args) {
        // Database URL
        String url = "jdbc:mysql://localhost:3306/mydatabase";

        // Database credentials
        String username = "root";
        String password = "Sumana@90140";

        // Establish the connection
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to the database.");
            System.out.println(connection);//if connected connection object print karni chahiye

            // Perform database operations here

        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
        }
    }
}
