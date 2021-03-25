package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class tutorialQ1Controller {
    @FXML
    private Label lblHelloName;

    @FXML
    private TextField getName;

    @FXML
    public void printHelloName() {
        String name = getName.getText();
        if(name != "") {
            lblHelloName.setText("Hello "+getName.getText());
        }
        else{
            lblHelloName.setText(("Please enter your name"));
        }


    }

    @FXML
    public void clearAllText() {
        lblHelloName.setText("");
        getName.setText("");
    }
}
