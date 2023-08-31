
import java.sql.*;

public class DatabaseEX {
    public static void main(String[] args) throws ClassNotFoundException,SQLException {
        
        Class.forName("cdata.jdbc.mysql.MySQLDriver");
        
        Connection conn = DriverManager.getConnection("jdbc:mysql:Server=\"192.168.1.12\";User=\"root\";Password=\"root\";");
        System.out.println("connected");
        
        Statement stmt = conn.createStatement();
        
        System.out.println("Statement completed");
        
        String dbName = "products db2";
        
        String checkDb = "SELECT SCHEMA_NAME FROM information_schema.SCHEMATA WHERE SCHEMA_NAME = '" + dbName + "'";
        ResultSet rs = null;
        rs = stmt.executeQuery(checkDb);
            System.out.println("Result Set Value: " + rs.next());
       
        // TODO code application logic here
    }
    
}