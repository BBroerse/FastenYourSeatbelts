/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author jandorresteijn
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try {            
            BorderPane root = FXMLLoader.load(getClass().getResource("/views/Login.fxml"));            
            primaryStage.setScene(new Scene(root, 320, 400));
            primaryStage.setResizable(false);            
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    } 
}