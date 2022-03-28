package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class SeeVolunteerOrgController  implements Initializable {
	 	
	@FXML
	    private Button logoutButton;
	   @FXML
	    private TableView<HelperClassVolunteerTable> volunteerTable;
	   @FXML
	    private TableColumn<HelperClassVolunteerTable, String> firstName;
	   @FXML
	    private TableColumn<HelperClassVolunteerTable, String> lastName;
	   @FXML
	    private TableColumn<HelperClassVolunteerTable, String> postalCode;
	   @FXML
	    private TableColumn<HelperClassVolunteerTable, String> phoneNumber;
	   @FXML
		public ComboBox<String> selectComboBox;
	   
	   
	   //Use helper class to add to table
	   public ObservableList<HelperClassVolunteerTable> list = FXCollections.observableArrayList(
			   new HelperClassVolunteerTable("Angel","Mar","P7B5E1","807-312-1232"),
			   new HelperClassVolunteerTable("Shane","V","P7B5E1","807-312-1232")
			   );
	   
	   //Fill the table at start of program
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			firstName.setCellValueFactory(new PropertyValueFactory<HelperClassVolunteerTable, String>("firstName"));
			lastName.setCellValueFactory(new PropertyValueFactory<HelperClassVolunteerTable, String>("lastName"));
			postalCode.setCellValueFactory(new PropertyValueFactory<HelperClassVolunteerTable, String>("postalCode"));
			phoneNumber.setCellValueFactory(new PropertyValueFactory<HelperClassVolunteerTable, String>("phoneNumber"));
			volunteerTable.setItems(list); 
		}
	   
	   public void back(ActionEvent event) throws IOException{
	    	MainController m = new MainController();
			m.changeScene("HomePageOrganization.fxml");
	    }
	   
	 public void logOutFromAccount(ActionEvent event) throws IOException{
	    	MainController m = new MainController();
			m.changeScene("loginUpdated.fxml");
	    }


}
