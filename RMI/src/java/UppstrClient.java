
import java.rmi.Naming;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chirag
 */
public class UppstrClient {
    public static void main(String args[])
    {
        int port=7000;
        {
            String lookup_url = "rmi://localhost:"+port +"/UpperStringService";
            Uppstr up = (uppstr) Naming.lookup(lookup_url);
            String name="chirag";
            String result = up.uppstring(name);
            System.out.println("Remote"+result);
        }
    }
    
}
