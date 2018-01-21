/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chirag
 */
public interface Uppstr extends java.rmi.Remote {
    public String upString(String str) throws java.rmi.RemoteException;
}
