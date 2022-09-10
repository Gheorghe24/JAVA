package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public Label label;
    public TextField t1, t2;

    public void OnClick() {
        label.setText("Sum is : " +( Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText())));
    }
}