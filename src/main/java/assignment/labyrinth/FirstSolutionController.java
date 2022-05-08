package assignment.labyrinth;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FirstSolutionController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}