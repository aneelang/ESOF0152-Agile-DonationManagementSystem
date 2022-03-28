package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ItemRequestOrgController {
	
	@FXML
	private Button logoutButton;
	@FXML
	private Button backButton;
	
	
	public void logOutFromAccount(ActionEvent event) throws IOException{
		MainController m = new MainController();
		m.changeScene("loginUpdated.fxml");
	}
	
	public void back(ActionEvent event) throws IOException{
		MainController m = new MainController();
		m.changeScene("HomePageOrganization.fxml");
	}
}
