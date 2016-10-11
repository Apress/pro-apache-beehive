/**
 * CartAddResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class CartAddResponse  implements java.io.Serializable {
    private com.amazon.xml.AWSECommerceServer.OperationRequest operationRequest;
    private com.amazon.xml.AWSECommerceServer.Cart[] cart;

    public CartAddResponse() {
    }

    public CartAddResponse(
           com.amazon.xml.AWSECommerceServer.Cart[] cart,
           com.amazon.xml.AWSECommerceServer.OperationRequest operationRequest) {
           this.operationRequest = operationRequest;
           this.cart = cart;
    }


    /**
     * Gets the operationRequest value for this CartAddResponse.
     * 
     * @return operationRequest
     */
    public com.amazon.xml.AWSECommerceServer.OperationRequest getOperationRequest() {
        return operationRequest;
    }


    /**
     * Sets the operationRequest value for this CartAddResponse.
     * 
     * @param operationRequest
     */
    public void setOperationRequest(com.amazon.xml.AWSECommerceServer.OperationRequest operationRequest) {
        this.operationRequest = operationRequest;
    }


    /**
     * Gets the cart value for this CartAddResponse.
     * 
     * @return cart
     */
    public com.amazon.xml.AWSECommerceServer.Cart[] getCart() {
        return cart;
    }


    /**
     * Sets the cart value for this CartAddResponse.
     * 
     * @param cart
     */
    public void setCart(com.amazon.xml.AWSECommerceServer.Cart[] cart) {
        this.cart = cart;
    }

    public com.amazon.xml.AWSECommerceServer.Cart getCart(int i) {
        return this.cart[i];
    }

    public void setCart(int i, com.amazon.xml.AWSECommerceServer.Cart _value) {
        this.cart[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CartAddResponse)) return false;
        CartAddResponse other = (CartAddResponse) obj;
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
            ((this.cart==null && other.getCart()==null) || 
             (this.cart!=null &&
              java.util.Arrays.equals(this.cart, other.getCart())));
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
        if (getCart() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCart());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCart(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CartAddResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">CartAddResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "OperationRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">OperationRequest"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Cart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">Cart"));
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
