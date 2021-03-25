package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Scanner;

public class tutorialQ2Controller {
    @FXML
    private Label lblOutput;

    @FXML
    public void getCommandLineText() {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        if(inputText != "") {
            lblOutput.setText("You typed " + inputText + " on the command line.");
        }
        else {
            lblOutput.setText("Please enter text on the command line.");
        }
    }
    @FXML
    public void giveCommandLineText() {
        System.out.println("The command line got back " + "'" + lblOutput.getText() + "'");
    }
}
