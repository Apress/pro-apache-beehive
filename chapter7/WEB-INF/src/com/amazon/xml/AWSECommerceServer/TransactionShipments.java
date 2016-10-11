/**
 * TransactionShipments.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class TransactionShipments  implements java.io.Serializable {
    private com.amazon.xml.AWSECommerceServer.TransactionShipmentsShipment[] shipment;

    public TransactionShipments() {
    }

    public TransactionShipments(
           com.amazon.xml.AWSECommerceServer.TransactionShipmentsShipment[] shipment) {
           this.shipment = shipment;
    }


    /**
     * Gets the shipment value for this TransactionShipments.
     * 
     * @return shipment
     */
    public com.amazon.xml.AWSECommerceServer.TransactionShipmentsShipment[] getShipment() {
        return shipment;
    }


    /**
     * Sets the shipment value for this TransactionShipments.
     * 
     * @param shipment
     */
    public void setShipment(com.amazon.xml.AWSECommerceServer.TransactionShipmentsShipment[] shipment) {
        this.shipment = shipment;
    }

    public com.amazon.xml.AWSECommerceServer.TransactionShipmentsShipment getShipment(int i) {
        return this.shipment[i];
    }

    public void setShipment(int i, com.amazon.xml.AWSECommerceServer.TransactionShipmentsShipment _value) {
        this.shipment[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionShipments)) return false;
        TransactionShipments other = (TransactionShipments) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shipment==null && other.getShipment()==null) || 
             (this.shipment!=null &&
              java.util.Arrays.equals(this.shipment, other.getShipment())));
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
        if (getShipment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipment(), i);
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
        new org.apache.axis.description.TypeDesc(TransactionShipments.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">>Transaction>Shipments"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Shipment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">>>Transaction>Shipments>Shipment"));
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
