/**
 * BrowseNodeAncestors.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class BrowseNodeAncestors  implements java.io.Serializable {
    private com.amazon.xml.AWSECommerceServer.BrowseNode[] browseNode;

    public BrowseNodeAncestors() {
    }

    public BrowseNodeAncestors(
           com.amazon.xml.AWSECommerceServer.BrowseNode[] browseNode) {
           this.browseNode = browseNode;
    }


    /**
     * Gets the browseNode value for this BrowseNodeAncestors.
     * 
     * @return browseNode
     */
    public com.amazon.xml.AWSECommerceServer.BrowseNode[] getBrowseNode() {
        return browseNode;
    }


    /**
     * Sets the browseNode value for this BrowseNodeAncestors.
     * 
     * @param browseNode
     */
    public void setBrowseNode(com.amazon.xml.AWSECommerceServer.BrowseNode[] browseNode) {
        this.browseNode = browseNode;
    }

    public com.amazon.xml.AWSECommerceServer.BrowseNode getBrowseNode(int i) {
        return this.browseNode[i];
    }

    public void setBrowseNode(int i, com.amazon.xml.AWSECommerceServer.BrowseNode _value) {
        this.browseNode[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BrowseNodeAncestors)) return false;
        BrowseNodeAncestors other = (BrowseNodeAncestors) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.browseNode==null && other.getBrowseNode()==null) || 
             (this.browseNode!=null &&
              java.util.Arrays.equals(this.browseNode, other.getBrowseNode())));
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
        if (getBrowseNode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBrowseNode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBrowseNode(), i);
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
        new org.apache.axis.description.TypeDesc(BrowseNodeAncestors.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">>BrowseNode>Ancestors"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browseNode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "BrowseNode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">BrowseNode"));
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
