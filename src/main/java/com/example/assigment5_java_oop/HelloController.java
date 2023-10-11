package com.example.assigment5_java_oop;

import com.example.calculatorapp.Calculator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    com.example.calculatorapp.Calculator calc = new Calculator();    // object of the Calculator class

    @FXML
    private TextField input;    // variable is connected with the TextField where the result will show

    // this method will show in the TextField a number that user will press
    @FXML
    private void onNumberClick(ActionEvent event){
        String val = ((Button)event.getSource()).getText();
        String inval = input.getText();
        input.setText(inval + val);
    }

    // this method will show in the TextField a operator that user will press
    // here we store a operator that user pressed with setOperator
    // here we store a number that user first pressed with setOp1
    @FXML
    private void onOperatorClick(ActionEvent event){
        String val = ((Button)event.getSource()).getText();
        calc.setOperator(val);
        double d = Double.parseDouble(input.getText());
        calc.setOp1(d);
        input.setText("");
    }

    // this method will calculate and show the result in the TextField
    // statement will handle with double and int
    @FXML
    private void onEqualButtonClick() {
        double result = calc.calculator(calc.getOp1(), Double.parseDouble(input.getText()), calc.getOperator());

        if (calc.getOperator().equals("/")) {
            input.setText(String.valueOf(result));
        } else {
            input.setText(String.valueOf((int) result));
        }
    }

    // this method will clear the TextField
    @FXML
    private void onClearButtonClick(){
        input.setText("");
        calc.setOp1(0);
    }

}