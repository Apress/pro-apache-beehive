/**
 * BrowseNode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class BrowseNode  implements java.io.Serializable {
    private java.lang.String browseNodeId;
    private java.lang.String name;
    private com.amazon.xml.AWSECommerceServer.BrowseNodeChildren children;
    private com.amazon.xml.AWSECommerceServer.BrowseNodeAncestors ancestors;

    public BrowseNode() {
    }

    public BrowseNode(
           com.amazon.xml.AWSECommerceServer.BrowseNodeAncestors ancestors,
           java.lang.String browseNodeId,
           com.amazon.xml.AWSECommerceServer.BrowseNodeChildren children,
           java.lang.String name) {
           this.browseNodeId = browseNodeId;
           this.name = name;
           this.children = children;
           this.ancestors = ancestors;
    }


    /**
     * Gets the browseNodeId value for this BrowseNode.
     * 
     * @return browseNodeId
     */
    public java.lang.String getBrowseNodeId() {
        return browseNodeId;
    }


    /**
     * Sets the browseNodeId value for this BrowseNode.
     * 
     * @param browseNodeId
     */
    public void setBrowseNodeId(java.lang.String browseNodeId) {
        this.browseNodeId = browseNodeId;
    }


    /**
     * Gets the name value for this BrowseNode.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this BrowseNode.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the children value for this BrowseNode.
     * 
     * @return children
     */
    public com.amazon.xml.AWSECommerceServer.BrowseNodeChildren getChildren() {
        return children;
    }


    /**
     * Sets the children value for this BrowseNode.
     * 
     * @param children
     */
    public void setChildren(com.amazon.xml.AWSECommerceServer.BrowseNodeChildren children) {
        this.children = children;
    }


    /**
     * Gets the ancestors value for this BrowseNode.
     * 
     * @return ancestors
     */
    public com.amazon.xml.AWSECommerceServer.BrowseNodeAncestors getAncestors() {
        return ancestors;
    }


    /**
     * Sets the ancestors value for this BrowseNode.
     * 
     * @param ancestors
     */
    public void setAncestors(com.amazon.xml.AWSECommerceServer.BrowseNodeAncestors ancestors) {
        this.ancestors = ancestors;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BrowseNode)) return false;
        BrowseNode other = (BrowseNode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.browseNodeId==null && other.getBrowseNodeId()==null) || 
             (this.browseNodeId!=null &&
              this.browseNodeId.equals(other.getBrowseNodeId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.children==null && other.getChildren()==null) || 
             (this.children!=null &&
              this.children.equals(other.getChildren()))) &&
            ((this.ancestors==null && other.getAncestors()==null) || 
             (this.ancestors!=null &&
              this.ancestors.equals(other.getAncestors())));
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
        if (getBrowseNodeId() != null) {
            _hashCode += getBrowseNodeId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getChildren() != null) {
            _hashCode += getChildren().hashCode();
        }
        if (getAncestors() != null) {
            _hashCode += getAncestors().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BrowseNode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">BrowseNode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browseNodeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "BrowseNodeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">>BrowseNode>Children"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancestors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Ancestors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">>BrowseNode>Ancestors"));
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
