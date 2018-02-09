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
    Integer id;
    String adresse;
    Integer port;
    boolean admin;
    
    
    Serveur(String nom, int Id, boolean droit){
        name = nom;
        id = Id;
        admin = droit;
        if(admin){
            adresse = "127.0.0.1";
        }
    }
    
}
