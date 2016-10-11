package com.apress.beehive.bookstore;

import apress.beehive.controls.bookstoredb.BookDBControl;
import apress.beehive.controls.ejbcontrol.BookDetailEJBControl;
import apress.beehive.controls.javacontrol.AmazonControl;
import com.amazon.xml.AWSECommerceServer.Item;
import com.amazon.xml.AWSECommerceServer.Items;
import com.apress.beehive.bookstore.vo.Book;
import com.apress.beehive.bookstore.vo.BookDetailDocument;
import org.apache.beehive.controls.api.bean.Control;
import org.apache.beehive.netui.pageflow.Forward;
import org.apache.beehive.netui.pageflow.PageFlowController;
import org.apache.beehive.netui.pageflow.annotations.Jpf;

import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;


@Jpf.Controller (
         sharedFlowRefs = {
        @Jpf.SharedFlowRef(name="booksharedFlow",type=com.apress.beehive.bookstore.BookSharedFlow.class)
},
        messageBundles = {
        @Jpf.MessageBundle(bundlePath = "apress.beehive.messages.bookstore")
        }

        )
  public class BookController extends PageFlowController {


    @Jpf.SharedFlowField(name = "booksharedFlow")
    private com.apress.beehive.bookstore.BookSharedFlow _sharedFlow = null;

    HashMap booksMap = new HashMap();
    @Control
            public BookDBControl dbcontrol;

    @Control
            public BookDetailEJBControl ejbcontrol;

    @Control
            public AmazonControl amazon;

    private ResultSet rs = null;


    @Jpf.Action(
            forwards = {
            @Jpf.Forward(name = "success", path = "index.jsp")
            })
            protected Forward begin() {
        this.getRequest();
        return new Forward("success");
    }

    @Jpf.Action(
            forwards = {
            @Jpf.Forward(name = "success", path = "addBook.jsp")
            })
            protected Forward showAddBookPage() throws RemoteException {
      return _sharedFlow.showAddBookPage();
    }


    @Jpf.Action(
            forwards = {
            @Jpf.Forward(name = "success", path = "searchBook.jsp")
            })
            protected Forward showSearchBookPage() {
        return new Forward("success", new BookForm());
    }

    @Jpf.Action(
            forwards = {
            @Jpf.Forward(name = "success", path = "searchAmazon.jsp")
            })
            protected Forward searchAmazon() throws RemoteException {
        return new Forward("success", new AmazonSearchForm());
    }

    @Jpf.Action(
            forwards = {
            @Jpf.Forward(name = "success", path = "viewBook.jsp")
            })
            protected Forward getBookDetails() throws SQLException {
        BookForm form = new BookForm();
        String bookId = this.getRequest().getParameter("bookId");
        System.out.println("Book id is " + bookId);
        BookDetailDocument.BookDetail abook = dbcontrol.getBookDetails(Integer.parseInt(bookId));

        form.setaBook(_sharedFlow.getBook(abook));
        return new Forward("success", form);
    }

    @Jpf.Action(
            forwards = {
            @Jpf.Forward(name = "success", path = "viewBook.jsp")
            },
            validationErrorForward = @Jpf.Forward(name = "failure", navigateTo = Jpf.NavigateTo.currentPage)
            )
            protected Forward addBook(BookForm form) throws RemoteException, SQLException {
        ejbcontrol.insertBookDetail(_sharedFlow.getBookDetail(form.getaBook()));
        return new Forward("success", form);
    }

    @Jpf.Action(
            forwards = {
            @Jpf.Forward(name = "success", path = "index.jsp")
            })
            protected Forward submitForm(BookForm form) {

        return new Forward("success", getBook());
    }

    @Jpf.Action(
            forwards = {
            @Jpf.Forward(name = "success", path = "books.jsp")
            })
            protected Forward submitSearchBook(BookForm form) throws SQLException {
        ResultSet rs = _sharedFlow.findBooksByAuthorAndType(form.getaBook().getAuthor(), form.getaBook().getBook_type());
        this.setBooksMap(_sharedFlow.populateBookDetails(rs));
        return new Forward("success");
    }

    @Jpf.Action(
            forwards = {
            @Jpf.Forward(name = "success", path = "booksGrid.jsp")
            })
            protected Forward getBookRowset(BookForm form) throws SQLException {
        ResultSet rs = _sharedFlow.findBooksByAuthorAndType(form.getaBook().getAuthor(), form.getaBook().getBook_type());
        this.setRs(rs);
        Forward forward = new Forward("success");
        forward.addPageInput("rs", rs);
        return forward;
    }

    @Jpf.Action(
            forwards = {
            @Jpf.Forward(name = "success", path = "amazonResults.jsp")
            })
            protected Forward searchAWS(AmazonSearchForm form) throws RemoteException {
        System.out.println("ISBN is " + form.getIsbn());
        String url = amazon.searchBook(form.getIsbn());
        form.setUrl(url);
        System.out.println("url" + form.getUrl());
        Items[] resultItems = amazon.lookupISBN(form.getIsbn());
        ArrayList resultsList = new ArrayList();
        if (resultItems != null && resultItems.length > 0) {
            for (int i = 0; i < resultItems.length; i++) {
                Item[] itemvalues = resultItems[i].getItem();
                if (itemvalues != null) {
                    for (int j = 0; j < itemvalues.length; j++) {
                        Book aBook = new Book();
                        String[] authors = itemvalues[j].getItemAttributes().getAuthor();
                        StringBuffer authorBuffer = new StringBuffer();
                        if (authorBuffer != null) {
                            for (int k = 0; k < authors.length; k++) {
                                authorBuffer.append(authors[k]);
                                authorBuffer.append(" ");

                            }
                        }
                        aBook.setTitle(itemvalues[j].getItemAttributes().getTitle());
                        aBook.setPublication(itemvalues[j].getItemAttributes().getPublisher());
                        aBook.setAuthor(authorBuffer.toString());
                        aBook.setIsbn(itemvalues[j].getItemAttributes().getISBN());
                        aBook.setPrice(itemvalues[j].getItemAttributes().getListPrice().getFormattedPrice());
                        aBook.setPages(itemvalues[j].getItemAttributes().getNumberOfPages().intValue());

                        System.out.println("Authors :" + authorBuffer.toString());
                        System.out.println("ISBN : " + itemvalues[j].getItemAttributes().getISBN());
                        System.out.println("Label : " + itemvalues[j].getItemAttributes().getLabel());
                        System.out.println("Price : " + itemvalues[j].getItemAttributes().getListPrice().getFormattedPrice());
                        System.out.println("No of pages : " + itemvalues[j].getItemAttributes().getNumberOfPages());
                        System.out.println("publisher : " + itemvalues[j].getItemAttributes().getPublisher());
                        System.out.println("Title : " + itemvalues[j].getItemAttributes().getTitle());
                        resultsList.add(aBook);
                    }
                }
            }
        }
        form.setBooksList(resultsList);
        return new Forward("success", form);
    }

    private BookForm getBook() {
        BookForm bookDetails = new BookForm();
        bookDetails.getaBook().setTitle("Pro-Beehive");
        bookDetails.getaBook().setBook_type("Book");
        bookDetails.getaBook().setAuthor("Kunal Mittal");
        bookDetails.getaBook().setIsbn("0-13-911181-6");
        bookDetails.getaBook().setCatalogNo("26");
        bookDetails.getaBook().setPublication("APress");
        //bookDetails.getaBook().setPubDate(null);
        bookDetails.getaBook().setComments("This is a good reference book for technical people.");
        bookDetails.getaBook().setAvailable(true);
        return bookDetails;
    }

    public HashMap getBooksMap() {
        return booksMap;
    }


    public void setBooksMap(HashMap booksMap) {
        this.booksMap = booksMap;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

}
