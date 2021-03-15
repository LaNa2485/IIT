package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class tutorialQ1Controller {
    @FXML
    private Label txtHelloWorld;

    @FXML
    private TextField getName;

    @FXML
    public void printHelloWorld() {
        txtHelloWorld.setText("Hello "+getName.getText());
    }

    @FXML
    public void clearAllText() {
        txtHelloWorld.setText("");
        getName.setText("");
    }
}
