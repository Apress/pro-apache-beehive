package apress.beehive.controls.wscontrol;

import org.apache.beehive.controls.api.bean.Control;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;
import java.rmi.RemoteException;
import java.sql.SQLException;

import com.apress.beehive.bookstore.vo.BookDetailDocument;
import com.apress.beehive.bookstore.vo.Book;

@WebService (name="LibraryWebService",
        targetNamespace="http://wscontrol.controls.beehive.apress",
        serviceName="LibraryService")
        @SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.ENCODED)
        public class MyBookWebService {


    @Control
            public apress.beehive.controls.javacontrol.AmazonControl amazon;

    @Control
            public apress.beehive.controls.ejbcontrol.BookDetailEJBControl ejbcontrol;


    @WebMethod(operationName = "getGreeting" )
     @WebResult(name="greetings")
       public String sayHello() {
        return "Hello world!";
    }

    /** example to show the usage of @Oneway annotation
     * This is used for methods which does not return anything
     * As a side effect, a @OneWay method can not throw checked exceptions and obviously
     * can not have any OUT/INOUT parameters.
     *
     */
    @WebMethod(operationName = "printHello", action="urn:printHello1")
     @Oneway
         public void printHello(String name) {
          System.out.println("Hello"+ name +"!!" );
       }


    @WebMethod
            public String addBook(@WebParam(name = "book") Book newBook) throws RemoteException,SQLException
    {
       return ejbcontrol.insertBookDetail(this.getBookDetail(newBook));
    }


    @WebMethod
            public String getAmazonURLForBook(@WebParam(name = "bookISBN") String isbn) throws RemoteException {
        return amazon.searchBook(isbn);
    }

    // I have given this method to show that a JWS file can have non_webservice methods
     private BookDetailDocument.BookDetail getBookDetail(Book book) {
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


}
