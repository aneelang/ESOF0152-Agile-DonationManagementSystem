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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.CheckBox;

public class volunteerRegController implements Initializable{

	public volunteerRegController() {
		
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
	private TextField streetAddressField;
	@FXML
	private TextField cityField;
	@FXML
	private DatePicker birthDatePicker;
	@FXML
	private TextField phoneNumberField;
	@FXML
	private ComboBox<String> provinceComboBox;
	@FXML
	private TextField unitNumberField;
	@FXML
	private TextField postalCodeField1;
	@FXML
	private TextField postalCodeField2;
	@FXML
	private TextArea experienceTextArea;
	@FXML
	private TextArea coverLetterTextArea;
	@FXML
	private ComboBox<String> availabilityDaysComboBox;
	@FXML
	private CheckBox validLicenseCheckBox;
	@FXML
	private CheckBox haveCarCheckBox;
	@FXML
	private CheckBox morningsCheckBox;
	@FXML
	private CheckBox afternoonsCheckBox;
	@FXML
	private CheckBox eveningsCheckBox;
	@FXML
	private CheckBox weekendsCheckBox;
	
	ObservableList<String> list = FXCollections.observableArrayList("Alberta", "British Columbia", "Manitoba", "New Brunswick", "Newfoundland", "Northwest Territories", "Nova Scotia", "Nunavut", "Ontario", "PEI", "Quebec", "Saskatchewan", "Yukon");
	ObservableList<String> list1 = FXCollections.observableArrayList("Once a Week", "More than Once a Week", "One Time Only", "As Needed", "Other");
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//Initialize the comboBox with list
		provinceComboBox.setItems(list);
		availabilityDaysComboBox.setItems(list1);
		System.out.println("Initialized");
	}
	
	public void submit(ActionEvent event) throws IOException{
		
	if(validLicenseCheckBox.isSelected() && haveCarCheckBox.isSelected())
	{
		LocalDate date = (LocalDate) birthDatePicker.getValue();
		Date birthDate = Date.valueOf(date);
		String province = (String) provinceComboBox.getValue();
		String availableDays = (String) availabilityDaysComboBox.getValue();
		int currentUserID = CurrentUser.getCurrentUser();
		int forId = 0;
		String availabilityHours = "";
		

		if(morningsCheckBox.isSelected())
		{
			availabilityHours = availabilityHours + " Mornings Mon-Fri,";
		}
		if(afternoonsCheckBox.isSelected())
		{
			availabilityHours = availabilityHours + " Afternoons Mon-Fri,";
		}
		if(eveningsCheckBox.isSelected())
		{
			availabilityHours = availabilityHours + " Evenings Mon-Fri,";
		}
		if(weekendsCheckBox.isSelected())
		{
			availabilityHours = availabilityHours + " Weekends";
		}
		
		System.out.println(availabilityHours);
				
		try {
			
        }catch (Exception e) {System.out.print(e);}		
		
		try {
			Connection con1 = ConnectionProvider.getCon();
	        Statement stmt1 = con1.createStatement();
	        String sql1 = "Select volunteerID from volunteers";
	        ResultSet rs1 = stmt1.executeQuery(sql1);
	        while (rs1.next()) {
	        	forId = rs1.getInt("volunteerID") + 1;
	        }
	        
            Connection con2 = ConnectionProvider.getCon();
            String sql2 = " insert into volunteers (volunteerID, accountID, firstName, lastName, volunteerEmail, streetAddress, unitNumber, city, province, postalCode, birthDate, volunteerPhoneNumber, availabilityDaysOfWeek, availabilityHours)" + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";        
            PreparedStatement rs2 = con2.prepareStatement(sql2);
            
            rs2.setInt (1, forId);
            rs2.setInt (2, currentUserID);
            rs2.setString (3, firstNameField.getText());
            rs2.setString (4, lastNameField.getText());
            rs2.setString (5, emailAddressField.getText());
            rs2.setString (6, streetAddressField.getText());
            rs2.setString (7, unitNumberField.getText());
            rs2.setString (8, cityField.getText());
            rs2.setString (9, province);
            rs2.setString (10, (postalCodeField1.getText() + postalCodeField2.getText()));
            rs2.setDate (11, birthDate);
            rs2.setString (12, phoneNumberField.getText());
            rs2.setString (13, availableDays);
            rs2.setString (14, availabilityHours);
            
            rs2.execute();
            con2.close();                          

        }catch (Exception e) {System.out.print(e);}
		
		System.out.println("Working");
		MainController m = new MainController();
		m.changeScene("HomePageVolunteer.fxml");
	}
	else
	{
		System.out.println("Volunteers must have a valid license and a vehicle...");
	}

	}
	
	public void back(ActionEvent event) throws IOException{
		MainController m = new MainController();
		m.changeScene("HomePageVolunteer.fxml");
	}
}
