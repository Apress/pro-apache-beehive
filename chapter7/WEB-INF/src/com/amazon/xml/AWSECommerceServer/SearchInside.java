/**
 * SearchInside.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class SearchInside  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger totalExcerpts;
    private com.amazon.xml.AWSECommerceServer.SearchInsideExcerpt excerpt;

    public SearchInside() {
    }

    public SearchInside(
           com.amazon.xml.AWSECommerceServer.SearchInsideExcerpt excerpt,
           org.apache.axis.types.NonNegativeInteger totalExcerpts) {
           this.totalExcerpts = totalExcerpts;
           this.excerpt = excerpt;
    }


    /**
     * Gets the totalExcerpts value for this SearchInside.
     * 
     * @return totalExcerpts
     */
    public org.apache.axis.types.NonNegativeInteger getTotalExcerpts() {
        return totalExcerpts;
    }


    /**
     * Sets the totalExcerpts value for this SearchInside.
     * 
     * @param totalExcerpts
     */
    public void setTotalExcerpts(org.apache.axis.types.NonNegativeInteger totalExcerpts) {
        this.totalExcerpts = totalExcerpts;
    }


    /**
     * Gets the excerpt value for this SearchInside.
     * 
     * @return excerpt
     */
    public com.amazon.xml.AWSECommerceServer.SearchInsideExcerpt getExcerpt() {
        return excerpt;
    }


    /**
     * Sets the excerpt value for this SearchInside.
     * 
     * @param excerpt
     */
    public void setExcerpt(com.amazon.xml.AWSECommerceServer.SearchInsideExcerpt excerpt) {
        this.excerpt = excerpt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchInside)) return false;
        SearchInside other = (SearchInside) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.totalExcerpts==null && other.getTotalExcerpts()==null) || 
             (this.totalExcerpts!=null &&
              this.totalExcerpts.equals(other.getTotalExcerpts()))) &&
            ((this.excerpt==null && other.getExcerpt()==null) || 
             (this.excerpt!=null &&
              this.excerpt.equals(other.getExcerpt())));
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
        if (getTotalExcerpts() != null) {
            _hashCode += getTotalExcerpts().hashCode();
        }
        if (getExcerpt() != null) {
            _hashCode += getExcerpt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchInside.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">SearchInside"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalExcerpts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "TotalExcerpts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excerpt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Excerpt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">>SearchInside>Excerpt"));
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
