package com.apress.beehive.bookstore;

import com.apress.beehive.bookstore.vo.Book;
import com.apress.beehive.bookstore.vo.BookDetailDocument;
import org.apache.beehive.netui.pageflow.SharedFlowController;
import org.apache.beehive.netui.pageflow.Forward;
import org.apache.beehive.netui.pageflow.annotations.Jpf;
import org.apache.beehive.controls.api.bean.Control;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.rmi.RemoteException;

@Jpf.Controller
public class BookSharedFlow extends SharedFlowController {
   @Control
            public apress.beehive.controls.bookstoredb.BookDBControl dbcontrol;

     public HashMap populateBookDetails(ResultSet oResultSet) throws SQLException {
        HashMap books = new LinkedHashMap();
        while (oResultSet.next()) {
            Book book = new Book();

            book.setBook_Id(oResultSet.getInt("book_id"));
            book.setAuthor(oResultSet.getString("author"));
            book.setTitle(oResultSet.getString("title"));
            book.setPublication(oResultSet.getString("publication"));
            book.setIsbn(oResultSet.getString("isbn"));
            book.setBook_type(oResultSet.getString("book_type"));
            books.put(String.valueOf(book.getBook_Id()), book);
        }
        return books;
    }

     public BookDetailDocument.BookDetail getBookDetail(Book book) {
         BookDetailDocument.BookDetail bd = BookDetailDocument.Factory.newInstance().addNewBookDetail();
        bd.setAuthor(book.getAuthor());
        bd.setAvailable(book.isAvailable());
        bd.setBookId(book.getBook_Id());
        bd.setBookType(book.getBook_type());
        bd.setCatalogNo(book.getCatalogNo());
        bd.setComments(book.getComments());
        bd.setIsbn(book.getIsbn());
        bd.setPrice(book.getPrice());
        bd.setPages(book.getPages());
        bd.setPublication(book.getPublication());

        return bd;
    }


    public Book getBook(BookDetailDocument.BookDetail bookdetail) {
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


    @Jpf.Action(
             forwards = {
             @Jpf.Forward(name = "success", path = "addBook.jsp")
             })
             protected Forward showAddBookPage() throws RemoteException {
         return new Forward("success", new BookForm());
     }



public ResultSet findBooksByAuthorAndType(String author, String type) throws SQLException
    {
         ResultSet rs = dbcontrol.findBooksByAuthorAndType(author,type);
        return rs;
    }


}
