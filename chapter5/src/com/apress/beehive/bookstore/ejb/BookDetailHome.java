package com.apress.beehive.bookstore.ejb;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import java.rmi.RemoteException;

public interface BookDetailHome
    extends EJBHome
{

    public abstract BookDetailRemote create()
        throws CreateException, RemoteException;
}