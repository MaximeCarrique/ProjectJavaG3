/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import serveur.Connection;

/**
 *
 * @author artde
 */
public class Client {
    
    String address;
    int port;
    Socket socket;
    BufferedReader in;
    PrintWriter out;
    
    Client(String ip, int ports) throws IOException{
        address = ip;
        port = ports;
        socket = new Socket(address, port);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream());
        Thread threadSend = new Thread(new ClientSend(out));
        Thread threadReceive = new Thread(new ClientReceive(this, in));
        threadSend.start();
        threadReceive.start();
    }
    
    public void  disconnectedServer() throws IOException{
        socket.close();
        in.close();
        out.close();
        System.exit(0);
    }
    
}
