/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.List;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author artde
 */
public class ServeurPanel extends Application{
    
    List<Serveur> list;
    Text nameServeur;
    Text idServeur;
    
    
    @Override
    public void start(Stage stage) throws Exception {
        
        LoginPanel loginPanel = new LoginPanel();
        Group root = new Group();
        int y = 10;
        for (Serveur serveur : list){
            nameServeur = new Text();
            nameServeur.setLayoutX(1);
            nameServeur.setLayoutY(y);
            y = y +20;
            nameServeur.setText(serveur.name);
            root.getChildren().add(nameServeur);
        }
        //root.getChildren().add(loginPanel);
        Scene scene = new Scene(root, 250, 300);
        stage.setResizable(false);
        stage.setTitle("List des serveur");
        stage.setScene(scene);
        stage.show();
        
    }
    
    ServeurPanel(List<Serveur> List){
        list = List;
    }
    
    
    
}
