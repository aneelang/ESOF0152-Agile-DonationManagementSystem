/*Create Account Volunteer Controller class
 * Controls the actions of the createAccountVolunteer.fxml file
*/
package application;

import javafx.fxml.FXML;
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


public class CreateAccountVolunteerController implements Initializable {

	public CreateAccountVolunteerController() {
		
	}
	
	//Create connections to the FXML instances
	@FXML
	private TextField firstNameField;
	@FXML
	private TextField lastNameField;
	@FXML
	private TextField emailAddressField;
	@FXML
	private PasswordField passwordField;
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
	
	//Function changes page from volunteer to organization page depending on the comboBox selection
	public void comboBoxChanged(ActionEvent event) throws IOException {
		MainController m = new MainController();
		if (accountTypeComboBox.getValue() == "Organization" ) {
			//Change page to organization create account page
			m.changeScene("CreateAccountOrganization.fxml");
		}
		if (accountTypeComboBox.getValue() == "Volunteer" ) {
			//Do nothing
		}
	}
	
	//Function for when user clicks the create account button
	public void createAccount(ActionEvent event) throws IOException{
		//Before changing pages must make sure the information is valid and update database 
		MainController m = new MainController();
		m.changeScene("login.fxml");
	}	
}
