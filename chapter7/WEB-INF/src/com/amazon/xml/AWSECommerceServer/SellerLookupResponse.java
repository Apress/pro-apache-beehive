/**
 * SellerLookupResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class SellerLookupResponse  implements java.io.Serializable {
    private com.amazon.xml.AWSECommerceServer.OperationRequest operationRequest;
    private com.amazon.xml.AWSECommerceServer.Sellers[] sellers;

    public SellerLookupResponse() {
    }

    public SellerLookupResponse(
           com.amazon.xml.AWSECommerceServer.OperationRequest operationRequest,
           com.amazon.xml.AWSECommerceServer.Sellers[] sellers) {
           this.operationRequest = operationRequest;
           this.sellers = sellers;
    }


    /**
     * Gets the operationRequest value for this SellerLookupResponse.
     * 
     * @return operationRequest
     */
    public com.amazon.xml.AWSECommerceServer.OperationRequest getOperationRequest() {
        return operationRequest;
    }


    /**
     * Sets the operationRequest value for this SellerLookupResponse.
     * 
     * @param operationRequest
     */
    public void setOperationRequest(com.amazon.xml.AWSECommerceServer.OperationRequest operationRequest) {
        this.operationRequest = operationRequest;
    }


    /**
     * Gets the sellers value for this SellerLookupResponse.
     * 
     * @return sellers
     */
    public com.amazon.xml.AWSECommerceServer.Sellers[] getSellers() {
        return sellers;
    }


    /**
     * Sets the sellers value for this SellerLookupResponse.
     * 
     * @param sellers
     */
    public void setSellers(com.amazon.xml.AWSECommerceServer.Sellers[] sellers) {
        this.sellers = sellers;
    }

    public com.amazon.xml.AWSECommerceServer.Sellers getSellers(int i) {
        return this.sellers[i];
    }

    public void setSellers(int i, com.amazon.xml.AWSECommerceServer.Sellers _value) {
        this.sellers[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellerLookupResponse)) return false;
        SellerLookupResponse other = (SellerLookupResponse) obj;
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
            ((this.sellers==null && other.getSellers()==null) || 
             (this.sellers!=null &&
              java.util.Arrays.equals(this.sellers, other.getSellers())));
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
        if (getSellers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSellers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSellers(), i);
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
        new org.apache.axis.description.TypeDesc(SellerLookupResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">SellerLookupResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "OperationRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">OperationRequest"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Sellers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">Sellers"));
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
