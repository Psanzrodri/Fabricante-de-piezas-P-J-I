package com.example.sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {
    private Stage primaryStage;

    public Main() {
        primaryStage = new Stage();
    }

    @Override
    public void start(Stage primaryStage) throws IOException{
        this.primaryStage = primaryStage;
        mostrarVentanaPricinpal();
        //mostrarVentanaSecundaria();
    }

    public void mostrarVentanaPricinpal() throws IOException{
        FXMLLoader root = new FXMLLoader(LoginController.class.getResource("hello-view.fxml"));
        Scene secene = new Scene(root.load(),720, 500);
        primaryStage.setScene(secene);
        primaryStage.show();
    }

    public void mostrarVentanaSecundaria() throws IOException{
        FXMLLoader root = new FXMLLoader(Pedidos.class.getResource("pedidos.fxml"));
        Scene secene = new Scene(root.load(),720, 500);
        primaryStage.setScene(secene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}