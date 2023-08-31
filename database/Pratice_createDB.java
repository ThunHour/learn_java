
import java.sql.*;

public class Pratice_createDB {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("cdata.jdbc.mysql.MySQLDriver");
        Connection conn = DriverManager.getConnection("jdbc:mysql:Server=\"192.168.1.12\";User=\"root\";Password=\"root\";Database=\"employ\"");
        String dbName = "Employ";
        String checkDb = "SELECT SCHEMA_NAME FROM information_schema.SCHEMATA WHERE SCHEMA_NAME ='" + dbName + "'";
        System.out.println("You had connected to Database");
        Statement stmt = conn.createStatement();
        System.out.println("Statement completed");
        ResultSet rs = null;
        boolean dbFound = false;
        rs = stmt.executeQuery(checkDb);

        
//         System.out.println("Result set Value "+ rs.next());
//         if(!dbFound){
//             String db="CREATE DATABASE IF NOT EXISTS " + dbName +"";
//             int createdb=stmt.executeUpdate(db);
//             System.out.println(dbName+" database create Successfully");
//         }
//        rs = stmt.executeQuery(
//                " INSERT INTO `top_management_info`(`Id`, `Name`, `Position`, `Salary`) VALUES (5,'Bou Leapheng','CFO',20000); ");
//    

//    rs=stmt.executeQuery("update top_management_info set Salary=150000 where Id=1");
        rs = stmt.executeQuery("delete from top_management_info  where Id=4");

    }
}
