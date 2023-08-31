import java.sql.*;

public class DB_EX2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       
        String dbName="products_db2";
        String checkDb = "SELECT SCHEMA_NAME FROM information_schema.SCHEMATA WHERE SCHEMA_NAME ='" + dbName + "'";
        
        Class.forName("cdata.jdbc.mysql.MySQLDriver");
        
        String url="jdbc:mysql:Server=192.168.1.12";
        
        String user="root";
        
        String pwd="root";
        
        Connection conn = DriverManager.getConnection(url,user,pwd);
        
       
        Statement stmt=conn.createStatement();
        
        System.out.println("connected");
        
        System.out.println("Satement completed");
        ResultSet rs=null;
        
        boolean dbFound=false;
        rs = stmt.executeQuery(checkDb);
        
            System.out.println("Result set Value "+ rs.next());
            
            if(!dbFound){
                
                String createNewDatabase="CREATE DATABASE IF NOT EXISTS "+dbName+"";
                
                System.out.println("Database creation query _ "+createNewDatabase);
                
                int createdb=stmt.executeUpdate(createNewDatabase);
                
                System.out.println(dbName+"Created Successfully");
            }
    while(rs.next()){
        System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+rs.getFloat(3)+rs.getInt(4) );
    } 
    conn.close();
    }
    
}
