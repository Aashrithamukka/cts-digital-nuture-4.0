import java.sql.*;

public class InsertUpdateJDBC {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_db", "username", "password");

            // Insert
            PreparedStatement insertStmt = conn.prepareStatement("INSERT INTO students (id, name) VALUES (?, ?)");
            insertStmt.setInt(1, 1);
            insertStmt.setString(2, "Alice");
            insertStmt.executeUpdate();

            // Update
            PreparedStatement updateStmt = conn.prepareStatement("UPDATE students SET name=? WHERE id=?");
            updateStmt.setString(1, "Bob");
            updateStmt.setInt(2, 1);
            updateStmt.executeUpdate();

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}