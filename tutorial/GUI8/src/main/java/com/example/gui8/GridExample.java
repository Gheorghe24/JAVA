package com.example.gui8;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class GridExample extends Application {
    Stage window ;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        window = stage;
        window.setTitle("Login Form");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        //Name label
        Label nameLabel = new Label("Username");
        GridPane.setConstraints(nameLabel, 0, 0);

        //Name input
        TextField nameField = new TextField("George");
        GridPane.setConstraints(nameField, 1, 0);

        //Password label
        Label passLabel = new Label("Password");
        GridPane.setConstraints(passLabel, 0, 1);

        //Name input
        TextField passField = new TextField();
        passField.setPromptText("hint");
        GridPane.setConstraints(passField, 1, 1);

        Button loginButton = new Button();
        loginButton.setText("Log In");
        GridPane.setConstraints(loginButton, 1, 2);
        loginButton.setOnAction(e-> System.out.println(nameField.getText() + " " + passField.getText()));

        CheckBox box = new CheckBox("select me");
        GridPane.setConstraints(box, 0, 2);

        grid.getChildren().addAll(nameLabel,nameField, passLabel, passField, loginButton, box);

        Scene scene = new Scene(grid, 300, 200);
        window.setScene(scene);
        window.show();
    }


}