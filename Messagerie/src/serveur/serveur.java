/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveur;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author artde
 */
public class serveur {
    
    private int port;
    List<ConnectedClients> clients;
    
    serveur(int ports) throws IOException{
        this.port = ports;
        clients = new ArrayList<ConnectedClients>();
        Thread threadConnection = new Thread(new Connection(this));
        threadConnection.start();
    }
    
    public void SetPort(int p){
        port = p;
    }
    
    public int GetPort(){
        return port;
    }
    
    public void addClient(ConnectedClients newClient){
        for (ConnectedClients client : clients) {
            client.sendMessage("Le client "+newClient.getId()+" vient de se connecter");
        }
        this.clients.add(newClient);
    }
    
    public void  broadcastMessage(String m, int id) {
        for (ConnectedClients client : clients) {
            if (client.getId() != id) {
                client.sendMessage("Message de "+id+" : "+m);
            }
        }
    }
    
    public void disconnectedClient(ConnectedClients discClient) throws IOException{
        discClient.closeClient();
        for (ConnectedClients client : clients) {
            client.sendMessage("Le client "+discClient.getId()+" nous a quitté");
        }
    }
}
