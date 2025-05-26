import java.sql.*;

public class TransactionHandling {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_db", "user", "pass");
            conn.setAutoCommit(false);

            Statement stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE accounts SET balance = balance - 500 WHERE id = 1");
            stmt.executeUpdate("UPDATE accounts SET balance = balance + 500 WHERE id = 2");

            conn.commit();
            System.out.println("Transaction committed.");
            conn.close();
        } catch (SQLException e) {
            System.out.println("Rolling back transaction.");
            e.printStackTrace();
        }
    }
}