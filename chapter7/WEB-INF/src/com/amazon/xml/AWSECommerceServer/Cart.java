/**
 * Cart.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class Cart  implements java.io.Serializable {
    private com.amazon.xml.AWSECommerceServer.Request request;
    private java.lang.String cartId;
    private java.lang.String HMAC;
    private java.lang.String URLEncodedHMAC;
    private java.lang.String purchaseURL;
    private com.amazon.xml.AWSECommerceServer.Price subTotal;
    private com.amazon.xml.AWSECommerceServer.CartItems cartItems;
    private com.amazon.xml.AWSECommerceServer.SavedForLaterItems savedForLaterItems;
    private com.amazon.xml.AWSECommerceServer.SimilarProducts similarProducts;

    public Cart() {
    }

    public Cart(
           java.lang.String HMAC,
           java.lang.String URLEncodedHMAC,
           java.lang.String cartId,
           com.amazon.xml.AWSECommerceServer.CartItems cartItems,
           java.lang.String purchaseURL,
           com.amazon.xml.AWSECommerceServer.Request request,
           com.amazon.xml.AWSECommerceServer.SavedForLaterItems savedForLaterItems,
           com.amazon.xml.AWSECommerceServer.SimilarProducts similarProducts,
           com.amazon.xml.AWSECommerceServer.Price subTotal) {
           this.request = request;
           this.cartId = cartId;
           this.HMAC = HMAC;
           this.URLEncodedHMAC = URLEncodedHMAC;
           this.purchaseURL = purchaseURL;
           this.subTotal = subTotal;
           this.cartItems = cartItems;
           this.savedForLaterItems = savedForLaterItems;
           this.similarProducts = similarProducts;
    }


    /**
     * Gets the request value for this Cart.
     * 
     * @return request
     */
    public com.amazon.xml.AWSECommerceServer.Request getRequest() {
        return request;
    }


    /**
     * Sets the request value for this Cart.
     * 
     * @param request
     */
    public void setRequest(com.amazon.xml.AWSECommerceServer.Request request) {
        this.request = request;
    }


    /**
     * Gets the cartId value for this Cart.
     * 
     * @return cartId
     */
    public java.lang.String getCartId() {
        return cartId;
    }


    /**
     * Sets the cartId value for this Cart.
     * 
     * @param cartId
     */
    public void setCartId(java.lang.String cartId) {
        this.cartId = cartId;
    }


    /**
     * Gets the HMAC value for this Cart.
     * 
     * @return HMAC
     */
    public java.lang.String getHMAC() {
        return HMAC;
    }


    /**
     * Sets the HMAC value for this Cart.
     * 
     * @param HMAC
     */
    public void setHMAC(java.lang.String HMAC) {
        this.HMAC = HMAC;
    }


    /**
     * Gets the URLEncodedHMAC value for this Cart.
     * 
     * @return URLEncodedHMAC
     */
    public java.lang.String getURLEncodedHMAC() {
        return URLEncodedHMAC;
    }


    /**
     * Sets the URLEncodedHMAC value for this Cart.
     * 
     * @param URLEncodedHMAC
     */
    public void setURLEncodedHMAC(java.lang.String URLEncodedHMAC) {
        this.URLEncodedHMAC = URLEncodedHMAC;
    }


    /**
     * Gets the purchaseURL value for this Cart.
     * 
     * @return purchaseURL
     */
    public java.lang.String getPurchaseURL() {
        return purchaseURL;
    }


    /**
     * Sets the purchaseURL value for this Cart.
     * 
     * @param purchaseURL
     */
    public void setPurchaseURL(java.lang.String purchaseURL) {
        this.purchaseURL = purchaseURL;
    }


    /**
     * Gets the subTotal value for this Cart.
     * 
     * @return subTotal
     */
    public com.amazon.xml.AWSECommerceServer.Price getSubTotal() {
        return subTotal;
    }


    /**
     * Sets the subTotal value for this Cart.
     * 
     * @param subTotal
     */
    public void setSubTotal(com.amazon.xml.AWSECommerceServer.Price subTotal) {
        this.subTotal = subTotal;
    }


    /**
     * Gets the cartItems value for this Cart.
     * 
     * @return cartItems
     */
    public com.amazon.xml.AWSECommerceServer.CartItems getCartItems() {
        return cartItems;
    }


    /**
     * Sets the cartItems value for this Cart.
     * 
     * @param cartItems
     */
    public void setCartItems(com.amazon.xml.AWSECommerceServer.CartItems cartItems) {
        this.cartItems = cartItems;
    }


    /**
     * Gets the savedForLaterItems value for this Cart.
     * 
     * @return savedForLaterItems
     */
    public com.amazon.xml.AWSECommerceServer.SavedForLaterItems getSavedForLaterItems() {
        return savedForLaterItems;
    }


    /**
     * Sets the savedForLaterItems value for this Cart.
     * 
     * @param savedForLaterItems
     */
    public void setSavedForLaterItems(com.amazon.xml.AWSECommerceServer.SavedForLaterItems savedForLaterItems) {
        this.savedForLaterItems = savedForLaterItems;
    }


    /**
     * Gets the similarProducts value for this Cart.
     * 
     * @return similarProducts
     */
    public com.amazon.xml.AWSECommerceServer.SimilarProducts getSimilarProducts() {
        return similarProducts;
    }


    /**
     * Sets the similarProducts value for this Cart.
     * 
     * @param similarProducts
     */
    public void setSimilarProducts(com.amazon.xml.AWSECommerceServer.SimilarProducts similarProducts) {
        this.similarProducts = similarProducts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cart)) return false;
        Cart other = (Cart) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.request==null && other.getRequest()==null) || 
             (this.request!=null &&
              this.request.equals(other.getRequest()))) &&
            ((this.cartId==null && other.getCartId()==null) || 
             (this.cartId!=null &&
              this.cartId.equals(other.getCartId()))) &&
            ((this.HMAC==null && other.getHMAC()==null) || 
             (this.HMAC!=null &&
              this.HMAC.equals(other.getHMAC()))) &&
            ((this.URLEncodedHMAC==null && other.getURLEncodedHMAC()==null) || 
             (this.URLEncodedHMAC!=null &&
              this.URLEncodedHMAC.equals(other.getURLEncodedHMAC()))) &&
            ((this.purchaseURL==null && other.getPurchaseURL()==null) || 
             (this.purchaseURL!=null &&
              this.purchaseURL.equals(other.getPurchaseURL()))) &&
            ((this.subTotal==null && other.getSubTotal()==null) || 
             (this.subTotal!=null &&
              this.subTotal.equals(other.getSubTotal()))) &&
            ((this.cartItems==null && other.getCartItems()==null) || 
             (this.cartItems!=null &&
              this.cartItems.equals(other.getCartItems()))) &&
            ((this.savedForLaterItems==null && other.getSavedForLaterItems()==null) || 
             (this.savedForLaterItems!=null &&
              this.savedForLaterItems.equals(other.getSavedForLaterItems()))) &&
            ((this.similarProducts==null && other.getSimilarProducts()==null) || 
             (this.similarProducts!=null &&
              this.similarProducts.equals(other.getSimilarProducts())));
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
        if (getRequest() != null) {
            _hashCode += getRequest().hashCode();
        }
        if (getCartId() != null) {
            _hashCode += getCartId().hashCode();
        }
        if (getHMAC() != null) {
            _hashCode += getHMAC().hashCode();
        }
        if (getURLEncodedHMAC() != null) {
            _hashCode += getURLEncodedHMAC().hashCode();
        }
        if (getPurchaseURL() != null) {
            _hashCode += getPurchaseURL().hashCode();
        }
        if (getSubTotal() != null) {
            _hashCode += getSubTotal().hashCode();
        }
        if (getCartItems() != null) {
            _hashCode += getCartItems().hashCode();
        }
        if (getSavedForLaterItems() != null) {
            _hashCode += getSavedForLaterItems().hashCode();
        }
        if (getSimilarProducts() != null) {
            _hashCode += getSimilarProducts().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cart.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">Cart"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">Request"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CartId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HMAC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "HMAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLEncodedHMAC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "URLEncodedHMAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "PurchaseURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "SubTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Price"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CartItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">CartItems"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("savedForLaterItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "SavedForLaterItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">SavedForLaterItems"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("similarProducts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "SimilarProducts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">SimilarProducts"));
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
