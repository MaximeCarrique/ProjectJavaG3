/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author artde
 */
public class ClientReceive implements Runnable {
    
    Client client;
    BufferedReader in;
    
    ClientReceive(Client c, BufferedReader i){
        client = c;
        in = i;
    }

    @Override
    public void run() {
        boolean isActive = true ;
        while(isActive) {
            String message = null;
            try {
                message = in.readLine();
            } catch (IOException ex) {
                isActive = false;
            }
            if (message != null) {
                System.out.println("\nMessage reçu : " + message);
            }
            else{
                isActive = false;
            }
            
        }
        try {
            client.disconnectedServer();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
