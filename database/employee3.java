import java.sql.*;
public class employee3 {

    
    public static void main(String[] args)throws SQLException, ClassNotFoundException{
        
        Class.forName("cdata.jdbc.mysql.MySQLDriver");
        
        Connection conn = DriverManager.getConnection("jdbc:mysql:Server=\"192.168.1.12\";User=\"root\";Password=\"root\";Database=\"employ\";");
        
        System.out.println("Connected");
        
        PreparedStatement stmt = conn.prepareStatement("Select * from top_management_info");
        
        ResultSet rs = stmt.executeQuery();
        
        ResultSetMetaData rsmd = rs.getMetaData();
        
        System.out.println("Total no of attributes in the table "+rsmd.getColumnCount()+ ": ");
        
        System.out.println("First attribute "+ rsmd.getColumnName(1));
        
        System.out.println("Type of" + " " + rsmd.getColumnName(1)+" "+"is "+" "+rsmd.getColumnType(1));
        
        
    }
}
    