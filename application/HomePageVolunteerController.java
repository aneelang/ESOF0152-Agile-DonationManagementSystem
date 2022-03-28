package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class HomePageVolunteerController {
	   @FXML
	    private Button registrationButton;
	   @FXML
	    private Button logoutButton;
	   @FXML
	    private Button availabilityButton;
	   @FXML
	    private Button editAccountButton;

	   
	    public void resgister(ActionEvent event) throws IOException{
	    	MainController m = new MainController();
			m.changeScene("volunteerRegistration.fxml");
	    }
	    
	    public void availability(ActionEvent event) throws IOException{
	    	MainController m = new MainController();
			m.changeScene("ModifyAvailabilityPage.fxml");
	    }
	    
	    public void editAccount(ActionEvent event) throws IOException{
	    	MainController m = new MainController();
			m.changeScene("modifyAccountDetailsPage.fxml");
	    }
	    
	    public void logOutFromAccount(ActionEvent event) throws IOException{
	    	MainController m = new MainController();
			m.changeScene("loginUpdated.fxml");
	    }
}
