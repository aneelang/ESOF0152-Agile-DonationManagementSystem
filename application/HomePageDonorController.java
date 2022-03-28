package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomePageDonorController {
	   @FXML
	    private Button registerButton;
	   @FXML
	    private Button logoutButton;
	   @FXML
	    private Button editAccountButton;
;
	   
	    public void register(ActionEvent event) throws IOException{
	    	MainController m = new MainController();
			m.changeScene("donorRegistration.fxml");
	    }
	    
	    public void donation1(ActionEvent event) throws IOException{
	    	MainController m = new MainController();
			m.changeScene("CommunityClothingDonationListPage.fxml");
	    }
	    
	    public void donation2(ActionEvent event) throws IOException{
	    	MainController m = new MainController();
			m.changeScene("FeedOntarioDonationListPage.fxml");
	    }
	    
	    public void editAccount(ActionEvent event) throws IOException{
	    	MainController m = new MainController();
			m.changeScene("modifyAccountDonor.fxml");
	    }
	    
	    public void logOutFromAccount(ActionEvent event) throws IOException{
	    	MainController m = new MainController();
			m.changeScene("loginUpdated.fxml");
	    }
}
