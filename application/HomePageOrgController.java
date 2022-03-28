package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class HomePageOrgController {
	   @FXML
	    private Label helloMessageLabel;

	    @FXML
	    private ImageView logoImage;

	    @FXML
	    private Pane mainPane;

	    @FXML
	    private Pane userLeftPane;
	   

	    @FXML
	    void logOutFromAccount(ActionEvent event) throws IOException{
	    	MainController m = new MainController();
			m.changeScene("loginUpdated.fxml");
	    }
	    
	    public void seeDonation(ActionEvent event) throws IOException{
	    	MainController m = new MainController();
			m.changeScene("seeDonationOrg.fxml");
	    } 
	    
	    public void seeVolunteer(ActionEvent event) throws IOException{
	    	MainController m = new MainController();
			m.changeScene("seeVolunteerOrg.fxml");
	    }  
	    
	    public void itemRequest(ActionEvent event) throws IOException{
	    	MainController m = new MainController();
			m.changeScene("ItemRequestOrg.fxml");
	    }  
	    public void editOrg(ActionEvent event) throws IOException{
	    	MainController m = new MainController();
			m.changeScene("EditOrg.fxml");
	    }  
}
