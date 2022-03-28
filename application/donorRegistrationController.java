package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ComboBox;

public class donorRegistrationController implements Initializable{

public donorRegistrationController() {
		
	}
	
	//Create connections to the FXML instances
	@FXML
	private Button submitButton;
	@FXML
	private Button backButton;
	@FXML
	private TextField firstNameField;
	@FXML
	private TextField lastNameField;
	@FXML
	private TextField emailAddressField;
	@FXML
	private TextField cityField;
	@FXML
	private DatePicker birthDatePicker;
	@FXML
	private TextField phoneNumberField;
	@FXML
	private TextField streetAddressField;
	@FXML
	private ComboBox<String> provinceComboBox;
	@FXML
	private TextField unitNumberField;
	@FXML
	private TextField postalCodeField1;
	@FXML
	private TextField postalCodeField2;
	
	ObservableList<String> list = FXCollections.observableArrayList("Alberta", "British Columbia", "Manitoba", "New Brunswick", "Newfoundland", "Northwest Territories", "Nova Scotia", "Nunavut", "Ontario", "PEI", "Quebec", "Saskatchewan", "Yukon");
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//Initialize the comboBox with list
		provinceComboBox.setItems(list);	
		System.out.println("Initialized");
	}
	
	public void submit(ActionEvent event) throws IOException{
		
		LocalDate date = (LocalDate) birthDatePicker.getValue();
		Date birthDate = Date.valueOf(date);
		String province = (String) provinceComboBox.getValue();
		int currentUserID = CurrentUser.getCurrentUser();
		
		int forId = 0;
		
		try {
			
        }catch (Exception e) {System.out.print(e);}		
		
		try {
			Connection con1 = ConnectionProvider.getCon();
	        Statement stmt1 = con1.createStatement();
	        String sql1 = "Select donorID from donors";
	        ResultSet rs1 = stmt1.executeQuery(sql1);
	        while (rs1.next()) {
	        	forId = rs1.getInt("donorID") + 1;
	        }
	        
            Connection con2 = ConnectionProvider.getCon();
            String sql2 = " insert into donors (donorID, accountID, firstName, lastName, emailAddress, city, birthDate, phoneNumber, streeAddress, province, unitNumber, postalCode)" + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement rs2 = con2.prepareStatement(sql2);
            rs2.setInt (1, forId);
            rs2.setInt (2, currentUserID);
            rs2.setString (3, firstNameField.getText());
            rs2.setString (4, lastNameField.getText());
            rs2.setString (5, emailAddressField.getText());
            rs2.setString (6, cityField.getText());
            rs2.setDate (7, birthDate);
            rs2.setString (8, phoneNumberField.getText());
            rs2.setString (9, streetAddressField.getText());
            rs2.setString (10, province);
            rs2.setString (11, unitNumberField.getText());
            rs2.setString (12, (postalCodeField1.getText() + postalCodeField2.getText()));
            
            rs2.execute();
            con2.close();
            
            System.out.println("Registration Complete");

        }catch (Exception e) {System.out.print(e);}
		
		MainController m = new MainController();
		m.changeScene("HomePageDonors.fxml");
	}
	
	public void back(ActionEvent event) throws IOException{
		MainController m = new MainController();
		m.changeScene("HomePageDonors.fxml");
	}
}
