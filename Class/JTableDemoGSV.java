import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class JTableDemoGSV extends JFrame {
    public static void main(String[] args) {
        JTableDemoGSV jtd = new JTableDemoGSV();
        jtd.setVisible(true);
        jtd.setSize(500,500);
        jtd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JTableDemoGSV() {
        String driver = "com.mysql.jdbc.Driver"; // Use the correct driver for MySQL 8+
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String pass = "root";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        String sqldql = "SELECT * FROM student"; // SQL query to retrieve data

        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("sName");
        dtm.addColumn("Branch");

        // Initialize JTable with the model
        JTable jtd = new JTable(dtm);
        JScrollPane jsp = new JScrollPane(jtd); // Create JScrollPane only once

        try {
            // Load the driver class
            Class.forName(driver);

            // Create the connection
            con = DriverManager.getConnection(url, user, pass);

            // Create statement and execute query
            stmt = con.createStatement();
            rs = stmt.executeQuery(sqldql);

            // Iterate through the result set and populate the JTable
            while (rs.next()) {
                dtm.addRow(new Object[]{rs.getString(1), rs.getString(2)});
            }

            // Add JScrollPane to JFrame (add this only once)
            add(jsp);

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            // Close ResultSet, Statement, and Connection
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
