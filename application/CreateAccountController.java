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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
	@FXML
	private Button backButton;
	
	//Create a list that stores the values of the comboBox
	ObservableList<String> list = FXCollections.observableArrayList("Volunteer", "Organization", "Donor");
		
	//The initialize function runs whenever the createAccountVolunteer.fxml is executed
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//Initialize the comboBox with list
		accountTypeComboBox.setItems(list);	
	}
	
	//Function for when user clicks the create account button
	public void createAccount(ActionEvent event) throws IOException{
		//Before changing pages must make sure the information is valid and update database
				String selected = (String) accountTypeComboBox.getValue();
				int forId = 0;
				
				try {
					
		        }catch (Exception e) {System.out.print(e);}		
				
				try {
					Connection con1 = ConnectionProvider.getCon();
			        Statement stmt1 = con1.createStatement();
			        String sql1 = "Select accountID from accounts";
			        ResultSet rs1 = stmt1.executeQuery(sql1);
			        while (rs1.next()) {
			        	forId = rs1.getInt("accountID") + 1;
			        }
			        
		            Connection con2 = ConnectionProvider.getCon();
		            String sql2 = " insert into accounts (accountID, accountUsername, accountPassword, typeOfAccount)" + " values (?, ?, ?, ?)";
		            
		            PreparedStatement rs2 = con2.prepareStatement(sql2);
		            rs2.setInt (1, forId);
		            rs2.setString (2, usernameField.getText());
		            rs2.setString (3, passwordField.getText());
		            rs2.setString (4, selected);
		            rs2.execute();
		            con2.close();

		        }catch (Exception e) {System.out.print(e);}
				
		MainController m = new MainController();
		m.changeScene("loginUpdated.fxml");
	}	
	
	public void back(ActionEvent event) throws IOException{
		MainController m = new MainController();
		m.changeScene("loginUpdated.fxml");
	}
}
