/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
/**
 * 
 *
 * @author artde
 */
public class ConnectAPI {
    
    String login;
    String password;
    List<Serveur> list;
    
    
    ConnectAPI(String log, String mdp){
        login = log;
        password = mdp;
        list = new ArrayList<Serveur>();
        list.add(new Serveur("Serveur1",1,false));
        list.add(new Serveur("Serveur2",2,false));
        list.add(new Serveur("Serveur3",3,false));
        list.add(new Serveur("Serveur4",4,false));
        list.add(new Serveur("Serveur5",5,false));
            
    }
    
    public List<Serveur> getConnextion(){
        if(login.compareTo("arthur") == 0 && password.compareTo("arthur") == 0 /*&& password == "arthur"*/){
            return list;
        }
        else{
            return null;
        }
    }
    
    public void AddServeur(int port, String name){
        list.add(new Serveur(name,6,true));
        System.out.println("Serveur bien ajouter");
    }
    
}
