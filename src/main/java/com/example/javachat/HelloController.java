package com.example.javachat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    TextArea messageField;

    @FXML
    TextField textField;

    public void sendMsg(ActionEvent actionEvent) {
       if (textField.getText().trim().length() > 0) {
           messageField.appendText(textField.getText() + "\n");
           textField.setText("");
           textField.requestFocus();
       }
    }
}