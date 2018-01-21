import java.rmi.RemoteException;
/**
 *
 * @author Chirag
 */
public class UppstrImpl extends Uppstr
{
    public UppstrImpl() throws RemoteException
    {
        super();
    }
    
    /**
     *
     * @param str
     * @return
     * @throws RemoteException
     */
    public String Uppstr(String str) throws RemoteException{
        String result=str;
        result=result.toUpperCase();
        return result;
    }
}
