import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/charity_service_db?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "password";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully to Charity Service Database");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}