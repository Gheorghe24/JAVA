package com.example.gui8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class TreeViewExample extends Application {
    Stage window ;
    TreeView<String> tree ;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        window = stage;
        window.setTitle("TreeView Form");


        TreeItem<String> root, bucky, megan;

        // Root
        root = new TreeItem<>();
        root.setExpanded(true);

        // Bucky
        bucky = makeBranch("Bucky", root);
        makeBranch("mee", bucky);
        makeBranch("yeee", bucky);
        makeBranch("chicken", bucky);

        //Megan
        megan = makeBranch("Megan", root);
        makeBranch("oooo", megan);
        makeBranch("boy", megan);
        makeBranch("girl", megan);

        tree = new TreeView<>(root);
        tree.setShowRoot(false);


        StackPane layout = new StackPane();
        layout.getChildren().add(tree);

        Scene scene = new Scene(layout, 300, 200);
        window.setScene(scene);
        window.show();
    }

    public TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }


}

