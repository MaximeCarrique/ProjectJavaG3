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
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.BorderFactory;

/**
 *
 * @author artde
 */
public class ServeurPanel extends Application{
    
    List<Serveur> list;
    Text nameServeur;
    Text idServeur;
    Button joinServeur;
    Button addServeur;
    ConnectAPI api;
    
    
    @Override
    public void start(Stage stage) throws Exception {
        
        LoginPanel loginPanel = new LoginPanel();
        Group root = new Group();
        FlowPane serveurList;
        int y = 0;
        for (Serveur serveur : list){
            serveurList = new FlowPane(50,50);
            nameServeur = new Text();
            nameServeur.setLayoutX(10);
            nameServeur.setLayoutY(10);
            idServeur = new Text();
            idServeur.setLayoutX(10);
            idServeur.setLayoutY(30);
            joinServeur = new Button();
            joinServeur.setLayoutX(100);
            joinServeur.setLayoutY(10);
            joinServeur.setText("Rejoindre");
            idServeur.setText(serveur.id.toString());
            nameServeur.setText(serveur.name);
            serveurList.setLayoutX(0);
            serveurList.setLayoutY(y);
            y = y +35;
            serveurList.getChildren().add(nameServeur);
            serveurList.getChildren().add(idServeur);
            serveurList.getChildren().add(joinServeur);
            
            serveurList.setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            root.getChildren().add(serveurList);
        }
        addServeur = new Button();
        addServeur.setLayoutX(10);
        addServeur.setLayoutY(y);
        addServeur.setText("Ajouter un serveur");
        
        Button setOnAction;
        addServeur.setOnAction((javafx.event.ActionEvent event) -> {
            NewServeurLocal Ajout = new NewServeurLocal(api,this);
            Stage stageAjout = new Stage();
            try {
                Ajout.start(stageAjout);
                stage.close();
            } catch (Exception ex) {
                Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        root.getChildren().add(addServeur);
        //root.getChildren().add(loginPanel);
        Scene scene = new Scene(root, 250, y +35);
        stage.setResizable(false);
        stage.setTitle("List des serveur");
        stage.setScene(scene);
        stage.show();
        
    }
    
    ServeurPanel(List<Serveur> List, ConnectAPI API){
        list = List;
        api = API;
    }
    
    public void Refresh() throws Exception{
        Stage stage = new Stage();
        start(stage);
    }
}
