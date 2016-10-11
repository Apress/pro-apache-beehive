package com.apress.beehive.bookstore;

import com.apress.beehive.bookstore.vo.Book;
import org.apache.beehive.netui.pageflow.FormData;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class BookForm extends FormData {

   private Book  aBook ;
   private HashMap bookTypes = new LinkedHashMap();

    public BookForm() {
        aBook = new Book();
        populateBookTypes();
    }

    public Book getaBook() {
        return aBook;
    }

    public void setaBook(Book aBook) {
        this.aBook = aBook;
    }

    public HashMap getBookTypes() {
        return this.bookTypes;
    }

    public void setBookTypes(HashMap bookTypes) {
        this.bookTypes = bookTypes;
    }

     private void populateBookTypes() {
        bookTypes.put("book", "Book");
        bookTypes.put("magazine", "Magazine");
        bookTypes.put("journal", "Journal");
        bookTypes.put("newspaper", "News Paper");
        bookTypes.put("electronic", "e-books & Docs");
    }

    public ActionErrors validate(ActionMapping actionMapping, HttpServletRequest httpServletRequest) {         final ActionErrors errors = new ActionErrors();

        if (aBook.getTitle()== null || aBook.getTitle().equalsIgnoreCase("")) {
           errors.add("addBook.error.requiredTitle", new ActionError("addBook.requiredTitle"));
        }
        if (aBook.getComments() != null && aBook.getComments().length() > 100) {
            errors.add("addBook.error.invalidLength", new ActionError("addBook.invalidLength"));
        }
       if (aBook.getPublication_Date() != null && !aBook.getPublication_Date().equalsIgnoreCase("")) {
           int index = aBook.getPublication_Date().lastIndexOf("/");
           String year = aBook.getPublication_Date().substring(index + 1);
            if (year != null && year.length() < 4) {
              errors.add("addBook.error.invalidDate", new ActionError("addBook.invalidDate"));
           }
           try {
               this.getUtilDate(aBook.getPublication_Date());
           } catch (Exception ex) {
             errors.add("addBook.error.invalidDate", new ActionError("addBook.invalidDate"));
        }
      }
        return errors;
    }

    private Date getUtilDate(String strValue) throws Exception {

        if (strValue == null) return null;
        DateFormat dateFmt = new SimpleDateFormat("MM/dd/yyyy");
        dateFmt.setLenient(true);
        return dateFmt.parse(strValue);
    }
}
