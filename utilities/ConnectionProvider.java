package utilities;
import java.sql.*;

public class ConnectionProvider {
	public static Connection getCon(String url, String user, String password) {
      try{
           Connection connection = DriverManager.getConnection(url,user,password);
           return connection;
      }
      catch(Exception e){
          return null;
      }
	}
}
