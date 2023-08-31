
import java.sql.*;

public class InsertPrepared {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        Class.forName("cdata.jdbc.mysql.MySQLDriver");
        Connection conn=DriverManager.getConnection("jdbc:mysql:Server=\"192.168.1.12\";User=\"root\";Password=\"root\";Database=\"products_db2\";");
        
        System.out.println("Connected");
        Statement stmt1=conn.createStatement();
        PreparedStatement stmt=conn.prepareStatement("insert into product_info values(?,?,?,?,?)");
        stmt.setInt(1, 11);
        stmt.setString(2, "redApple");
        stmt.setInt(3, 200);
        stmt.setInt(4, 3);
        stmt.setInt(5, 600);
        int i=stmt.executeUpdate();
    
        System.out.println("Record inserted");
        conn.close();
    }
    
}
