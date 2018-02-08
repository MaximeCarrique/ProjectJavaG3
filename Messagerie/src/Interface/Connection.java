/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author artde
 */
public class Connection {
    
    String login;
    String password;
    
    Connection(String log, String mdp){
        login = log;
        password = mdp;
    }
    
    public List<Serveur> getConnextion(){
        if(login.compareTo("arthur") == 0 && password.compareTo("arthur") == 0 /*&& password == "arthur"*/){
            List<Serveur> list;
            list = new ArrayList<Serveur>();
            list.add(new Serveur("Serveur1",1));
            list.add(new Serveur("Serveur2",2));
            list.add(new Serveur("Serveur3",3));
            list.add(new Serveur("Serveur4",4));
            list.add(new Serveur("Serveur5",5));
            return list;
        }
        else{
            return null;
        }
    }
    
}
