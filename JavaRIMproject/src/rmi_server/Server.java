/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_server;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import rmi_interface.hello.hello.Hello;

public class Server implements Hello {
    public String sayHello() {
        return "Halo dari Server! Komunikasi RMI berhasil.";
    }

    public static void main(String[] args) {
        try {
            Server obj = new Server();
            Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);

            Registry registry = LocateRegistry.createRegistry(2001);
            registry.bind("Hello", stub);

            System.out.println("Server siap dan menunggu client...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/**
 *
 * @author user
 */


