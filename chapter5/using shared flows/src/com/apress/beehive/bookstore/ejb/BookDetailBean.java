package com.apress.beehive.bookstore.ejb;

import com.apress.beehive.bookstore.vo.Book;
import com.apress.beehive.bookstore.vo.BookDetailDocument;
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

      public  String insertBookDetail(BookDetailDocument.BookDetail aBook) throws RemoteException,SQLException
      {
          System.out.println("Book title "+ aBook.getTitle());
          return (new BookDAO()).addBook(this.getBook(aBook));
      }
    public  String updateBookDetail(BookDetailDocument.BookDetail aBook) throws RemoteException,SQLException
    {
        return "";
    }

    private Book getBook(BookDetailDocument.BookDetail bookdetail)
    {
        Book bookObj = new Book();
       bookObj.setBook_Id(bookdetail.getBookId());
        bookObj.setTitle(bookdetail.getTitle());
        bookObj.setAuthor(bookdetail.getAuthor());
        bookObj.setPublication(bookdetail.getPublication());
        bookObj.setBook_type(bookdetail.getBookType());
        bookObj.setCatalogNo(bookdetail.getCatalogNo());
        bookObj.setComments(bookdetail.getComments());
        bookObj.setIsbn(bookdetail.getIsbn());
        bookObj.setPages(bookdetail.getPages());
        bookObj.setPrice(bookdetail.getPrice());
        bookObj.setAvailable(bookdetail.getAvailable());
        return bookObj;
    }


   private static final long serialVersionUID = 0xa0aa87e44ca8f7c2L;
    private SessionContext ctx;
}