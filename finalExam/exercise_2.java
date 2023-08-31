
import java.sql.*;

public class exercise_2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("cdata.jdbc.mysql.MySQLDriver");
        Connection conn = DriverManager
                .getConnection("jdbc:mysql:Server=\"192.168.1.12\";User=\"root\";Password=\"root\";");
        System.out.println("connected server");
        System.out.println();
        Statement stmt = conn.createStatement();
        System.out.println("Statement completed");
        System.out.println();
        String dbName = "Webserver";
        String checkDb = "SELECT SCHEMA_NAME FROM information_schema.SCHEMATA WHERE SCHEMA_NAME = '" + dbName + "'";
        ResultSet rs = null;
        rs = stmt.executeQuery(checkDb);
        System.out.println("Result Set Value: " + rs.next());
        System.out.println();
        if (rs.next() == false) {
            String createDB = "CREATE DATABASE IF NOT EXISTS " + dbName + "";

            stmt.executeQuery(createDB);

            System.out.println("Database " + dbName + " created successfully");
            System.out.println();
            rs.close();
        }

        Connection connWithID = DriverManager.getConnection(String
                .format("jdbc:mysql:Server=\"192.168.1.12\";User=\"root\";Password=\"root\";Database=\"%s\"", dbName));
        System.out.println("Connected to database");
        System.out.println();
        Statement stmtWithID = connWithID.createStatement();
        String checkTable = "select table_name from information_schema.tables where table_name= 'webpage' ;";
        ResultSet rt = null;
        rt = stmtWithID.executeQuery(checkTable);
        boolean checkedTable = rt.next();
        if (checkedTable == false) {
            stmtWithID.executeQuery(
                    "CREATE TABLE webpage (webpage_id int,webpage_name text,no_of_times_visited int,last_modified_date DATE);");
            System.out.println("webpage table has been created successfully");
            System.out.println();
        } else {
            System.out.println("Your table was created");
            System.out.println();
        }

        // insert
        PreparedStatement stmt2 = connWithID.prepareStatement("insert into webpage values(?,?,?,?)");
        stmt2.setInt(1, 1);
        stmt2.setString(2, "AWS");
        stmt2.setInt(3, 2000);
        stmt2.setString(4, "2022-01-21");
        stmt2.executeUpdate();

        stmt2.setInt(1, 2);
        stmt2.setString(2, "Firebase");
        stmt2.setInt(3, 22000);
        stmt2.setString(4, "2021-12-01");
        stmt2.executeUpdate();

        stmt2.setInt(1, 3);
        stmt2.setString(2, "Apache Tomcat");
        stmt2.setInt(3, 52000);
        stmt2.setString(4, "2022-02-15");
        stmt2.executeUpdate();

        stmt2.setInt(1, 4);
        stmt2.setString(2, "Lighttpd");
        stmt2.setInt(3, 12000);
        stmt2.setString(4, "2021-11-28");
        stmt2.executeUpdate();

        stmt2.setInt(1, 5);
        stmt2.setString(2, "PM2");
        stmt2.setInt(3, 12000);
        stmt2.setString(4, "2022-02-17");
        stmt2.executeUpdate();

        ResultSet mostVisit = null;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
        mostVisit = stmtWithID.executeQuery(
                "select * from webpage where no_of_times_visited=(select max(no_of_times_visited) from webpage) ");
        while (mostVisit.next()) {
            System.out.println("which web page is the mostly visited: "
                    + mostVisit.getString(2) + " , no_of_times_visited : " + mostVisit.getInt(3) + " , last_modified_date : "
                    + mostVisit.getString(4));
        }
        ResultSet recentDate = null;
        recentDate = stmtWithID.executeQuery(
                "select * from webpage where last_modified_date=(select max(last_modified_date) from webpage) ");
        while (recentDate.next()) {
            System.out.println("web page recently modified : " + recentDate.getString(2) + " , no_of_times_visited : "
                    + recentDate.getInt(3) + " , last_modified_date : " + recentDate.getString(4));
        }
        ResultSet leastVisited = null;
        leastVisited = stmtWithID.executeQuery(
                "select * from webpage where no_of_times_visited=(select min(no_of_times_visited) from webpage) ");
        while (leastVisited.next()) {
            System.out.println("web page name least visited : " + leastVisited.getString(2) + " , no_of_times_visited : "
                    + leastVisited.getInt(3) + " , last_modified_date : " + leastVisited.getString(4));
        }
    }
}