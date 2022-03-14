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


public class CreateAccountVolController implements Initializable {

	public CreateAccountVolController() {
		
	}
	
	//Create instances of variables of scene builder
	@FXML
	private Button createAccountButton;
	@FXML
	private TextField firstName;
	@FXML
	private TextField lastName;
	@FXML
	private TextField firstemailAddressName;
	@FXML
	private PasswordField password;
	@FXML
	public ComboBox<String> typeOfAccountBox;
	String choice;
	
	ObservableList<String> list = FXCollections.observableArrayList("Volunteer", "Organization");
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		typeOfAccountBox.setItems(list);	
	}
	
	public void comboChanged(ActionEvent event) throws IOException {
		Main m = new Main();
		if (typeOfAccountBox.getValue() == "Organization" ) {
			System.out.println("Working Organization");
			m.changeScene("CreateAccountOrg.fxml");
		}
		if (typeOfAccountBox.getValue() == "Volunteer" ) {
			System.out.println("Working Volunteer");
		}
	}

	public void createAccount(ActionEvent event) throws IOException{
		Main m = new Main();
		System.out.println("Create Account button working.");
		m.changeScene("Login.fxml");
	}	
}
