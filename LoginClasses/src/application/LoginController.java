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
	
	//Create instances of variables of scene builder
	@FXML
	private Button loginButton;
	@FXML
	private Button createAccountButton;
	@FXML
	private TextField emailAddressText;
	@FXML
	private PasswordField passwordText;
	
	//Function when user clicks login button
	public void userLogin(ActionEvent event) throws IOException{
		System.out.println("Login button working.");
	}
	
	public void createAccount(ActionEvent event) throws IOException{
		Main m = new Main();
		System.out.println("Create account button working.");
		m.changeScene("createAccountVolunteer.fxml");
	}
}

