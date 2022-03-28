package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ModifyAvailabilityController {

	//Create connections to the FXML instances
		@FXML
		private Button makeChangesButton;
		@FXML
		private Button backButton;
		
		
		public void makeChanges(ActionEvent event) throws IOException{
			MainController m = new MainController();
			m.changeScene("HomePageVolunteer.fxml");
		}
		
		public void back(ActionEvent event) throws IOException{
			MainController m = new MainController();
			m.changeScene("HomePageVolunteer.fxml");
		}
}
