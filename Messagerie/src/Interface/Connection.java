/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

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
    
    public boolean getConnextion(){
        System.out.println(login);
        System.out.println(password);
        if(login.compareTo("arthur") == 0 && password.compareTo("arthur") == 0 /*&& password == "arthur"*/){
            return true;
        }
        else{
            return false;
        }
    }
    
}
