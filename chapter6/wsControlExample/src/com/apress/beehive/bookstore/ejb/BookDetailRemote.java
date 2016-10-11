package com.apress.beehive.bookstore.ejb;

import com.apress.beehive.bookstore.vo.Book;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;
import java.sql.SQLException;

public interface BookDetailRemote
    extends EJBObject
{
    public  String hello() throws RemoteException;
    public  String insertBookDetail(Book aBook) throws RemoteException,SQLException;
    public  String updateBookDetail(Book aBook) throws RemoteException,SQLException;
}