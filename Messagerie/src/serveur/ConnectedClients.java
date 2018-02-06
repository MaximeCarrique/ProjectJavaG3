/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveur;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author artde
 */
public class ConnectedClients implements Runnable {
    
    static int idCounter = 0;
    private int id;
    Socket socket;
    PrintWriter out;
    BufferedReader in;
    serveur Serveur;
    
    ConnectedClients(serveur Serveur, Socket sock) throws IOException{
        this.Serveur = Serveur;
        socket = sock;
        id = idCounter;
        idCounter++;
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream());
        System.out.println("Nouvelle connexion, id = " + id);

        
    }

    @Override
    public void run() {
        boolean isActive = true;
        while (isActive) {
            try {
                String message = in.readLine();
                Serveur.broadcastMessage(message, id);

            } catch (IOException ex) {
                                isActive = false;
                try {
                    Serveur.disconnectedClient(this);
                } catch (IOException ex1) {
                    Logger.getLogger(ConnectedClients.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
            

        }

    }
    
    public void sendMessage(String m){
        this.out.println(m);
        this.out.flush();
    }
    
    public void closeClient() throws IOException{
        this.in.close();
        this.out.close();
        this.socket.close();
    }
    
    public void setId(int i){
        id = i;
    }
    
    public int getId(){
        return id;
    }
    
}
