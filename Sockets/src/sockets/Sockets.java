/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets;

import java.net.*;
import java.io.*;

/**
 *
 * @author emily
 */
public class Sockets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        client1();
        client2();

    }

    public static void client1() throws IOException {
        Client client1 = new Client();
        client1.startConnection("127.0.0.1", 5025);
        String msg1 = client1.sendMessage("Hello Server");
        String msg2 = client1.sendMessage("I'am client1 Emily");
        String terminate = client1.sendMessage(".");

        System.out.println(msg1);
        System.out.println(msg2);
        System.out.println(terminate);
    }

    public static void client2() throws IOException {
        Client client2 = new Client();
        client2.startConnection("127.0.0.1", 5025);
        String msg12 = client2.sendMessage("Hello Server");
        String msg22 = client2.sendMessage("I'am client2 Emily");
        String terminate2 = client2.sendMessage(".");

        System.out.println(msg12);
        System.out.println(msg22);
        System.out.println(terminate2);
    }

}
