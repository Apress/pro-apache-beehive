/**
 * Transactions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class Transactions  implements java.io.Serializable {
    private com.amazon.xml.AWSECommerceServer.Request request;
    private org.apache.axis.types.NonNegativeInteger totalResults;
    private org.apache.axis.types.NonNegativeInteger totalPages;
    private com.amazon.xml.AWSECommerceServer.Transaction[] transaction;

    public Transactions() {
    }

    public Transactions(
           com.amazon.xml.AWSECommerceServer.Request request,
           org.apache.axis.types.NonNegativeInteger totalPages,
           org.apache.axis.types.NonNegativeInteger totalResults,
           com.amazon.xml.AWSECommerceServer.Transaction[] transaction) {
           this.request = request;
           this.totalResults = totalResults;
           this.totalPages = totalPages;
           this.transaction = transaction;
    }


    /**
     * Gets the request value for this Transactions.
     * 
     * @return request
     */
    public com.amazon.xml.AWSECommerceServer.Request getRequest() {
        return request;
    }


    /**
     * Sets the request value for this Transactions.
     * 
     * @param request
     */
    public void setRequest(com.amazon.xml.AWSECommerceServer.Request request) {
        this.request = request;
    }


    /**
     * Gets the totalResults value for this Transactions.
     * 
     * @return totalResults
     */
    public org.apache.axis.types.NonNegativeInteger getTotalResults() {
        return totalResults;
    }


    /**
     * Sets the totalResults value for this Transactions.
     * 
     * @param totalResults
     */
    public void setTotalResults(org.apache.axis.types.NonNegativeInteger totalResults) {
        this.totalResults = totalResults;
    }


    /**
     * Gets the totalPages value for this Transactions.
     * 
     * @return totalPages
     */
    public org.apache.axis.types.NonNegativeInteger getTotalPages() {
        return totalPages;
    }


    /**
     * Sets the totalPages value for this Transactions.
     * 
     * @param totalPages
     */
    public void setTotalPages(org.apache.axis.types.NonNegativeInteger totalPages) {
        this.totalPages = totalPages;
    }


    /**
     * Gets the transaction value for this Transactions.
     * 
     * @return transaction
     */
    public com.amazon.xml.AWSECommerceServer.Transaction[] getTransaction() {
        return transaction;
    }


    /**
     * Sets the transaction value for this Transactions.
     * 
     * @param transaction
     */
    public void setTransaction(com.amazon.xml.AWSECommerceServer.Transaction[] transaction) {
        this.transaction = transaction;
    }

    public com.amazon.xml.AWSECommerceServer.Transaction getTransaction(int i) {
        return this.transaction[i];
    }

    public void setTransaction(int i, com.amazon.xml.AWSECommerceServer.Transaction _value) {
        this.transaction[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Transactions)) return false;
        Transactions other = (Transactions) obj;
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
            ((this.totalResults==null && other.getTotalResults()==null) || 
             (this.totalResults!=null &&
              this.totalResults.equals(other.getTotalResults()))) &&
            ((this.totalPages==null && other.getTotalPages()==null) || 
             (this.totalPages!=null &&
              this.totalPages.equals(other.getTotalPages()))) &&
            ((this.transaction==null && other.getTransaction()==null) || 
             (this.transaction!=null &&
              java.util.Arrays.equals(this.transaction, other.getTransaction())));
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
        if (getTotalResults() != null) {
            _hashCode += getTotalResults().hashCode();
        }
        if (getTotalPages() != null) {
            _hashCode += getTotalPages().hashCode();
        }
        if (getTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransaction(), i);
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
        new org.apache.axis.description.TypeDesc(Transactions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">Transactions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">Request"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalResults");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "TotalResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "TotalPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Transaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">Transaction"));
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
