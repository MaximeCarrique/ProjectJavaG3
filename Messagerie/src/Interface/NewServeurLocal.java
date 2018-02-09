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
    TextField name;
    Text textName;
    TextField ip;
    Text textIp;
    TextField port;
    Text textPort;
    Button accept;
    Serveur newServeur;
    ConnectAPI api;
    ServeurPanel panel;

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        textName = new Text();
        textName.setLayoutX(10);
        textName.setLayoutY(15);
        textName.setText("Nom du Serveur :");
        name = new TextField();
        name.setLayoutX(150);
        name.setLayoutY(0);
        textIp = new Text();
        textIp.setLayoutX(10);
        textIp.setLayoutY(55);
        textIp.setText("Adresse IP du serveur :");
        ip = new TextField();
        ip.setLayoutX(150);
        ip.setLayoutY(40);
        textPort = new Text();
        textPort.setLayoutX(10);
        textPort.setLayoutY(95);
        textPort.setText("Port du serveur :");
        port = new TextField();
        port.setLayoutX(150);
        port.setLayoutY(80);
        accept = new Button();
        accept.setLayoutX(110);
        accept.setLayoutY(130);
        accept.setText("Enregistrer");
        Button setOnAction;
        accept.setOnAction((javafx.event.ActionEvent event) -> {
            MainServeur serveur = new MainServeur();
            try {
                serveur.StartServeur(Integer.parseInt(port.getText()));
                api.AddServeur(Integer.parseInt(port.getText()), name.getText());
                panel.Refresh();
                
            } catch (Exception ex) {
                Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        root.getChildren().add(textName);
        root.getChildren().add(name);
        root.getChildren().add(textIp);
        root.getChildren().add(ip);
        root.getChildren().add(textPort);
        root.getChildren().add(port);
        root.getChildren().add(accept);
        Scene scene = new Scene(root, 300, 160);
        stage.setResizable(false);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
        
    }
    
    NewServeurLocal(ConnectAPI API,ServeurPanel serveur){
        api = API;
        panel = serveur;
    }
    
}
