package apress.beehive.controls.javacontrol;

import com.amazon.xml.AWSECommerceServer.Items;
import org.apache.beehive.controls.api.bean.ControlInterface;

import java.rmi.RemoteException;

@ControlInterface
public interface AmazonControl
{
   public String searchBook(String isbn)throws RemoteException;
   public Items[] lookupISBN(String isbn) throws RemoteException;
}