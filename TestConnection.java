import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {

        try {
            //Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //Establish Connection
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String username = "system";
            String password = "system";
            System.out.println("Radhika Wakte Batch No. 213");
            Connection con = DriverManager.getConnection(url, username, password);

            //If connected
            System.out.println("Connection Successful!");
            //closing connection
            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());

        }
    }
}
