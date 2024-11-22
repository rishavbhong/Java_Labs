import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseManager {
    public static void main(String[] args) {
        String driver = "com.mysql.jdbc.Driver";
        String url ="jdbc:mysql://localhost:3306/test";
        String user = "root";
        String pass = "root";

        Connection con = null;          //for connecting the database and java
        Statement stmt = null;             // for making the agent

//        String sqlddl = "create table student(sname varchar(30), branch varchar(30))"; //Triggring the Query
        String sqlinsert = "INSERT INTO student (sname, branch) VALUES ('rishav', 'ai' )";  // Query for inserting data
        String sqlinsert1 = "INSERT INTO student (sname, branch) VALUES ('rahul', 'abv' )";
        try{
            Class.forName(driver);              //Reg. of suitable driver
            con = DriverManager.getConnection(url,user,pass);
            stmt = con.createStatement();
//            stmt.execute(sqlddl);
            stmt.executeUpdate(sqlinsert);
            stmt.executeUpdate(sqlinsert1);
        }
        catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
        catch (SQLException ex){
            ex.printStackTrace();
        }
        finally {
            try{
                if (stmt != null){
                    stmt.close();
                    stmt = null;
                }
            }
            catch (SQLException ex){
                ex.printStackTrace();
            }
            try {
                if (con!=null){
                    con.close();
                    con = null;
                }
            }
            catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }
}
