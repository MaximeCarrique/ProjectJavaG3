/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author artde
 */
public class ServeurListe extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        /*ClientPanel clientPanel = new ClientPanel();
        Group root = new Group();
        root.getChildren().add(clientPanel);
        Scene scene = new Scene(root, 600, 500);
        stage.setTitle("Mon chat");
        stage.setScene(scene);
        stage.show();*/
        
        LoginPanel loginPanel = new LoginPanel();
        Group root = new Group();
        //root.getChildren().add(loginPanel);
        Scene scene = new Scene(root, 250, 300);
        stage.setResizable(false);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
        
    }
    
}
