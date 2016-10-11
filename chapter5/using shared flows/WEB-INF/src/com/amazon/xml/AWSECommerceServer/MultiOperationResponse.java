/**
 * MultiOperationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class MultiOperationResponse  implements java.io.Serializable {
    private com.amazon.xml.AWSECommerceServer.OperationRequest operationRequest;
    private com.amazon.xml.AWSECommerceServer.HelpResponse helpResponse;
    private com.amazon.xml.AWSECommerceServer.ItemSearchResponse itemSearchResponse;
    private com.amazon.xml.AWSECommerceServer.ItemLookupResponse itemLookupResponse;
    private com.amazon.xml.AWSECommerceServer.ListSearchResponse listSearchResponse;
    private com.amazon.xml.AWSECommerceServer.ListLookupResponse listLookupResponse;
    private com.amazon.xml.AWSECommerceServer.CustomerContentSearchResponse customerContentSearchResponse;
    private com.amazon.xml.AWSECommerceServer.CustomerContentLookupResponse customerContentLookupResponse;
    private com.amazon.xml.AWSECommerceServer.SimilarityLookupResponse similarityLookupResponse;
    private com.amazon.xml.AWSECommerceServer.SellerLookupResponse sellerLookupResponse;
    private com.amazon.xml.AWSECommerceServer.CartGetResponse cartGetResponse;
    private com.amazon.xml.AWSECommerceServer.CartAddResponse cartAddResponse;
    private com.amazon.xml.AWSECommerceServer.CartCreateResponse cartCreateResponse;
    private com.amazon.xml.AWSECommerceServer.CartModifyResponse cartModifyResponse;
    private com.amazon.xml.AWSECommerceServer.CartClearResponse cartClearResponse;
    private com.amazon.xml.AWSECommerceServer.TransactionLookupResponse transactionLookupResponse;
    private com.amazon.xml.AWSECommerceServer.SellerListingSearchResponse sellerListingSearchResponse;
    private com.amazon.xml.AWSECommerceServer.SellerListingLookupResponse sellerListingLookupResponse;
    private com.amazon.xml.AWSECommerceServer.BrowseNodeLookupResponse browseNodeLookupResponse;

    public MultiOperationResponse() {
    }

    public MultiOperationResponse(
           com.amazon.xml.AWSECommerceServer.BrowseNodeLookupResponse browseNodeLookupResponse,
           com.amazon.xml.AWSECommerceServer.CartAddResponse cartAddResponse,
           com.amazon.xml.AWSECommerceServer.CartClearResponse cartClearResponse,
           com.amazon.xml.AWSECommerceServer.CartCreateResponse cartCreateResponse,
           com.amazon.xml.AWSECommerceServer.CartGetResponse cartGetResponse,
           com.amazon.xml.AWSECommerceServer.CartModifyResponse cartModifyResponse,
           com.amazon.xml.AWSECommerceServer.CustomerContentLookupResponse customerContentLookupResponse,
           com.amazon.xml.AWSECommerceServer.CustomerContentSearchResponse customerContentSearchResponse,
           com.amazon.xml.AWSECommerceServer.HelpResponse helpResponse,
           com.amazon.xml.AWSECommerceServer.ItemLookupResponse itemLookupResponse,
           com.amazon.xml.AWSECommerceServer.ItemSearchResponse itemSearchResponse,
           com.amazon.xml.AWSECommerceServer.ListLookupResponse listLookupResponse,
           com.amazon.xml.AWSECommerceServer.ListSearchResponse listSearchResponse,
           com.amazon.xml.AWSECommerceServer.OperationRequest operationRequest,
           com.amazon.xml.AWSECommerceServer.SellerListingLookupResponse sellerListingLookupResponse,
           com.amazon.xml.AWSECommerceServer.SellerListingSearchResponse sellerListingSearchResponse,
           com.amazon.xml.AWSECommerceServer.SellerLookupResponse sellerLookupResponse,
           com.amazon.xml.AWSECommerceServer.SimilarityLookupResponse similarityLookupResponse,
           com.amazon.xml.AWSECommerceServer.TransactionLookupResponse transactionLookupResponse) {
           this.operationRequest = operationRequest;
           this.helpResponse = helpResponse;
           this.itemSearchResponse = itemSearchResponse;
           this.itemLookupResponse = itemLookupResponse;
           this.listSearchResponse = listSearchResponse;
           this.listLookupResponse = listLookupResponse;
           this.customerContentSearchResponse = customerContentSearchResponse;
           this.customerContentLookupResponse = customerContentLookupResponse;
           this.similarityLookupResponse = similarityLookupResponse;
           this.sellerLookupResponse = sellerLookupResponse;
           this.cartGetResponse = cartGetResponse;
           this.cartAddResponse = cartAddResponse;
           this.cartCreateResponse = cartCreateResponse;
           this.cartModifyResponse = cartModifyResponse;
           this.cartClearResponse = cartClearResponse;
           this.transactionLookupResponse = transactionLookupResponse;
           this.sellerListingSearchResponse = sellerListingSearchResponse;
           this.sellerListingLookupResponse = sellerListingLookupResponse;
           this.browseNodeLookupResponse = browseNodeLookupResponse;
    }


    /**
     * Gets the operationRequest value for this MultiOperationResponse.
     * 
     * @return operationRequest
     */
    public com.amazon.xml.AWSECommerceServer.OperationRequest getOperationRequest() {
        return operationRequest;
    }


    /**
     * Sets the operationRequest value for this MultiOperationResponse.
     * 
     * @param operationRequest
     */
    public void setOperationRequest(com.amazon.xml.AWSECommerceServer.OperationRequest operationRequest) {
        this.operationRequest = operationRequest;
    }


    /**
     * Gets the helpResponse value for this MultiOperationResponse.
     * 
     * @return helpResponse
     */
    public com.amazon.xml.AWSECommerceServer.HelpResponse getHelpResponse() {
        return helpResponse;
    }


    /**
     * Sets the helpResponse value for this MultiOperationResponse.
     * 
     * @param helpResponse
     */
    public void setHelpResponse(com.amazon.xml.AWSECommerceServer.HelpResponse helpResponse) {
        this.helpResponse = helpResponse;
    }


    /**
     * Gets the itemSearchResponse value for this MultiOperationResponse.
     * 
     * @return itemSearchResponse
     */
    public com.amazon.xml.AWSECommerceServer.ItemSearchResponse getItemSearchResponse() {
        return itemSearchResponse;
    }


    /**
     * Sets the itemSearchResponse value for this MultiOperationResponse.
     * 
     * @param itemSearchResponse
     */
    public void setItemSearchResponse(com.amazon.xml.AWSECommerceServer.ItemSearchResponse itemSearchResponse) {
        this.itemSearchResponse = itemSearchResponse;
    }


    /**
     * Gets the itemLookupResponse value for this MultiOperationResponse.
     * 
     * @return itemLookupResponse
     */
    public com.amazon.xml.AWSECommerceServer.ItemLookupResponse getItemLookupResponse() {
        return itemLookupResponse;
    }


    /**
     * Sets the itemLookupResponse value for this MultiOperationResponse.
     * 
     * @param itemLookupResponse
     */
    public void setItemLookupResponse(com.amazon.xml.AWSECommerceServer.ItemLookupResponse itemLookupResponse) {
        this.itemLookupResponse = itemLookupResponse;
    }


    /**
     * Gets the listSearchResponse value for this MultiOperationResponse.
     * 
     * @return listSearchResponse
     */
    public com.amazon.xml.AWSECommerceServer.ListSearchResponse getListSearchResponse() {
        return listSearchResponse;
    }


    /**
     * Sets the listSearchResponse value for this MultiOperationResponse.
     * 
     * @param listSearchResponse
     */
    public void setListSearchResponse(com.amazon.xml.AWSECommerceServer.ListSearchResponse listSearchResponse) {
        this.listSearchResponse = listSearchResponse;
    }


    /**
     * Gets the listLookupResponse value for this MultiOperationResponse.
     * 
     * @return listLookupResponse
     */
    public com.amazon.xml.AWSECommerceServer.ListLookupResponse getListLookupResponse() {
        return listLookupResponse;
    }


    /**
     * Sets the listLookupResponse value for this MultiOperationResponse.
     * 
     * @param listLookupResponse
     */
    public void setListLookupResponse(com.amazon.xml.AWSECommerceServer.ListLookupResponse listLookupResponse) {
        this.listLookupResponse = listLookupResponse;
    }


    /**
     * Gets the customerContentSearchResponse value for this MultiOperationResponse.
     * 
     * @return customerContentSearchResponse
     */
    public com.amazon.xml.AWSECommerceServer.CustomerContentSearchResponse getCustomerContentSearchResponse() {
        return customerContentSearchResponse;
    }


    /**
     * Sets the customerContentSearchResponse value for this MultiOperationResponse.
     * 
     * @param customerContentSearchResponse
     */
    public void setCustomerContentSearchResponse(com.amazon.xml.AWSECommerceServer.CustomerContentSearchResponse customerContentSearchResponse) {
        this.customerContentSearchResponse = customerContentSearchResponse;
    }


    /**
     * Gets the customerContentLookupResponse value for this MultiOperationResponse.
     * 
     * @return customerContentLookupResponse
     */
    public com.amazon.xml.AWSECommerceServer.CustomerContentLookupResponse getCustomerContentLookupResponse() {
        return customerContentLookupResponse;
    }


    /**
     * Sets the customerContentLookupResponse value for this MultiOperationResponse.
     * 
     * @param customerContentLookupResponse
     */
    public void setCustomerContentLookupResponse(com.amazon.xml.AWSECommerceServer.CustomerContentLookupResponse customerContentLookupResponse) {
        this.customerContentLookupResponse = customerContentLookupResponse;
    }


    /**
     * Gets the similarityLookupResponse value for this MultiOperationResponse.
     * 
     * @return similarityLookupResponse
     */
    public com.amazon.xml.AWSECommerceServer.SimilarityLookupResponse getSimilarityLookupResponse() {
        return similarityLookupResponse;
    }


    /**
     * Sets the similarityLookupResponse value for this MultiOperationResponse.
     * 
     * @param similarityLookupResponse
     */
    public void setSimilarityLookupResponse(com.amazon.xml.AWSECommerceServer.SimilarityLookupResponse similarityLookupResponse) {
        this.similarityLookupResponse = similarityLookupResponse;
    }


    /**
     * Gets the sellerLookupResponse value for this MultiOperationResponse.
     * 
     * @return sellerLookupResponse
     */
    public com.amazon.xml.AWSECommerceServer.SellerLookupResponse getSellerLookupResponse() {
        return sellerLookupResponse;
    }


    /**
     * Sets the sellerLookupResponse value for this MultiOperationResponse.
     * 
     * @param sellerLookupResponse
     */
    public void setSellerLookupResponse(com.amazon.xml.AWSECommerceServer.SellerLookupResponse sellerLookupResponse) {
        this.sellerLookupResponse = sellerLookupResponse;
    }


    /**
     * Gets the cartGetResponse value for this MultiOperationResponse.
     * 
     * @return cartGetResponse
     */
    public com.amazon.xml.AWSECommerceServer.CartGetResponse getCartGetResponse() {
        return cartGetResponse;
    }


    /**
     * Sets the cartGetResponse value for this MultiOperationResponse.
     * 
     * @param cartGetResponse
     */
    public void setCartGetResponse(com.amazon.xml.AWSECommerceServer.CartGetResponse cartGetResponse) {
        this.cartGetResponse = cartGetResponse;
    }


    /**
     * Gets the cartAddResponse value for this MultiOperationResponse.
     * 
     * @return cartAddResponse
     */
    public com.amazon.xml.AWSECommerceServer.CartAddResponse getCartAddResponse() {
        return cartAddResponse;
    }


    /**
     * Sets the cartAddResponse value for this MultiOperationResponse.
     * 
     * @param cartAddResponse
     */
    public void setCartAddResponse(com.amazon.xml.AWSECommerceServer.CartAddResponse cartAddResponse) {
        this.cartAddResponse = cartAddResponse;
    }


    /**
     * Gets the cartCreateResponse value for this MultiOperationResponse.
     * 
     * @return cartCreateResponse
     */
    public com.amazon.xml.AWSECommerceServer.CartCreateResponse getCartCreateResponse() {
        return cartCreateResponse;
    }


    /**
     * Sets the cartCreateResponse value for this MultiOperationResponse.
     * 
     * @param cartCreateResponse
     */
    public void setCartCreateResponse(com.amazon.xml.AWSECommerceServer.CartCreateResponse cartCreateResponse) {
        this.cartCreateResponse = cartCreateResponse;
    }


    /**
     * Gets the cartModifyResponse value for this MultiOperationResponse.
     * 
     * @return cartModifyResponse
     */
    public com.amazon.xml.AWSECommerceServer.CartModifyResponse getCartModifyResponse() {
        return cartModifyResponse;
    }


    /**
     * Sets the cartModifyResponse value for this MultiOperationResponse.
     * 
     * @param cartModifyResponse
     */
    public void setCartModifyResponse(com.amazon.xml.AWSECommerceServer.CartModifyResponse cartModifyResponse) {
        this.cartModifyResponse = cartModifyResponse;
    }


    /**
     * Gets the cartClearResponse value for this MultiOperationResponse.
     * 
     * @return cartClearResponse
     */
    public com.amazon.xml.AWSECommerceServer.CartClearResponse getCartClearResponse() {
        return cartClearResponse;
    }


    /**
     * Sets the cartClearResponse value for this MultiOperationResponse.
     * 
     * @param cartClearResponse
     */
    public void setCartClearResponse(com.amazon.xml.AWSECommerceServer.CartClearResponse cartClearResponse) {
        this.cartClearResponse = cartClearResponse;
    }


    /**
     * Gets the transactionLookupResponse value for this MultiOperationResponse.
     * 
     * @return transactionLookupResponse
     */
    public com.amazon.xml.AWSECommerceServer.TransactionLookupResponse getTransactionLookupResponse() {
        return transactionLookupResponse;
    }


    /**
     * Sets the transactionLookupResponse value for this MultiOperationResponse.
     * 
     * @param transactionLookupResponse
     */
    public void setTransactionLookupResponse(com.amazon.xml.AWSECommerceServer.TransactionLookupResponse transactionLookupResponse) {
        this.transactionLookupResponse = transactionLookupResponse;
    }


    /**
     * Gets the sellerListingSearchResponse value for this MultiOperationResponse.
     * 
     * @return sellerListingSearchResponse
     */
    public com.amazon.xml.AWSECommerceServer.SellerListingSearchResponse getSellerListingSearchResponse() {
        return sellerListingSearchResponse;
    }


    /**
     * Sets the sellerListingSearchResponse value for this MultiOperationResponse.
     * 
     * @param sellerListingSearchResponse
     */
    public void setSellerListingSearchResponse(com.amazon.xml.AWSECommerceServer.SellerListingSearchResponse sellerListingSearchResponse) {
        this.sellerListingSearchResponse = sellerListingSearchResponse;
    }


    /**
     * Gets the sellerListingLookupResponse value for this MultiOperationResponse.
     * 
     * @return sellerListingLookupResponse
     */
    public com.amazon.xml.AWSECommerceServer.SellerListingLookupResponse getSellerListingLookupResponse() {
        return sellerListingLookupResponse;
    }


    /**
     * Sets the sellerListingLookupResponse value for this MultiOperationResponse.
     * 
     * @param sellerListingLookupResponse
     */
    public void setSellerListingLookupResponse(com.amazon.xml.AWSECommerceServer.SellerListingLookupResponse sellerListingLookupResponse) {
        this.sellerListingLookupResponse = sellerListingLookupResponse;
    }


    /**
     * Gets the browseNodeLookupResponse value for this MultiOperationResponse.
     * 
     * @return browseNodeLookupResponse
     */
    public com.amazon.xml.AWSECommerceServer.BrowseNodeLookupResponse getBrowseNodeLookupResponse() {
        return browseNodeLookupResponse;
    }


    /**
     * Sets the browseNodeLookupResponse value for this MultiOperationResponse.
     * 
     * @param browseNodeLookupResponse
     */
    public void setBrowseNodeLookupResponse(com.amazon.xml.AWSECommerceServer.BrowseNodeLookupResponse browseNodeLookupResponse) {
        this.browseNodeLookupResponse = browseNodeLookupResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MultiOperationResponse)) return false;
        MultiOperationResponse other = (MultiOperationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operationRequest==null && other.getOperationRequest()==null) || 
             (this.operationRequest!=null &&
              this.operationRequest.equals(other.getOperationRequest()))) &&
            ((this.helpResponse==null && other.getHelpResponse()==null) || 
             (this.helpResponse!=null &&
              this.helpResponse.equals(other.getHelpResponse()))) &&
            ((this.itemSearchResponse==null && other.getItemSearchResponse()==null) || 
             (this.itemSearchResponse!=null &&
              this.itemSearchResponse.equals(other.getItemSearchResponse()))) &&
            ((this.itemLookupResponse==null && other.getItemLookupResponse()==null) || 
             (this.itemLookupResponse!=null &&
              this.itemLookupResponse.equals(other.getItemLookupResponse()))) &&
            ((this.listSearchResponse==null && other.getListSearchResponse()==null) || 
             (this.listSearchResponse!=null &&
              this.listSearchResponse.equals(other.getListSearchResponse()))) &&
            ((this.listLookupResponse==null && other.getListLookupResponse()==null) || 
             (this.listLookupResponse!=null &&
              this.listLookupResponse.equals(other.getListLookupResponse()))) &&
            ((this.customerContentSearchResponse==null && other.getCustomerContentSearchResponse()==null) || 
             (this.customerContentSearchResponse!=null &&
              this.customerContentSearchResponse.equals(other.getCustomerContentSearchResponse()))) &&
            ((this.customerContentLookupResponse==null && other.getCustomerContentLookupResponse()==null) || 
             (this.customerContentLookupResponse!=null &&
              this.customerContentLookupResponse.equals(other.getCustomerContentLookupResponse()))) &&
            ((this.similarityLookupResponse==null && other.getSimilarityLookupResponse()==null) || 
             (this.similarityLookupResponse!=null &&
              this.similarityLookupResponse.equals(other.getSimilarityLookupResponse()))) &&
            ((this.sellerLookupResponse==null && other.getSellerLookupResponse()==null) || 
             (this.sellerLookupResponse!=null &&
              this.sellerLookupResponse.equals(other.getSellerLookupResponse()))) &&
            ((this.cartGetResponse==null && other.getCartGetResponse()==null) || 
             (this.cartGetResponse!=null &&
              this.cartGetResponse.equals(other.getCartGetResponse()))) &&
            ((this.cartAddResponse==null && other.getCartAddResponse()==null) || 
             (this.cartAddResponse!=null &&
              this.cartAddResponse.equals(other.getCartAddResponse()))) &&
            ((this.cartCreateResponse==null && other.getCartCreateResponse()==null) || 
             (this.cartCreateResponse!=null &&
              this.cartCreateResponse.equals(other.getCartCreateResponse()))) &&
            ((this.cartModifyResponse==null && other.getCartModifyResponse()==null) || 
             (this.cartModifyResponse!=null &&
              this.cartModifyResponse.equals(other.getCartModifyResponse()))) &&
            ((this.cartClearResponse==null && other.getCartClearResponse()==null) || 
             (this.cartClearResponse!=null &&
              this.cartClearResponse.equals(other.getCartClearResponse()))) &&
            ((this.transactionLookupResponse==null && other.getTransactionLookupResponse()==null) || 
             (this.transactionLookupResponse!=null &&
              this.transactionLookupResponse.equals(other.getTransactionLookupResponse()))) &&
            ((this.sellerListingSearchResponse==null && other.getSellerListingSearchResponse()==null) || 
             (this.sellerListingSearchResponse!=null &&
              this.sellerListingSearchResponse.equals(other.getSellerListingSearchResponse()))) &&
            ((this.sellerListingLookupResponse==null && other.getSellerListingLookupResponse()==null) || 
             (this.sellerListingLookupResponse!=null &&
              this.sellerListingLookupResponse.equals(other.getSellerListingLookupResponse()))) &&
            ((this.browseNodeLookupResponse==null && other.getBrowseNodeLookupResponse()==null) || 
             (this.browseNodeLookupResponse!=null &&
              this.browseNodeLookupResponse.equals(other.getBrowseNodeLookupResponse())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getOperationRequest() != null) {
            _hashCode += getOperationRequest().hashCode();
        }
        if (getHelpResponse() != null) {
            _hashCode += getHelpResponse().hashCode();
        }
        if (getItemSearchResponse() != null) {
            _hashCode += getItemSearchResponse().hashCode();
        }
        if (getItemLookupResponse() != null) {
            _hashCode += getItemLookupResponse().hashCode();
        }
        if (getListSearchResponse() != null) {
            _hashCode += getListSearchResponse().hashCode();
        }
        if (getListLookupResponse() != null) {
            _hashCode += getListLookupResponse().hashCode();
        }
        if (getCustomerContentSearchResponse() != null) {
            _hashCode += getCustomerContentSearchResponse().hashCode();
        }
        if (getCustomerContentLookupResponse() != null) {
            _hashCode += getCustomerContentLookupResponse().hashCode();
        }
        if (getSimilarityLookupResponse() != null) {
            _hashCode += getSimilarityLookupResponse().hashCode();
        }
        if (getSellerLookupResponse() != null) {
            _hashCode += getSellerLookupResponse().hashCode();
        }
        if (getCartGetResponse() != null) {
            _hashCode += getCartGetResponse().hashCode();
        }
        if (getCartAddResponse() != null) {
            _hashCode += getCartAddResponse().hashCode();
        }
        if (getCartCreateResponse() != null) {
            _hashCode += getCartCreateResponse().hashCode();
        }
        if (getCartModifyResponse() != null) {
            _hashCode += getCartModifyResponse().hashCode();
        }
        if (getCartClearResponse() != null) {
            _hashCode += getCartClearResponse().hashCode();
        }
        if (getTransactionLookupResponse() != null) {
            _hashCode += getTransactionLookupResponse().hashCode();
        }
        if (getSellerListingSearchResponse() != null) {
            _hashCode += getSellerListingSearchResponse().hashCode();
        }
        if (getSellerListingLookupResponse() != null) {
            _hashCode += getSellerListingLookupResponse().hashCode();
        }
        if (getBrowseNodeLookupResponse() != null) {
            _hashCode += getBrowseNodeLookupResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MultiOperationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">MultiOperationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "OperationRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">OperationRequest"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helpResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "HelpResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">HelpResponse"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSearchResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "ItemSearchResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">ItemSearchResponse"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemLookupResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "ItemLookupResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">ItemLookupResponse"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listSearchResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "ListSearchResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">ListSearchResponse"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listLookupResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "ListLookupResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">ListLookupResponse"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerContentSearchResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CustomerContentSearchResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">CustomerContentSearchResponse"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerContentLookupResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CustomerContentLookupResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">CustomerContentLookupResponse"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("similarityLookupResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "SimilarityLookupResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">SimilarityLookupResponse"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerLookupResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "SellerLookupResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">SellerLookupResponse"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartGetResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CartGetResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">CartGetResponse"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartAddResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CartAddResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">CartAddResponse"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartCreateResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CartCreateResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">CartCreateResponse"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartModifyResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CartModifyResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">CartModifyResponse"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartClearResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CartClearResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">CartClearResponse"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionLookupResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "TransactionLookupResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">TransactionLookupResponse"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerListingSearchResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "SellerListingSearchResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">SellerListingSearchResponse"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerListingLookupResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "SellerListingLookupResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">SellerListingLookupResponse"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browseNodeLookupResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "BrowseNodeLookupResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">BrowseNodeLookupResponse"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
