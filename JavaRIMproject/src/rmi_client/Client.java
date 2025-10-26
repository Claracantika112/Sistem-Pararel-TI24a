/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmi_interface.hello.hello.Hello;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 2001);
            Hello stub = (Hello) registry.lookup("Hello");
            
            // Panggil method dari server
            String response = stub.sayHello();
            
            // Cetak hasil dari server
            System.out.println("Pesan dari server: " + response);
        } catch (Exception e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}
