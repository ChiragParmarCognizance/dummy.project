
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bhavik
 */
public class UppstrServer {
    public static void main(String args[]){
        try{
            int port=7000;
            startRegistry(port);
            UppStrIml up = new UppStrIml();
            String url="rmi://localhost:" + port + "/UpperStringService";
            Naming.rebind(url,up);
            System.out.println("Upper String is Ready and Running on Port Number "+port);
            
        }catch(Exception ex)
        {
         ex.printStackTrace();
        // System.out.println();
        }
    }

    private static void startRegistry(int portnumber) throws RemoteException {
        try{
            Registry registry = LocateRegistry.getRegistry(portnumber);
            registry.list();
            
        }catch(Exception ex)
        {
            System.out.println("Registry Could Not be Found on Port Number "+ portnumber);
            Registry registry = LocateRegistry.createRegistry(portnumber);
            System.out.println("Registry Created on Port Number : "+ portnumber);
        }
        
    }
    
}
