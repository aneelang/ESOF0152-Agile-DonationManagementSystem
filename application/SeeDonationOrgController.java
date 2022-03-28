package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.ComboBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;

public class SeeDonationOrgController implements Initializable {

	   @FXML
	    private Button logoutButton;
	   @FXML
	    private TableView<HelperClassTable> donationTable;
	   @FXML
	    private TableColumn<HelperClassTable, String> namecol;
	   @FXML
	    private TableColumn<HelperClassTable, String> itemcol;
	   @FXML
	    private TableColumn<HelperClassTable, String> qualitycol;
	   @FXML
		public ComboBox<String> selectComboBox;
	   
	   //public ObservableList<String> column1List;
	   
	   //Adding to table to give an example of how it is done
	   public ObservableList<HelperClassTable> list = FXCollections.observableArrayList(
			   new HelperClassTable("Angel","Water Bottle","Bad"),
			   new HelperClassTable("Shane","Bag","Good")
			   );

	   //When this web page opens it should display all donor in table and donor name is comboBox
	   @Override
		public void initialize(URL arg0, ResourceBundle arg1) {
		   namecol.setCellValueFactory(new PropertyValueFactory<HelperClassTable, String>("name"));
		   itemcol.setCellValueFactory(new PropertyValueFactory<HelperClassTable, String>("item"));
		   qualitycol.setCellValueFactory(new PropertyValueFactory<HelperClassTable, String>("quality"));
		   donationTable.setItems(list);   
		   
		   //Add the names to the combox box so user can see more details about that donation
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
