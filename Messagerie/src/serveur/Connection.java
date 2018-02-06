/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveur;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author artde
 */
public class Connection implements Runnable{
    
    serveur server;
    ServerSocket serverSocket;
    
    Connection(serveur Serveur) throws IOException{
        server = Serveur;
        this.serverSocket = new ServerSocket(server.GetPort());

    }

    @Override
    public void run() {
        Socket sockNewClient;
        while(true){
            try {
                sockNewClient = serverSocket.accept();
                ConnectedClients newClient = new ConnectedClients(server, sockNewClient);
                server.addClient(newClient);
                Thread threadNewClient = new Thread(newClient);
                threadNewClient.start();

            } catch (IOException ex) {
                  ex.printStackTrace();
            } 
        }
        
    }
    
}
