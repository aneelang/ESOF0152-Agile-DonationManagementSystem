package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CommunityClothingContactController {

	@FXML
    private Button BackButton;


    public void back(ActionEvent event) throws IOException{
        System.out.println("Working");
        MainController m = new MainController();
        m.changeScene("CommunityClothingDonationListPage.fxml");
    }
}
