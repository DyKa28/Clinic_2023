package com.example.demo4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("BenhNhan.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("BenhNhan.css").toExternalForm());
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}