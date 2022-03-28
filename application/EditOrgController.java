package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EditOrgController {

	//Create connections to the FXML instances
		@FXML
		private Button submit;
		@FXML
		private Button uploadButton;
		@FXML
		private Button backButton;
		
		//Let user upload a picture
		public void uploadPicture(ActionEvent event) throws IOException{
			
		}
		
		//Sumbit the edit org request
		public void submit(ActionEvent event) throws IOException{
			MainController m = new MainController();
			m.changeScene("HomePageOrganization.fxml");
		}
		
		public void back(ActionEvent event) throws IOException{
			MainController m = new MainController();
			m.changeScene("HomePageOrganization.fxml");
		}
}
