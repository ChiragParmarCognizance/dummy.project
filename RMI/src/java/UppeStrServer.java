import java.rmi.*;
import java.rmi.registry.LocateRegistry;
/**
 *
 * @author Chirag
 */
public class UppeStrServer {
    public static void main(String args[])
    {
        try
        {
            int port=7000;
            starRegistry(port);
            UppstrImpl up = new UppstrImpl();
            String url = "rmi://localhost:" + port + "/UpperStringService";
            Naming.rebind(url, up);
            System.out.println("Upper String is  Ready and running on port Number");
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void starRegistry(int portNumber) throws RemoteException
    {
        try{
            Registry registry = LocateRegistry.getRegistry(portNumber);
            registry.list();
        }
        catch(Exception ex)
        {
            System.out.println("Registry could not be found on port number");
            Registry registry = LocateRegistry.createRegistry(portNumber);
            System.out.println("Registry created on port no. : " + portNumber);
        }
    }
}