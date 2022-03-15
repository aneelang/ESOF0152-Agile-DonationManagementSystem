/*Login Controller class
 * Controls the actions of the login.fxml file
*/
package application;

import javafx.fxml.FXML;
import javafx.fxml.*;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import java.io.IOException;

public class LoginController {

	public LoginController() {
		
	}
	
	//Create connections to the FXML instances
	@FXML
	private Button loginButton;
	@FXML
	private Button createAccountButton;
	@FXML
	private TextField emailAddressField;
	@FXML
	private PasswordField passwordField;
	
	
	//Function for when user clicks login button
	public void UserLogin(ActionEvent event) throws IOException{
		//Check if login credentials are correct if they are then take user to their home page
	}
	
	//Function for when user clicks create account button
	public void UserCreateAccount(ActionEvent event) throws IOException{
		//User is sent to create account volunteer by default
		Main m = new Main();
		m.changeScene("createAccountVolunteer.fxml");
	}
}

