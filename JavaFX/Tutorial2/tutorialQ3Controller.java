package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("The total is " + total);
        alert.setTitle("The Total");
        alert.show();
    }
    @FXML
    public void clearAll() {
        getNum1.setText("");
        getNum2.setText("");
        txtTotal.setText("");
    }

}
@FXML
    public void enterZero() {
        if (outputInterface) {
            outputInterface.setText(outputInterface + "0");
        }
        else {
            outputInterface.setText("0");
        }
    }
https://zoom.us/j/95099091814?pwd=SzdKOWtRakM0akFDdnVPZTRZOW5vdz09

package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    private TextField outputInterface;

    @FXML
    public void clearOutputInterface() {
        outputInterface.setText("");
    }
    @FXML
    public void enterZero() {
        if (outputInterface.getText() != "0") {
            outputInterface.setText(outputInterface.getText() + "0");
        }
        else {
            outputInterface.setText("0");
        }
    }
    @FXML
    public void enterOne() {
        if (outputInterface.getText() != "0") {
            outputInterface.setText(outputInterface.getText() + "1");
        }
        else {
            outputInterface.setText("1");
        }
    }
    @FXML
    public void enterTwo() {
        if (outputInterface.getText() != "0") {
            outputInterface.setText(outputInterface.getText() + "2");
        }
        else {
            outputInterface.setText("2");
        }
    }
    @FXML
    public void enterThree() {
        if (outputInterface.getText() != "0") {
            outputInterface.setText(outputInterface.getText() + "3");
        }
        else {
            outputInterface.setText("3");
        }
    }
    @FXML
    public void enterFour() {
        if (outputInterface.getText() != "0") {
            outputInterface.setText(outputInterface.getText() + "4");
        }
        else {
            outputInterface.setText("4");
        }
    }
    @FXML
    public void enterFive() {
        if (outputInterface.getText() != "0") {
            outputInterface.setText(outputInterface.getText() + "5");
        }
        else {
            outputInterface.setText("5");
        }
    }
    @FXML
    public void enterSix() {
        if (outputInterface.getText() != "0") {
            outputInterface.setText(outputInterface.getText() + "6");
        }
        else {
            outputInterface.setText("6");
        }
    }
    @FXML
    public void enterSeven() {
        if (outputInterface.getText() != "0") {
            outputInterface.setText(outputInterface.getText() + "7");
        }
        else {
            outputInterface.setText("7");
        }
    }
    @FXML
    public void enterEight() {
        if (outputInterface.getText() != "0") {
            outputInterface.setText(outputInterface.getText() + "8");
        }
        else {
            outputInterface.setText("8");
        }
    }
    @FXML
    public void enterNine() {
        if (outputInterface.getText() != "0") {
            outputInterface.setText(outputInterface.getText() + "9");
        }
        else {
            outputInterface.setText("9");
        }
    }
    @FXML
    public void enterAdd() {
        if (outputInterface.getText() != "") {
            outputInterface.setText(outputInterface.getText() + "+");
        }
        else {
            outputInterface.setText("");
        }
    }
    @FXML
    public void enterSubtract() {
        if (outputInterface.getText() != "") {
            outputInterface.setText(outputInterface.getText() + "-");
        }
        else {
            outputInterface.setText("");
        }
    }
    @FXML
    public void enterMultiply() {
        if (outputInterface.getText() != "") {
            outputInterface.setText(outputInterface.getText() + "*");
        }
        else {
            outputInterface.setText("");
        }
    }
    @FXML
    public void enterDivide() {
        if (outputInterface.getText() != "") {
            outputInterface.setText(outputInterface.getText() + "/");
        }
        else {
            outputInterface.setText("");
        }
    }
 
}
