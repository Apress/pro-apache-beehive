package demo;

import org.apache.beehive.netui.pageflow.FormData;
import java.util.HashMap;
import java.util.LinkedHashMap;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping; 

public class BookForm extends FormData{
    
        private String id=null;
        private String name=null;
	    private String type=null;
	    private String author=null;
	    private String publication=null;
	    private String publicationDate=null;
	    private String isbn=null;
	    private String catalogNo=null;
	    private String comments=null;
	    private boolean inStock=false;
	    private String action=null;
        private HashMap bookTypes=new HashMap();
        

    public BookForm()
    {
        populateBookTypes();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCatalogNo() {
        return catalogNo;
    }

    public void setCatalogNo(String catalogNo) {
        this.catalogNo = catalogNo;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
    
    public HashMap getBookTypes() {
        return this.bookTypes;
    }

    public void setBookTypes(HashMap bookTypes) {
        this.bookTypes = bookTypes;
    }
    
    private void populateBookTypes()
    {
        bookTypes.put("book","Book");
        bookTypes.put("magazine","Magazine");
        bookTypes.put("journal","Journal");
        bookTypes.put("newspaper","News Paper");
        bookTypes.put("electronic","e-books & Docs");
        
    }
    
      public ActionErrors validate(final ActionMapping oMapping, final HttpServletRequest request) {
        final ActionErrors errors = new ActionErrors();
        System.out.println("we are here");
        if (this.getName()==null || this.getName().equalsIgnoreCase("")) {
                errors.add("error.bookDetails.requiredName", new ActionError("errors.required","Name\\Title"));
            }
        if (this.getType()==null || this.getType().equalsIgnoreCase("")) {
                errors.add("error.bookDetails.requiredType", new ActionError("errors.required","Type"));
            }
        if (this.getAuthor()==null || this.getAuthor().equalsIgnoreCase("")) {
                errors.add("error.bookDetails.requiredAuthorName", new ActionError("errors.required","Author"));
            }
        if (this.getPublication()==null || this.getPublication().equalsIgnoreCase("")) {
                errors.add("error.bookDetails.requiredPublicaionName", new ActionError("errors.required","Publication"));
            }
        if (this.getIsbn()==null || this.getIsbn().equalsIgnoreCase("")) {
                errors.add("error.bookDetails.requiredISBN", new ActionError("errors.required","ISBN"));
            }
        if (this.getCatalogNo()==null || this.getCatalogNo().equalsIgnoreCase("")) {
                errors.add("error.bookDetails.requiredCatalog", new ActionError("errors.required","Catalog"));
            }                    
    
          return errors;
    }
}
