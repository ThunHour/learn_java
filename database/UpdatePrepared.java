
import java.sql.*;

public class UpdatePrepared {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        Class.forName("cdata.jdbc.mysql.MySQLDriver");
        Connection conn=DriverManager.getConnection("jdbc:mysql:Server=\"192.168.1.12\";User=\"root\";Password=\"root\";Database=\"products_db2\";");
        System.out.println("Connected");
        PreparedStatement stmt=conn.prepareStatement("update product_info set name=? where id=? ");
        stmt.setString(1, "greenBanana");
        stmt.setInt(2, 2);
        stmt.executeUpdate();
        System.out.println("Updated on Id: " +2);
    }
    
}
