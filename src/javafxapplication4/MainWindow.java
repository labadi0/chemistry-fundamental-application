/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.stage.Modality;
import javafx.stage.Stage;
//import javafx.stage.WindowEvent;

/**
 * cette classe  qui ouvre ihm graphique et fait appel au FXMLDocuement.fxml .
 * contient le jFrame qui est stage en javaFX  et elle fait appel au jPanel  qui est scene en JavaFX
 * 
 */
public class MainWindow extends Application {
    
    public static boolean isSplashloeaded = false ; 
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("chemistry application");
        stage.setScene(scene);
        stage.show();
       
      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
