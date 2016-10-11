/**
 * BrowseNodeLookupResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class BrowseNodeLookupResponse  implements java.io.Serializable {
    private com.amazon.xml.AWSECommerceServer.OperationRequest operationRequest;
    private com.amazon.xml.AWSECommerceServer.BrowseNodes[] browseNodes;

    public BrowseNodeLookupResponse() {
    }

    public BrowseNodeLookupResponse(
           com.amazon.xml.AWSECommerceServer.BrowseNodes[] browseNodes,
           com.amazon.xml.AWSECommerceServer.OperationRequest operationRequest) {
           this.operationRequest = operationRequest;
           this.browseNodes = browseNodes;
    }


    /**
     * Gets the operationRequest value for this BrowseNodeLookupResponse.
     * 
     * @return operationRequest
     */
    public com.amazon.xml.AWSECommerceServer.OperationRequest getOperationRequest() {
        return operationRequest;
    }


    /**
     * Sets the operationRequest value for this BrowseNodeLookupResponse.
     * 
     * @param operationRequest
     */
    public void setOperationRequest(com.amazon.xml.AWSECommerceServer.OperationRequest operationRequest) {
        this.operationRequest = operationRequest;
    }


    /**
     * Gets the browseNodes value for this BrowseNodeLookupResponse.
     * 
     * @return browseNodes
     */
    public com.amazon.xml.AWSECommerceServer.BrowseNodes[] getBrowseNodes() {
        return browseNodes;
    }


    /**
     * Sets the browseNodes value for this BrowseNodeLookupResponse.
     * 
     * @param browseNodes
     */
    public void setBrowseNodes(com.amazon.xml.AWSECommerceServer.BrowseNodes[] browseNodes) {
        this.browseNodes = browseNodes;
    }

    public com.amazon.xml.AWSECommerceServer.BrowseNodes getBrowseNodes(int i) {
        return this.browseNodes[i];
    }

    public void setBrowseNodes(int i, com.amazon.xml.AWSECommerceServer.BrowseNodes _value) {
        this.browseNodes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BrowseNodeLookupResponse)) return false;
        BrowseNodeLookupResponse other = (BrowseNodeLookupResponse) obj;
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
            ((this.browseNodes==null && other.getBrowseNodes()==null) || 
             (this.browseNodes!=null &&
              java.util.Arrays.equals(this.browseNodes, other.getBrowseNodes())));
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
        if (getBrowseNodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBrowseNodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBrowseNodes(), i);
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
        new org.apache.axis.description.TypeDesc(BrowseNodeLookupResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">BrowseNodeLookupResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "OperationRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">OperationRequest"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browseNodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "BrowseNodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">BrowseNodes"));
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
