import java.sql.*;
public class ex3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("cdata.jdbc.mysql.MySQLDriver");
        Connection conn = DriverManager
                .getConnection("jdbc:mysql:Server=\"192.168.1.12\";User=\"root\";Password=\"root\";Database=\"employ\"");
        System.out.println("connected server");
        Statement stmt = conn.createStatement();
        stmt.addBatch("insert into top_management_info values(12,'hengkoji','CTT',1000)");
        stmt.executeBatch();
    }
}
