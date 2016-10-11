/**
 * EditorialReviews.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class EditorialReviews  implements java.io.Serializable {
    private com.amazon.xml.AWSECommerceServer.EditorialReview[] editorialReview;

    public EditorialReviews() {
    }

    public EditorialReviews(
           com.amazon.xml.AWSECommerceServer.EditorialReview[] editorialReview) {
           this.editorialReview = editorialReview;
    }


    /**
     * Gets the editorialReview value for this EditorialReviews.
     * 
     * @return editorialReview
     */
    public com.amazon.xml.AWSECommerceServer.EditorialReview[] getEditorialReview() {
        return editorialReview;
    }


    /**
     * Sets the editorialReview value for this EditorialReviews.
     * 
     * @param editorialReview
     */
    public void setEditorialReview(com.amazon.xml.AWSECommerceServer.EditorialReview[] editorialReview) {
        this.editorialReview = editorialReview;
    }

    public com.amazon.xml.AWSECommerceServer.EditorialReview getEditorialReview(int i) {
        return this.editorialReview[i];
    }

    public void setEditorialReview(int i, com.amazon.xml.AWSECommerceServer.EditorialReview _value) {
        this.editorialReview[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EditorialReviews)) return false;
        EditorialReviews other = (EditorialReviews) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.editorialReview==null && other.getEditorialReview()==null) || 
             (this.editorialReview!=null &&
              java.util.Arrays.equals(this.editorialReview, other.getEditorialReview())));
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
        if (getEditorialReview() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEditorialReview());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEditorialReview(), i);
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
        new org.apache.axis.description.TypeDesc(EditorialReviews.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">EditorialReviews"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editorialReview");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "EditorialReview"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">EditorialReview"));
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
