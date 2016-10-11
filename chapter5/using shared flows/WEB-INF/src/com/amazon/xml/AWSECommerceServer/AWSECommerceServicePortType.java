/**
 * AWSECommerceServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public interface AWSECommerceServicePortType extends java.rmi.Remote {
    public com.amazon.xml.AWSECommerceServer.HelpResponse help(com.amazon.xml.AWSECommerceServer.Help body) throws java.rmi.RemoteException;
    public com.amazon.xml.AWSECommerceServer.ItemSearchResponse itemSearch(com.amazon.xml.AWSECommerceServer.ItemSearch body) throws java.rmi.RemoteException;
    public com.amazon.xml.AWSECommerceServer.ItemLookupResponse itemLookup(com.amazon.xml.AWSECommerceServer.ItemLookup body) throws java.rmi.RemoteException;
    public com.amazon.xml.AWSECommerceServer.BrowseNodeLookupResponse browseNodeLookup(com.amazon.xml.AWSECommerceServer.BrowseNodeLookup body) throws java.rmi.RemoteException;
    public com.amazon.xml.AWSECommerceServer.ListSearchResponse listSearch(com.amazon.xml.AWSECommerceServer.ListSearch body) throws java.rmi.RemoteException;
    public com.amazon.xml.AWSECommerceServer.ListLookupResponse listLookup(com.amazon.xml.AWSECommerceServer.ListLookup body) throws java.rmi.RemoteException;
    public com.amazon.xml.AWSECommerceServer.CustomerContentSearchResponse customerContentSearch(com.amazon.xml.AWSECommerceServer.CustomerContentSearch body) throws java.rmi.RemoteException;
    public com.amazon.xml.AWSECommerceServer.CustomerContentLookupResponse customerContentLookup(com.amazon.xml.AWSECommerceServer.CustomerContentLookup body) throws java.rmi.RemoteException;
    public com.amazon.xml.AWSECommerceServer.SimilarityLookupResponse similarityLookup(com.amazon.xml.AWSECommerceServer.SimilarityLookup body) throws java.rmi.RemoteException;
    public com.amazon.xml.AWSECommerceServer.SellerLookupResponse sellerLookup(com.amazon.xml.AWSECommerceServer.SellerLookup body) throws java.rmi.RemoteException;
    public com.amazon.xml.AWSECommerceServer.CartGetResponse cartGet(com.amazon.xml.AWSECommerceServer.CartGet body) throws java.rmi.RemoteException;
    public com.amazon.xml.AWSECommerceServer.CartAddResponse cartAdd(com.amazon.xml.AWSECommerceServer.CartAdd body) throws java.rmi.RemoteException;
    public com.amazon.xml.AWSECommerceServer.CartCreateResponse cartCreate(com.amazon.xml.AWSECommerceServer.CartCreate body) throws java.rmi.RemoteException;
    public com.amazon.xml.AWSECommerceServer.CartModifyResponse cartModify(com.amazon.xml.AWSECommerceServer.CartModify body) throws java.rmi.RemoteException;
    public com.amazon.xml.AWSECommerceServer.CartClearResponse cartClear(com.amazon.xml.AWSECommerceServer.CartClear body) throws java.rmi.RemoteException;
    public com.amazon.xml.AWSECommerceServer.TransactionLookupResponse transactionLookup(com.amazon.xml.AWSECommerceServer.TransactionLookup body) throws java.rmi.RemoteException;
    public com.amazon.xml.AWSECommerceServer.SellerListingSearchResponse sellerListingSearch(com.amazon.xml.AWSECommerceServer.SellerListingSearch body) throws java.rmi.RemoteException;
    public com.amazon.xml.AWSECommerceServer.SellerListingLookupResponse sellerListingLookup(com.amazon.xml.AWSECommerceServer.SellerListingLookup body) throws java.rmi.RemoteException;
    public com.amazon.xml.AWSECommerceServer.MultiOperationResponse multiOperation(com.amazon.xml.AWSECommerceServer.MultiOperation body) throws java.rmi.RemoteException;
}
