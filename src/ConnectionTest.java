import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
    public static void main(String[] args) {
        Connection conn=null;

        try {
            long start = System.currentTimeMillis();
            conn = DriverManager.getConnection("url","user","password");
            long stop = System.currentTimeMillis();
            System.out.println("connected Time" + (stop - start) + " ms.");
            conn.close();

        } catch(SQLException se){
            System.out.println(se.getMessage());

        } finally {
            if(conn != null)   try {conn.close();} catch (SQLException e) { e.printStackTrace();}

        }
    }
}
