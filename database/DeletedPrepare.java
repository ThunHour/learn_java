

import java.sql.*;

public class DeletedPrepare {

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
        PreparedStatement stmt=conn.prepareStatement("delete from product_info where id=? ");
        stmt.setInt(1,5);
     
        stmt.executeUpdate();
        System.out.println("Updated on Id: " +1);
    }
    
}


