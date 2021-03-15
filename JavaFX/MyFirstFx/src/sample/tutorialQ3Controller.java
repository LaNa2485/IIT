package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class tutorialQ3Controller {
    @FXML
    private Label txtTotal;
    @FXML
    private TextField getNum1;
    @FXML
    private TextField getNum2;
    @FXML
    public void printTotal() {
        int num1 = Integer.parseInt(getNum1.getText());
        int num2 = Integer.parseInt(getNum2.getText());
        int total = num1 + num2;
        txtTotal.setText("The total is "+ total);
    }
    @FXML
    public void clearAll() {
        getNum1.setText("");
        getNum2.setText("");
        txtTotal.setText("");
    }

}
