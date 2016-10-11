/**
 * TransactionShipmentsShipmentPackages.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class TransactionShipmentsShipmentPackages  implements java.io.Serializable {
    private com.amazon.xml.AWSECommerceServer.TransactionShipmentsShipmentPackagesPackage[] _package;

    public TransactionShipmentsShipmentPackages() {
    }

    public TransactionShipmentsShipmentPackages(
           com.amazon.xml.AWSECommerceServer.TransactionShipmentsShipmentPackagesPackage[] _package) {
           this._package = _package;
    }


    /**
     * Gets the _package value for this TransactionShipmentsShipmentPackages.
     * 
     * @return _package
     */
    public com.amazon.xml.AWSECommerceServer.TransactionShipmentsShipmentPackagesPackage[] get_package() {
        return _package;
    }


    /**
     * Sets the _package value for this TransactionShipmentsShipmentPackages.
     * 
     * @param _package
     */
    public void set_package(com.amazon.xml.AWSECommerceServer.TransactionShipmentsShipmentPackagesPackage[] _package) {
        this._package = _package;
    }

    public com.amazon.xml.AWSECommerceServer.TransactionShipmentsShipmentPackagesPackage get_package(int i) {
        return this._package[i];
    }

    public void set_package(int i, com.amazon.xml.AWSECommerceServer.TransactionShipmentsShipmentPackagesPackage _value) {
        this._package[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionShipmentsShipmentPackages)) return false;
        TransactionShipmentsShipmentPackages other = (TransactionShipmentsShipmentPackages) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._package==null && other.get_package()==null) || 
             (this._package!=null &&
              java.util.Arrays.equals(this._package, other.get_package())));
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
        if (get_package() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_package());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_package(), i);
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
        new org.apache.axis.description.TypeDesc(TransactionShipmentsShipmentPackages.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">>>>Transaction>Shipments>Shipment>Packages"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_package");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Package"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">>>>>Transaction>Shipments>Shipment>Packages>Package"));
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
