package com.apress.beehive.bookstore.ejb;

import com.apress.beehive.bookstore.vo.Book;
import com.apress.beehive.bookstore.dao.BookDAO;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import java.rmi.RemoteException;
import java.sql.SQLException;

public class BookDetailBean implements SessionBean
{
    public BookDetailBean()
    {
    }

    public void ejbCreate()
    {
    }

    public void ejbRemove()
        throws EJBException, RemoteException
    {
    }

    public void ejbActivate()
        throws EJBException, RemoteException
    {
        
    }

    public void ejbPassivate()
        throws EJBException, RemoteException
    {
    }

    public void setSessionContext(SessionContext ctx)
    {
        this.ctx = ctx;
    }

    public String hello() throws RemoteException
    {
        return "Hello srini";
    }

      public  String insertBookDetail(Book aBook) throws RemoteException,SQLException
      {
          System.out.println("Book title "+ aBook.getTitle());
          return (new BookDAO()).addBook(aBook);
      }
    public  String updateBookDetail(Book aBook) throws RemoteException,SQLException
    {
        return "";
    }



   private static final long serialVersionUID = 0xa0aa87e44ca8f7c2L;
    private SessionContext ctx;
}