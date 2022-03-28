package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ModifyAccountDonorController {

	@FXML
	private Button submitButton;
	@FXML
	private Button backButton;
	
	
	public void back(ActionEvent event) throws IOException{
		MainController m = new MainController();
		m.changeScene("HomePageDonors.fxml");
	}
	
	public void submit(ActionEvent event) throws IOException{
		MainController m = new MainController();
		m.changeScene("HomePageDonors.fxml");
	}
}
