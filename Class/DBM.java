import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class DBM {
    public static void main(String[] args) {
        // Database connection details
        String driver = "com.mysql.jdbc.Driver";

        String url ="jdbc:mysql://localhost:3306/test";
        String user = "root";
        String pass = "root";

        // SQL queries
        String sqlddl = "CREATE TABLE IF NOT EXISTS student(sname VARCHAR(30), branch VARCHAR(30))"; // Creating the table
        String sqli = "INSERT INTO student (sname, branch) VALUES (?, ?)";  // Query to insert data

        Connection con = null;
        Statement stmt = null;

        try {
            // Step 1: Establish the connection
            con = DriverManager.getConnection(url, user, pass);
            stmt = con.createStatement();

            // Step 2: Create the student table
            stmt.execute(sqlddl);
            System.out.println("Table 'student' created or already exists.");

            // Step 3: Insert data into the table
            try (PreparedStatement pstmt = con.prepareStatement(sqli)) {
                // Setting the values for insertion
                pstmt.setString(1, "Rishav");   // First value for 'sname'
                pstmt.setString(2, "AI");       // Second value for 'branch'

                // Execute the insert
                int rowsInserted = pstmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("A new student was inserted successfully!");
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            // Step 4: Close the Statement and Connection
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
