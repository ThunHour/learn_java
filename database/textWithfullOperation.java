import java.sql.*;
import java.util.*;

public class textWithfullOperation {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        while (true) {
            Class.forName("cdata.jdbc.mysql.MySQLDriver");

            Scanner input = new Scanner(System.in);
            System.out.print("Enter server address: ");
            String server = input.next();

            System.out.print("Enter username: ");
            String username = input.next();

            System.out.print("Enter password: ");
            String password = input.next();

            System.out.print("Enter Database Name: ");
            String dbName = input.next();

            Connection conn = DriverManager.getConnection("jdbc:mysql:Server=" + server, username, password);
            System.out.println("connected");
            Statement stmt = conn.createStatement();
            System.out.println("Statement completed");
            String checkDb = "SELECT SCHEMA_NAME FROM information_schema.SCHEMATA WHERE SCHEMA_NAME = '" + dbName + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(checkDb);

            if (rs.next() == false) {
                System.out.print("Do you want to create a new database? Y/N:");
                String answerCreateDB = input.next();
                if (answerCreateDB.equals("y") || answerCreateDB.equals("Y") || answerCreateDB.equals("YES")
                        || answerCreateDB.equals("yes")) {
                    String createDB = "CREATE DATABASE IF NOT EXISTS " + dbName + "";

                    stmt.executeQuery(createDB);

                    System.out.println("Database " + dbName + " created successfully");
                    rs.close();
                } else {
                    break;
                }

            }

            System.out.print("Enter table name: ");
            String tName = input.next();
            Connection conn1 = DriverManager
                    .getConnection(
                            String.format("jdbc:mysql:Server=\"%s\";User=\"%s\";Password=\"%s\";Database=\"%s\";",
                                    server, username, password, dbName));
            Statement stmt1 = conn1.createStatement();
            String checkTable = "select table_name from information_schema.tables where table_name='" + tName + "';";
            ResultSet rt = null;
            rt = stmt1.executeQuery(checkTable);
            boolean checkedTable = rt.next();
            List<String> columnPro = new ArrayList<String>();
            if (checkedTable == false) {
                System.out.print("Do you want to create a new table Y/N?:");
                String answerCreateNewTable = input.next();
                if (answerCreateNewTable.equals("y") || answerCreateNewTable.equals("Y")
                        || answerCreateNewTable.equals("YES")
                        || answerCreateNewTable.equals("yes")) {
                    String property = "";
                    System.out.println("Write stop/STOP on column Name/column to start create table:");
                    while (true) {

                        System.out.print("Enter column Name:");
                        String columnName = input.next();
                        columnPro.add(columnName);
                        if (columnName.equals("stop") || columnName.equals("STOP")) {
                            break;
                        }
                        System.out.print("Enter column type:");
                        String columnType = input.next();
                        if (columnType.equals("stop") || columnType.equals("STOP")) {
                            break;
                        }
                        if (columnName.equals("stop") || columnName.equals("STOP") || columnType.equals("stop")
                                || columnType.equals("STOP")) {
                            break;
                        } else {
                            property += String.format("%s %s ,", columnName, columnType);
                        }
                    }
                    String createTable = String.format("CREATE TABLE %S (%s);", tName,
                            property.substring(0, property.length() - 1));
                    System.out.println(createTable);
                    stmt1.executeQuery(createTable);
                    System.out.println("table created");
                } else {
                    break;
                }
            } else if (checkedTable == true) {
                System.out.println("Table is exists");
            }
            while (true) {
                System.out.println("Write 1 for Insert \n Write 2 for Update \n Write 3 for Delete");
                System.out.print("Enter your answer");
                String choice = input.next();
                switch (choice) {
                    case "1":
                    {
                        PreparedStatement insert = conn1
                                .prepareStatement("insert into " + tName + " values(?,?,?,?)");
                     
                        insert.setInt(1, 1);
                        insert.setString(2, "Palak paneer");
                        insert.setInt(3, 14000);
                        insert.setInt(4, 2);
                        insert.executeUpdate();

                        PreparedStatement insert1 = conn1
                                .prepareStatement("insert into " + tName +  " values(?,?,?,?)");
                        insert1.setInt(1, 2);
                        insert1.setString(2, "Chicken tikka masala");
                        insert1.setInt(3, 10000);
                        insert1.setInt(4, 1);
                        insert1.executeUpdate();

                        PreparedStatement insert2 = conn1
                                .prepareStatement("insert into " + tName + " values(?,?,?,?)");
                        insert2.setInt(1, 3);
                        insert2.setString(2, "Chickpea stew");
                        insert2.setInt(3, 4000);
                        insert2.setInt(4, 3);
                        insert2.executeUpdate();

                        PreparedStatement insert3 = conn1
                                .prepareStatement("insert into " + tName + " values(?,?,?,?)");
                        insert3.setInt(1, 4);
                        insert3.setString(2, "Chana masala");
                        insert3.setInt(3, 24000);
                        insert3.setInt(4, 4);
                        insert3.executeUpdate();

                        PreparedStatement insert4 = conn1
                                .prepareStatement("insert into " + tName +  " values(?,?,?,?)");
                        insert4.setInt(1, 5);
                        insert4.setString(2, "Samlor korkor");
                        insert4.setInt(3, 5500);
                        insert4.setInt(4, 1);
                        insert4.executeUpdate();

                        PreparedStatement insert5 = conn1
                                .prepareStatement("insert into " + tName +  " values(?,?,?,?)");
                        insert5.setInt(1, 6);
                        insert5.setString(2, "Amok");
                        insert5.setInt(3, 40000);
                        insert5.setInt(4, 10);
                        insert5.executeUpdate();
                    }
                        break;
                    case "2": {
                        System.out.print("Enter id:");
                        int id = input.nextInt();
                        System.out.print("Enter price that want to change:");
                        int price = input.nextInt();
                        PreparedStatement update = conn1
                                .prepareStatement("update " + tName + " set price=? where id=? ");
                        update.setInt(1, price);
                        update.setInt(2, id);
                        update.executeUpdate();
                    }
                        break;
                    case "3": {
                        System.out.print("Enter id:");
                        int id = input.nextInt();
                        PreparedStatement delete = conn1.prepareStatement("delete from " + tName + " where id=? ");
                        delete.setInt(1, id);
                        delete.executeUpdate();
                    }
                        break;
                    default:
                        break;

                }
            }

        }
    }
}
