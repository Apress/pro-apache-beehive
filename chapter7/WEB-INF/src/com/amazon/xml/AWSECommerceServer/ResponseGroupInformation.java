/**
 * ResponseGroupInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class ResponseGroupInformation  implements java.io.Serializable {
    private java.lang.String name;
    private java.lang.String creationDate;
    private com.amazon.xml.AWSECommerceServer.ResponseGroupInformationValidOperations validOperations;
    private com.amazon.xml.AWSECommerceServer.ResponseGroupInformationElements elements;

    public ResponseGroupInformation() {
    }

    public ResponseGroupInformation(
           java.lang.String creationDate,
           com.amazon.xml.AWSECommerceServer.ResponseGroupInformationElements elements,
           java.lang.String name,
           com.amazon.xml.AWSECommerceServer.ResponseGroupInformationValidOperations validOperations) {
           this.name = name;
           this.creationDate = creationDate;
           this.validOperations = validOperations;
           this.elements = elements;
    }


    /**
     * Gets the name value for this ResponseGroupInformation.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ResponseGroupInformation.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the creationDate value for this ResponseGroupInformation.
     * 
     * @return creationDate
     */
    public java.lang.String getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this ResponseGroupInformation.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.lang.String creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the validOperations value for this ResponseGroupInformation.
     * 
     * @return validOperations
     */
    public com.amazon.xml.AWSECommerceServer.ResponseGroupInformationValidOperations getValidOperations() {
        return validOperations;
    }


    /**
     * Sets the validOperations value for this ResponseGroupInformation.
     * 
     * @param validOperations
     */
    public void setValidOperations(com.amazon.xml.AWSECommerceServer.ResponseGroupInformationValidOperations validOperations) {
        this.validOperations = validOperations;
    }


    /**
     * Gets the elements value for this ResponseGroupInformation.
     * 
     * @return elements
     */
    public com.amazon.xml.AWSECommerceServer.ResponseGroupInformationElements getElements() {
        return elements;
    }


    /**
     * Sets the elements value for this ResponseGroupInformation.
     * 
     * @param elements
     */
    public void setElements(com.amazon.xml.AWSECommerceServer.ResponseGroupInformationElements elements) {
        this.elements = elements;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseGroupInformation)) return false;
        ResponseGroupInformation other = (ResponseGroupInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.validOperations==null && other.getValidOperations()==null) || 
             (this.validOperations!=null &&
              this.validOperations.equals(other.getValidOperations()))) &&
            ((this.elements==null && other.getElements()==null) || 
             (this.elements!=null &&
              this.elements.equals(other.getElements())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getValidOperations() != null) {
            _hashCode += getValidOperations().hashCode();
        }
        if (getElements() != null) {
            _hashCode += getElements().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseGroupInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">ResponseGroupInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "CreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validOperations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "ValidOperations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">>ResponseGroupInformation>ValidOperations"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Elements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">>ResponseGroupInformation>Elements"));
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
