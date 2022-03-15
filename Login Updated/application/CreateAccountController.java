/*Create Account Volunteer Controller class
 * Controls the actions of the createAccount.fxml file
 * Makes and account with Username, Password, and type of account (Volunteer or Organization)
*/
package application;

import javafx.fxml.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CreateAccountController implements Initializable{

	public CreateAccountController() {
		
	}
	
	//Create connections to the FXML instances
	@FXML
	private TextField usernameField;
	@FXML
	private TextField passwordField;
	@FXML
	public ComboBox<String> accountTypeComboBox;
	@FXML
	private Button createAccountButton;
	
	//Create a list that stores the values of the comboBox
	ObservableList<String> list = FXCollections.observableArrayList("Volunteer", "Organization");
		
	//The initialize function runs whenever the createAccountVolunteer.fxml is executed
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//Initialize the comboBox with list
		accountTypeComboBox.setItems(list);	
	}
	
	//Function for when user clicks the create account button
	public void createAccount(ActionEvent event) throws IOException{
		//Before changing pages must make sure the information is valid and update database
		MainController m = new MainController();
		m.changeScene("login.fxml");
	}	
}
