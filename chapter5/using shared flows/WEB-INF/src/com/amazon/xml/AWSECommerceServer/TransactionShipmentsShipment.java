/**
 * TransactionShipmentsShipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class TransactionShipmentsShipment  implements java.io.Serializable {
    private java.lang.String condition;
    private java.lang.String deliveryMethod;
    private com.amazon.xml.AWSECommerceServer.TransactionShipmentsShipmentShipmentItems shipmentItems;
    private com.amazon.xml.AWSECommerceServer.TransactionShipmentsShipmentPackages packages;

    public TransactionShipmentsShipment() {
    }

    public TransactionShipmentsShipment(
           java.lang.String condition,
           java.lang.String deliveryMethod,
           com.amazon.xml.AWSECommerceServer.TransactionShipmentsShipmentPackages packages,
           com.amazon.xml.AWSECommerceServer.TransactionShipmentsShipmentShipmentItems shipmentItems) {
           this.condition = condition;
           this.deliveryMethod = deliveryMethod;
           this.shipmentItems = shipmentItems;
           this.packages = packages;
    }


    /**
     * Gets the condition value for this TransactionShipmentsShipment.
     * 
     * @return condition
     */
    public java.lang.String getCondition() {
        return condition;
    }


    /**
     * Sets the condition value for this TransactionShipmentsShipment.
     * 
     * @param condition
     */
    public void setCondition(java.lang.String condition) {
        this.condition = condition;
    }


    /**
     * Gets the deliveryMethod value for this TransactionShipmentsShipment.
     * 
     * @return deliveryMethod
     */
    public java.lang.String getDeliveryMethod() {
        return deliveryMethod;
    }


    /**
     * Sets the deliveryMethod value for this TransactionShipmentsShipment.
     * 
     * @param deliveryMethod
     */
    public void setDeliveryMethod(java.lang.String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }


    /**
     * Gets the shipmentItems value for this TransactionShipmentsShipment.
     * 
     * @return shipmentItems
     */
    public com.amazon.xml.AWSECommerceServer.TransactionShipmentsShipmentShipmentItems getShipmentItems() {
        return shipmentItems;
    }


    /**
     * Sets the shipmentItems value for this TransactionShipmentsShipment.
     * 
     * @param shipmentItems
     */
    public void setShipmentItems(com.amazon.xml.AWSECommerceServer.TransactionShipmentsShipmentShipmentItems shipmentItems) {
        this.shipmentItems = shipmentItems;
    }


    /**
     * Gets the packages value for this TransactionShipmentsShipment.
     * 
     * @return packages
     */
    public com.amazon.xml.AWSECommerceServer.TransactionShipmentsShipmentPackages getPackages() {
        return packages;
    }


    /**
     * Sets the packages value for this TransactionShipmentsShipment.
     * 
     * @param packages
     */
    public void setPackages(com.amazon.xml.AWSECommerceServer.TransactionShipmentsShipmentPackages packages) {
        this.packages = packages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionShipmentsShipment)) return false;
        TransactionShipmentsShipment other = (TransactionShipmentsShipment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.condition==null && other.getCondition()==null) || 
             (this.condition!=null &&
              this.condition.equals(other.getCondition()))) &&
            ((this.deliveryMethod==null && other.getDeliveryMethod()==null) || 
             (this.deliveryMethod!=null &&
              this.deliveryMethod.equals(other.getDeliveryMethod()))) &&
            ((this.shipmentItems==null && other.getShipmentItems()==null) || 
             (this.shipmentItems!=null &&
              this.shipmentItems.equals(other.getShipmentItems()))) &&
            ((this.packages==null && other.getPackages()==null) || 
             (this.packages!=null &&
              this.packages.equals(other.getPackages())));
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
        if (getCondition() != null) {
            _hashCode += getCondition().hashCode();
        }
        if (getDeliveryMethod() != null) {
            _hashCode += getDeliveryMethod().hashCode();
        }
        if (getShipmentItems() != null) {
            _hashCode += getShipmentItems().hashCode();
        }
        if (getPackages() != null) {
            _hashCode += getPackages().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionShipmentsShipment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">>>Transaction>Shipments>Shipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Condition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "DeliveryMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "ShipmentItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">>>>Transaction>Shipments>Shipment>ShipmentItems"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Packages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">>>>Transaction>Shipments>Shipment>Packages"));
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
