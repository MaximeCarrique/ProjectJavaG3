/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author artde
 */
public class AjoutServeur  extends Application{
    Text ajoutText;
    Button localBtn;
    Button existantBtn;
    
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        ajoutText = new Text();
        ajoutText.setLayoutX(5);
        ajoutText.setLayoutY(50);
        ajoutText.setText("Voulez crée votre serveur ou rejoindre un serveur existant ?");
        localBtn = new Button();
        localBtn.setLayoutX(5);
        localBtn.setLayoutY(100);
        localBtn.setText("local");
        Button setOnAction;
        localBtn.setOnAction((javafx.event.ActionEvent event) -> {
            System.out.println("Serveur local");
            stage.close();
        });
        existantBtn = new Button();
        existantBtn.setLayoutX(250);
        existantBtn.setLayoutY(100);
        existantBtn.setText("Existant");
        existantBtn.setOnAction((event) ->{
            System.out.println("Serveur existant");
            stage.close();
        });
        
        
        root.getChildren().add(ajoutText);
        root.getChildren().add(localBtn);
        root.getChildren().add(existantBtn);
        Scene scene = new Scene(root, 310, 150);
        stage.setResizable(false);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
        
    }
}
