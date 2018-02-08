/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveur;
import java.io.IOException;
/**
 * start a server. Reads the server's port from the command line argument
 * @author Remi Watrigant
 *
 */
public class MainServeur {
    /**
     * creates a new server
     * @param args
     */
    public void StartServeur(Integer Port) throws IOException {
        Integer port = Port;
        serveur server = new serveur(port);
         
    }
    
    private static void printUsage() {
        System.out.println("java server.Server <port>");
        System.out.println("\t<port>: server's port");
    }
}
