/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author artde
 */
public class ClientSend implements Runnable {
    
    PrintWriter out;
    
    ClientSend(PrintWriter print){
        out = print;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Votre message >> ");
            String m = sc.nextLine();
            out.println(m);
            out.flush();
        }
    }
    
}
