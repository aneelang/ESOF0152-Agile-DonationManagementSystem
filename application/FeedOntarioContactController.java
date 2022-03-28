package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class FeedOntarioContactController {
	
	@FXML
	private Button backButton;
	
	
	public void back(ActionEvent event) throws IOException{
		System.out.println("Working");
		MainController m = new MainController();
		m.changeScene("FeedOntarioDonationListPage.fxml");
	}
}
