import java.sql.*;

public class BasicJDBCConnection {
    public static void main(String[] args) {
        try {
            // Load the JDBC driver (for MySQL)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_db", "username", "password");

            // Execute a SELECT query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            // Print the result
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }

            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}