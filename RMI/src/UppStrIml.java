
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bhavik
 */
public class UppStrIml extends UnicastRemoteObject implements Uppstr{
    public UppStrIml()throws RemoteException
    {
        super();
    }

    @Override
    public String upString(String str) throws RemoteException {
        
       String result = str;
       result = result.toUpperCase();
       return result;
    }
}
