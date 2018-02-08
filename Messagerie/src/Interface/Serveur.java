/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javafx.scene.Group;
import javafx.scene.text.Text;

/**
 *
 * @author artde
 */
public class Serveur {
    
    String name;
    int id;
    Text nameServeur;
    Group root;
    
    
    Serveur(String nom, int Id){
        name = nom;
        id = Id;
        root = new Group();
        nameServeur = new Text();
        nameServeur.setText(name);
        root.getChildren().add(nameServeur);
        
    }
    
}
