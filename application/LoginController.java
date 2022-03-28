/*Login Controller class
 * Controls the actions of the login.fxml file
*/
package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class LoginController {

	public LoginController() {
		
	}
	
	//Create connections to the FXML instances
	@FXML
	private Button loginButton;
	@FXML
	private Button createAccountButton;
	@FXML
	private TextField usernameField;
	@FXML
	private PasswordField passwordField;
	
	
	//Function for when user clicks login button
	public void UserLogin(ActionEvent event) throws IOException{
		//Check if login credentials are correct if they are then take user to their home page
		
		String currentUser = "User";
		
		try {
            Connection con = ConnectionProvider.getCon();
            Statement stmt = con.createStatement();
            String sql = "Select * from accounts where accountUsername='"+usernameField.getText()+"' and accountPassword='"+passwordField.getText()+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next())
            {
            	System.out.println("Login Sucessfull...");
            	
            	int currentUserID = rs.getInt("accountID");
             	currentUser = rs.getString("typeOfAccount");
             	
             	CurrentUser.setCurrentUser(currentUserID);
            }   
            	
            else
                System.out.println("Incorrect Username or Password!");
            con.close();

        }catch (Exception e) {System.out.print(e);}
		
		System.out.println(currentUser);
		
		if(currentUser.equals("Donor"))
		{
			MainController m = new MainController();
			m.changeScene("HomePageDonors.fxml");
			
			
		}
		else if(currentUser.equals("Volunteer"))
		{
			MainController m = new MainController();
			m.changeScene("HomePageVolunteer.fxml");
			
			
		}
		else if(currentUser.equals("Organization"))
		{
			
			MainController m = new MainController();
			m.changeScene("HomePageOrganization.fxml");
			
		}
		else
		{
			System.out.println("Error... Unrecognized User!");
			
		}
	}
	
	//Function for when user clicks create account button
	public void UserCreateAccount(ActionEvent event) throws IOException{
		//User is sent to create account volunteer by default
		MainController m = new MainController();
		m.changeScene("createAccount.fxml");
	}
}

