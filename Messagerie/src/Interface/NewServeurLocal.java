/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import serveur.MainServeur;

/**
 *
 * @author artde
 */
public class NewServeurLocal extends Application {
    TextField ip;
    Text textIp;
    TextField port;
    Text textPort;
    Button accept;

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        textIp = new Text();
        textIp.setLayoutX(10);
        textIp.setLayoutY(15);
        textIp.setText("Adresse IP du serveur :");
        ip = new TextField();
        ip.setLayoutX(150);
        ip.setLayoutY(0);
        textPort = new Text();
        textPort.setLayoutX(10);
        textPort.setLayoutY(55);
        textPort.setText("Port du serveur :");
        port = new TextField();
        port.setLayoutX(150);
        port.setLayoutY(40);
        accept = new Button();
        accept.setLayoutX(110);
        accept.setLayoutY(90);
        accept.setText("Enregistrer");
        Button setOnAction;
        accept.setOnAction((javafx.event.ActionEvent event) -> {
            MainServeur serveur = new MainServeur();
            try {
                serveur.StartServeur(port.getText());
            } catch (Exception ex) {
                Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        root.getChildren().add(textIp);
        root.getChildren().add(ip);
        root.getChildren().add(textPort);
        root.getChildren().add(port);
        root.getChildren().add(accept);
        Scene scene = new Scene(root, 300, 120);
        stage.setResizable(false);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
        
    }
    
}
