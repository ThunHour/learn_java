import java.sql.*;

public class test {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("cdata.jdbc.mysql.MySQLDriver");
        Connection conn = DriverManager
                .getConnection("jdbc:mysql:Server=\"192.168.1.12\";User=\"root\";Password=\"root\";");
        System.out.println("connected server");
        System.out.println();
        Statement stmt = conn.createStatement();
        System.out.println("Statement completed");
        System.out.println();
        String dbName = "hotel";
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
        String checkTable = "select table_name from information_schema.tables where table_name= 'hotel_food' ;";
        ResultSet rt = null;
        rt = stmtWithID.executeQuery(checkTable);
        boolean checkedTable = rt.next();
        if (checkedTable == false) {
            stmtWithID.executeQuery("CREATE TABLE hotel_food (food_id int,item_name text,price int,quantity int);");
            System.out.println("hotel_food table has been created successfully");
            System.out.println();
        } else {
            System.out.println("Your table was created");
            System.out.println();
        }

        // insert
        PreparedStatement stmt2 = connWithID.prepareStatement("insert into hotel_food values(?,?,?,?)");
        stmt2.setInt(1, 1);
        stmt2.setString(2, "Hot dog");
        stmt2.setInt(3, 20);
        stmt2.setInt(4, 3);
        stmt2.executeUpdate();

        PreparedStatement stmt3 = connWithID.prepareStatement("insert into hotel_food values(?,?,?,?)");
        stmt3.setInt(1, 2);
        stmt3.setString(2, "Sandwich");
        stmt3.setInt(3, 40);
        stmt3.setInt(4, 5);
        stmt3.executeUpdate();

        PreparedStatement stmt4 = connWithID.prepareStatement("insert into hotel_food values(?,?,?,?)");
        stmt4.setInt(1, 3);
        stmt4.setString(2, "Chicken");
        stmt4.setInt(3, 75);
        stmt4.setInt(4, 7);
        stmt4.executeUpdate();

        PreparedStatement stmt5 = connWithID.prepareStatement("insert into hotel_food values(?,?,?,?)");
        stmt5.setInt(1, 4);
        stmt5.setString(2, "Pizza");
        stmt5.setInt(3, 50);
        stmt5.setInt(4, 6);
        stmt5.executeUpdate();

        ResultSet re = null;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
        re = stmtWithID.executeQuery("select * from hotel_food ");
        while (re.next()) {
            System.out.println(re.getInt(1) + " " + re.getString(2) + " " + re.getInt(3) + " " + re.getString(4));
        }

        // update

        PreparedStatement stmt7 = connWithID.prepareStatement("update hotel_food set price=? where food_id=?");
        stmt7.setInt(1, 10);
        stmt7.setInt(2, 1);
        stmt7.executeUpdate();

    }
}
