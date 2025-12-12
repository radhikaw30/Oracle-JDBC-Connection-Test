>> Project Overview

This project demonstrates how to establish a successful connection between a Java application and Oracle Database XE / 10g using JDBC.
This is the first and essential step before performing CRUD (Create, Read, Update, Delete) operations in Java applications.

>> Goals

Load Oracle JDBC Driver

Connect Java with Oracle database using JDBC URL

Validate connection

Display success message

Close connection safely

>> Technologies / Software Used

Java (JDK 23/24)

IntelliJ IDEA Community Edition

Oracle Database Express Edition (XE / 10g)

Oracle JDBC Driver (ojdbc14.jar )

Windows Operating System

>> JDBC URL Format
jdbc:oracle:thin:@localhost:1521:XE

>> Source Code
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

>> Output: 

Radhika Wakte Batch No. 213
Connection Successful!

>> Conclusion

This project verifies a successful JDBC connection between Java and Oracle.
It forms the foundation for future database operations such as INSERT, SELECT, UPDATE, DELETE, and building complete student management systems.
