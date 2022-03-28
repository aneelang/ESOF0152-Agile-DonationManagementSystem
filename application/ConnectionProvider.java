package application;
import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon() {
    //add database info here
    String url="jdbc:mysql://localhost:3306/databaseforagileproject";
    String user="root";
    String password="";
      try{
           Connection connection = DriverManager.getConnection(url,user,password);
           return connection;
      }
      catch(Exception e){
          return null;
      }
    }
}