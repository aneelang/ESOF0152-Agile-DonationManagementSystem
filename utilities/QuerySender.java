package utilities;
import java.sql.Connection;


import Models.*;
import Models.User;
import java.util.*;
import java.sql.*;


/**
*
* All types of queries that Clients may request
*/
public class QuerySender {
	
	//sample function
	public static String RegisterUser(User ur)
	{
		//return verification or error string?
		String verify="";
		
		try{
            Connection con=ConnectionProvider.getCon();
            System.out.println("Connected to Microsft SQL SERVER:Registering user..");
            
            //query statement
            PreparedStatement myStmt= con.prepareStatement("check if user exist?");
           
            //get query result
            ResultSet res = myStmt.executeQuery();
            if(!res.next()){
                con.close();
                return "invalidID";
            }
        }
         catch(SQLException ex) 
        {
            System.out.println("Error: User registration(1)..");
            ex.printStackTrace();
            return "error";
        }
		
		//if it gets here, everything is good
        return verify;
	}
	
	
	//add other functions for queries like modify user, volunteer apply for org,  add volunteer to org, etc.
}
