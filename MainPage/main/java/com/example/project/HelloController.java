package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class HelloController {

    @FXML
    private Label helloMessageLabel;

    @FXML
    private ImageView logoImage;

    @FXML
    private Pane mainPane;

    @FXML
    private Pane userLeftPane;

    @FXML
    void logOutFromAccount(ActionEvent event) {
        helloMessageLabel.setText("Genius");
    }



}
