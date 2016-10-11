package apress.beehive.vo;

import java.io.Serializable;

public class Book implements Serializable {
    private String book_Id;
    private String title;
    private String author;
    private String publication;
    private String publication_Date;
    private String catalogNo;
    private String comments;
    private String book_type;
    private String isbn;
    private boolean available;
    private int pages;
    private String price;

    public String getBook_Id() {
        return book_Id;
    }

    public void setBook_Id(String bookId) {
        this.book_Id = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getPublication_Date() {
        return publication_Date;
    }

    public void setPublication_Date(String publication_Datce) {
        this.publication_Date = publication_Datce;
    }

    public String getCatalogNo() {
        return catalogNo;
    }

    public void setCatalogNo(String catalogNo) {
        this.catalogNo = catalogNo;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getBook_type() {
        return book_type;
    }

    public void setBook_type(String type) {
        this.book_type = type;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}