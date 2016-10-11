/**
 * OperationInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class OperationInformation  implements java.io.Serializable {
    private java.lang.String name;
    private java.lang.String description;
    private com.amazon.xml.AWSECommerceServer.OperationInformationRequiredParameters requiredParameters;
    private com.amazon.xml.AWSECommerceServer.OperationInformationAvailableParameters availableParameters;
    private com.amazon.xml.AWSECommerceServer.OperationInformationDefaultResponseGroups defaultResponseGroups;
    private com.amazon.xml.AWSECommerceServer.OperationInformationAvailableResponseGroups availableResponseGroups;

    public OperationInformation() {
    }

    public OperationInformation(
           com.amazon.xml.AWSECommerceServer.OperationInformationAvailableParameters availableParameters,
           com.amazon.xml.AWSECommerceServer.OperationInformationAvailableResponseGroups availableResponseGroups,
           com.amazon.xml.AWSECommerceServer.OperationInformationDefaultResponseGroups defaultResponseGroups,
           java.lang.String description,
           java.lang.String name,
           com.amazon.xml.AWSECommerceServer.OperationInformationRequiredParameters requiredParameters) {
           this.name = name;
           this.description = description;
           this.requiredParameters = requiredParameters;
           this.availableParameters = availableParameters;
           this.defaultResponseGroups = defaultResponseGroups;
           this.availableResponseGroups = availableResponseGroups;
    }


    /**
     * Gets the name value for this OperationInformation.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OperationInformation.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this OperationInformation.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OperationInformation.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the requiredParameters value for this OperationInformation.
     * 
     * @return requiredParameters
     */
    public com.amazon.xml.AWSECommerceServer.OperationInformationRequiredParameters getRequiredParameters() {
        return requiredParameters;
    }


    /**
     * Sets the requiredParameters value for this OperationInformation.
     * 
     * @param requiredParameters
     */
    public void setRequiredParameters(com.amazon.xml.AWSECommerceServer.OperationInformationRequiredParameters requiredParameters) {
        this.requiredParameters = requiredParameters;
    }


    /**
     * Gets the availableParameters value for this OperationInformation.
     * 
     * @return availableParameters
     */
    public com.amazon.xml.AWSECommerceServer.OperationInformationAvailableParameters getAvailableParameters() {
        return availableParameters;
    }


    /**
     * Sets the availableParameters value for this OperationInformation.
     * 
     * @param availableParameters
     */
    public void setAvailableParameters(com.amazon.xml.AWSECommerceServer.OperationInformationAvailableParameters availableParameters) {
        this.availableParameters = availableParameters;
    }


    /**
     * Gets the defaultResponseGroups value for this OperationInformation.
     * 
     * @return defaultResponseGroups
     */
    public com.amazon.xml.AWSECommerceServer.OperationInformationDefaultResponseGroups getDefaultResponseGroups() {
        return defaultResponseGroups;
    }


    /**
     * Sets the defaultResponseGroups value for this OperationInformation.
     * 
     * @param defaultResponseGroups
     */
    public void setDefaultResponseGroups(com.amazon.xml.AWSECommerceServer.OperationInformationDefaultResponseGroups defaultResponseGroups) {
        this.defaultResponseGroups = defaultResponseGroups;
    }


    /**
     * Gets the availableResponseGroups value for this OperationInformation.
     * 
     * @return availableResponseGroups
     */
    public com.amazon.xml.AWSECommerceServer.OperationInformationAvailableResponseGroups getAvailableResponseGroups() {
        return availableResponseGroups;
    }


    /**
     * Sets the availableResponseGroups value for this OperationInformation.
     * 
     * @param availableResponseGroups
     */
    public void setAvailableResponseGroups(com.amazon.xml.AWSECommerceServer.OperationInformationAvailableResponseGroups availableResponseGroups) {
        this.availableResponseGroups = availableResponseGroups;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationInformation)) return false;
        OperationInformation other = (OperationInformation) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.requiredParameters==null && other.getRequiredParameters()==null) || 
             (this.requiredParameters!=null &&
              this.requiredParameters.equals(other.getRequiredParameters()))) &&
            ((this.availableParameters==null && other.getAvailableParameters()==null) || 
             (this.availableParameters!=null &&
              this.availableParameters.equals(other.getAvailableParameters()))) &&
            ((this.defaultResponseGroups==null && other.getDefaultResponseGroups()==null) || 
             (this.defaultResponseGroups!=null &&
              this.defaultResponseGroups.equals(other.getDefaultResponseGroups()))) &&
            ((this.availableResponseGroups==null && other.getAvailableResponseGroups()==null) || 
             (this.availableResponseGroups!=null &&
              this.availableResponseGroups.equals(other.getAvailableResponseGroups())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getRequiredParameters() != null) {
            _hashCode += getRequiredParameters().hashCode();
        }
        if (getAvailableParameters() != null) {
            _hashCode += getAvailableParameters().hashCode();
        }
        if (getDefaultResponseGroups() != null) {
            _hashCode += getDefaultResponseGroups().hashCode();
        }
        if (getAvailableResponseGroups() != null) {
            _hashCode += getAvailableResponseGroups().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperationInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">OperationInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requiredParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "RequiredParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">>OperationInformation>RequiredParameters"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableParameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "AvailableParameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">>OperationInformation>AvailableParameters"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultResponseGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "DefaultResponseGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">>OperationInformation>DefaultResponseGroups"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableResponseGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "AvailableResponseGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">>OperationInformation>AvailableResponseGroups"));
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
