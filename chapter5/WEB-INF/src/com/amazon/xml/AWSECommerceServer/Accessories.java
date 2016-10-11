/**
 * Accessories.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class Accessories  implements java.io.Serializable {
    private com.amazon.xml.AWSECommerceServer.AccessoriesAccessory[] accessory;

    public Accessories() {
    }

    public Accessories(
           com.amazon.xml.AWSECommerceServer.AccessoriesAccessory[] accessory) {
           this.accessory = accessory;
    }


    /**
     * Gets the accessory value for this Accessories.
     * 
     * @return accessory
     */
    public com.amazon.xml.AWSECommerceServer.AccessoriesAccessory[] getAccessory() {
        return accessory;
    }


    /**
     * Sets the accessory value for this Accessories.
     * 
     * @param accessory
     */
    public void setAccessory(com.amazon.xml.AWSECommerceServer.AccessoriesAccessory[] accessory) {
        this.accessory = accessory;
    }

    public com.amazon.xml.AWSECommerceServer.AccessoriesAccessory getAccessory(int i) {
        return this.accessory[i];
    }

    public void setAccessory(int i, com.amazon.xml.AWSECommerceServer.AccessoriesAccessory _value) {
        this.accessory[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Accessories)) return false;
        Accessories other = (Accessories) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessory==null && other.getAccessory()==null) || 
             (this.accessory!=null &&
              java.util.Arrays.equals(this.accessory, other.getAccessory())));
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
        if (getAccessory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccessory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccessory(), i);
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
        new org.apache.axis.description.TypeDesc(Accessories.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">Accessories"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Accessory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">>Accessories>Accessory"));
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
