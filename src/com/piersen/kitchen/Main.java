package com.piersen.kitchen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        FileInputStream inputStream = new FileInputStream("resources/index.fxml");
        Parent parent = (AnchorPane) loader.load(inputStream);

        Scene scene = new Scene(parent);

        stage.setTitle("Pi Kitchen");
        stage.setScene(scene);
        stage.show();
    }
}
