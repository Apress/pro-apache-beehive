/**
 * SearchResultsMap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class SearchResultsMap  implements java.io.Serializable {
    private com.amazon.xml.AWSECommerceServer.SearchResultsMapSearchIndex[] searchIndex;

    public SearchResultsMap() {
    }

    public SearchResultsMap(
           com.amazon.xml.AWSECommerceServer.SearchResultsMapSearchIndex[] searchIndex) {
           this.searchIndex = searchIndex;
    }


    /**
     * Gets the searchIndex value for this SearchResultsMap.
     * 
     * @return searchIndex
     */
    public com.amazon.xml.AWSECommerceServer.SearchResultsMapSearchIndex[] getSearchIndex() {
        return searchIndex;
    }


    /**
     * Sets the searchIndex value for this SearchResultsMap.
     * 
     * @param searchIndex
     */
    public void setSearchIndex(com.amazon.xml.AWSECommerceServer.SearchResultsMapSearchIndex[] searchIndex) {
        this.searchIndex = searchIndex;
    }

    public com.amazon.xml.AWSECommerceServer.SearchResultsMapSearchIndex getSearchIndex(int i) {
        return this.searchIndex[i];
    }

    public void setSearchIndex(int i, com.amazon.xml.AWSECommerceServer.SearchResultsMapSearchIndex _value) {
        this.searchIndex[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchResultsMap)) return false;
        SearchResultsMap other = (SearchResultsMap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.searchIndex==null && other.getSearchIndex()==null) || 
             (this.searchIndex!=null &&
              java.util.Arrays.equals(this.searchIndex, other.getSearchIndex())));
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
        if (getSearchIndex() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchIndex());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchIndex(), i);
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
        new org.apache.axis.description.TypeDesc(SearchResultsMap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">SearchResultsMap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "SearchIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">>SearchResultsMap>SearchIndex"));
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
