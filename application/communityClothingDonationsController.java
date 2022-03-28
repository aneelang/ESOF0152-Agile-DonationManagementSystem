package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class communityClothingDonationsController {
public communityClothingDonationsController() {
		
	}
	
	//Create connections to the FXML instances
	@FXML
	private Button submitButton;
	@FXML
	private Button backButton;
	@FXML
	private Button contactUsButton;
	
	
	public void submit(ActionEvent event) throws IOException{
		MainController m = new MainController();
		m.changeScene("HomePageDonors.fxml");
	}
	
	public void contact(ActionEvent event) throws IOException{
		MainController m = new MainController();
		m.changeScene("CommunityClothingContactPage.fxml");
	}
	
	public void back(ActionEvent event) throws IOException{
		MainController m = new MainController();
		m.changeScene("HomePageDonors.fxml");
	}
}
