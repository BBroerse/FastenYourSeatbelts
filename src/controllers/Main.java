/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

/**
 * FXML Controller class
 *
 * @author jandorresteijn
 */
public class Main implements Initializable {
    
    @FXML private Dashboard dashboardpage;
    @FXML private FoundLuggage lostpage;
    @FXML private LostLuggage foundpage;
    @FXML private User userpage;
    @FXML private Customer customerpage;
    
    @FXML
    private Button myButton; // value will be injected by the FXMLLoader
    
   
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}