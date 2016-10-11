/**
 * TracksDisc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class TracksDisc  implements java.io.Serializable {
    private com.amazon.xml.AWSECommerceServer.TracksDiscTrack[] track;
    private org.apache.axis.types.PositiveInteger number;  // attribute

    public TracksDisc() {
    }

    public TracksDisc(
           org.apache.axis.types.PositiveInteger number,
           com.amazon.xml.AWSECommerceServer.TracksDiscTrack[] track) {
           this.track = track;
           this.number = number;
    }


    /**
     * Gets the track value for this TracksDisc.
     * 
     * @return track
     */
    public com.amazon.xml.AWSECommerceServer.TracksDiscTrack[] getTrack() {
        return track;
    }


    /**
     * Sets the track value for this TracksDisc.
     * 
     * @param track
     */
    public void setTrack(com.amazon.xml.AWSECommerceServer.TracksDiscTrack[] track) {
        this.track = track;
    }

    public com.amazon.xml.AWSECommerceServer.TracksDiscTrack getTrack(int i) {
        return this.track[i];
    }

    public void setTrack(int i, com.amazon.xml.AWSECommerceServer.TracksDiscTrack _value) {
        this.track[i] = _value;
    }


    /**
     * Gets the number value for this TracksDisc.
     * 
     * @return number
     */
    public org.apache.axis.types.PositiveInteger getNumber() {
        return number;
    }


    /**
     * Sets the number value for this TracksDisc.
     * 
     * @param number
     */
    public void setNumber(org.apache.axis.types.PositiveInteger number) {
        this.number = number;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TracksDisc)) return false;
        TracksDisc other = (TracksDisc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.track==null && other.getTrack()==null) || 
             (this.track!=null &&
              java.util.Arrays.equals(this.track, other.getTrack()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber())));
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
        if (getTrack() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrack());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrack(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TracksDisc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">>Tracks>Disc"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("number");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Number"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("track");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Track"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">>>Tracks>Disc>Track"));
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
