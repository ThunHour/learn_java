import java.sql.*;

public class ex2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("cdata.jdbc.mysql.MySQLDriver");
        Connection conn = DriverManager
                .getConnection("jdbc:mysql:Server=\"192.168.1.12\";User=\"root\";Password=\"root\";Database=\"employ\"");
        System.out.println("connected server");
        Statement stmt = conn.createStatement();
        System.out.println("Statement completed");

        PreparedStatement stmt5=conn.prepareStatement("SELECT *  FROM top_management_info WHERE  Salary<=?");
        stmt5.setInt(1,10000);
        ResultSet rs=stmt5.executeQuery();
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }


    }
}
