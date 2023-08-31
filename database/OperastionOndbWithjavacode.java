
import java.sql.*;
public class OperastionOndbWithjavacode {
    public static void main(String[] args) throws ClassNotFoundException,SQLException {
        
        Class.forName("cdata.jdbc.mysql.MySQLDriver");
        
        Connection conn = DriverManager.getConnection("jdbc:mysql:Server=\"192.168.1.12\";User=\"root\";Password=\"root\";Database=\"products_db2\";");
        System.out.println("connected");
        
        Statement stmt = conn.createStatement();
        
        System.out.println("Statement completed");
        
        String dbName = "products_db2";
        
        String checkDb = "SELECT SCHEMA_NAME FROM information_schema.SCHEMATA WHERE SCHEMA_NAME = '" + dbName + "'";
        ResultSet rs = null;
        //Insert record
//        rs=stmt.executeQuery("INSERT INTO `product_info`(`Id`, `name`, `price`, `quantity`, `Total_price_of_quantity`) VALUES (9,'hour',2000,6,12000);");
//        rs = stmt.executeQuery(checkDb);
//            System.out.println("Result Set Value: " + rs.next());
        ResultSet rd = null;
        //delete record
//       rd=stmt.executeQuery("DELETE FROM `product_info` WHERE price=1000 ;");

//update
        rd=stmt.executeQuery("update product_info set price=1000 where Id=1");
       rs=stmt.executeQuery("SELECT * FROM `product_info` WHERE Id<10 ;");
       while(rs.next()){
            System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+rs.getFloat(3)+rs.getInt(4) );
       }
       conn.close();
        // TODO code application logic here
    }
    
}
