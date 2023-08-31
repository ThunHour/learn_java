import java.sql.*;

public class practice {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("cdata.jdbc.mysql.MySQLDriver");
        Connection conn = DriverManager
                .getConnection(
                        "jdbc:mysql:Server=\"192.168.1.12\";User=\"root\";Password=\"root\";Database=\"employ\"");
        System.out.println("connected");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(
                "SELECT Name FROM top_management_info WHERE Salary = (SELECT MAX(Salary) FROM top_management_info);");

        while (rs.next()) {
            System.out.println("Top management who is receiving highest salary is :" + rs.getString(1));
        }
        ResultSet rx = stmt.executeQuery(
                "SELECT Name FROM top_management_info WHERE Salary = (SELECT MIN(Salary) FROM top_management_info);");
        while (rx.next()) {
            System.out.println("Top management who is receiving lowest salary is :" + rx.getString(1));
        }
        ResultSet rt = stmt.executeQuery(
                "SELECT Name, Position  FROM top_management_info WHERE age = (SELECT MIN(age) FROM top_management_info);");
        while (rt.next()) {
            System.out.println(
                    rt.getString(1) + " is the youngest employee in company with belong to " + rt.getString(2));
        }

    }
}
