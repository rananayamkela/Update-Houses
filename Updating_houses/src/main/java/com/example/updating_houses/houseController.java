package com.example.updating_houses;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class houseController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}