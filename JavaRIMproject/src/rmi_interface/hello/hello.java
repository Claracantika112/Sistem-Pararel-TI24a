/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_interface.hello;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author user
 */
public interface hello {

    public String sayHello();
    public interface Hello extends Remote {
    String sayHello() throws RemoteException;
}

    public static class helloImpl {

        public helloImpl() {
        }
    }
}
