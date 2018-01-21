
import java.rmi.Naming;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bhavik
 */
public class UppstrClient {
    public static void main(String args[]){
        int port = 7000;
        try{
            
        String lookup_url = "rmi://localhost:" + port + "/UpperStringService";
        Uppstr up = (Uppstr)Naming.lookup(lookup_url);
        String name = "Bhavik";
        String result = up.upString(name);
        System.out.println("Welcome : "+ result);
        
            
        }catch(Exception ex){
        
        }
    }
    
}
