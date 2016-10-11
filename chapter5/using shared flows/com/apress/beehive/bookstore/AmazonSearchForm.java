package com.apress.beehive.bookstore;

import com.amazon.xml.AWSECommerceServer.Items;
import org.apache.beehive.netui.pageflow.FormData;

import java.util.ArrayList;


public class AmazonSearchForm extends FormData {

    private String isbn;
    private String author;
    private String marchentId;
    private String subscriptionId;
    private String associateId;
    private Items[]  results;
    private String url;
    private ArrayList  booksList;

    public AmazonSearchForm()
    {
        booksList = new ArrayList();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMarchentId() {
        return marchentId;
    }

    public void setMarchentId(String marchentId) {
        this.marchentId = marchentId;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getAssociateId() {
        return associateId;
    }

    public void setAssociateId(String associateId) {
        this.associateId = associateId;
    }

    public Items[] getResults() {
        return results;
    }

    public void setResults(Items[] results) {
        this.results = results;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList getBooksList() {
        return booksList;
    }

    public void setBooksList(ArrayList booksList) {
        this.booksList = booksList;
    }

}
