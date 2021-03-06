/**
 * OfferListing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class OfferListing  implements java.io.Serializable {
    private java.lang.String offerListingId;
    private java.lang.String exchangeId;
    private com.amazon.xml.AWSECommerceServer.Price price;
    private com.amazon.xml.AWSECommerceServer.Price salePrice;
    private java.lang.String availability;
    private com.amazon.xml.AWSECommerceServer.Address ISPUStoreAddress;
    private java.lang.String ISPUStoreHours;
    private java.lang.Boolean isEligibleForSuperSaverShipping;

    public OfferListing() {
    }

    public OfferListing(
           com.amazon.xml.AWSECommerceServer.Address ISPUStoreAddress,
           java.lang.String ISPUStoreHours,
           java.lang.String availability,
           java.lang.String exchangeId,
           java.lang.Boolean isEligibleForSuperSaverShipping,
           java.lang.String offerListingId,
           com.amazon.xml.AWSECommerceServer.Price price,
           com.amazon.xml.AWSECommerceServer.Price salePrice) {
           this.offerListingId = offerListingId;
           this.exchangeId = exchangeId;
           this.price = price;
           this.salePrice = salePrice;
           this.availability = availability;
           this.ISPUStoreAddress = ISPUStoreAddress;
           this.ISPUStoreHours = ISPUStoreHours;
           this.isEligibleForSuperSaverShipping = isEligibleForSuperSaverShipping;
    }


    /**
     * Gets the offerListingId value for this OfferListing.
     * 
     * @return offerListingId
     */
    public java.lang.String getOfferListingId() {
        return offerListingId;
    }


    /**
     * Sets the offerListingId value for this OfferListing.
     * 
     * @param offerListingId
     */
    public void setOfferListingId(java.lang.String offerListingId) {
        this.offerListingId = offerListingId;
    }


    /**
     * Gets the exchangeId value for this OfferListing.
     * 
     * @return exchangeId
     */
    public java.lang.String getExchangeId() {
        return exchangeId;
    }


    /**
     * Sets the exchangeId value for this OfferListing.
     * 
     * @param exchangeId
     */
    public void setExchangeId(java.lang.String exchangeId) {
        this.exchangeId = exchangeId;
    }


    /**
     * Gets the price value for this OfferListing.
     * 
     * @return price
     */
    public com.amazon.xml.AWSECommerceServer.Price getPrice() {
        return price;
    }


    /**
     * Sets the price value for this OfferListing.
     * 
     * @param price
     */
    public void setPrice(com.amazon.xml.AWSECommerceServer.Price price) {
        this.price = price;
    }


    /**
     * Gets the salePrice value for this OfferListing.
     * 
     * @return salePrice
     */
    public com.amazon.xml.AWSECommerceServer.Price getSalePrice() {
        return salePrice;
    }


    /**
     * Sets the salePrice value for this OfferListing.
     * 
     * @param salePrice
     */
    public void setSalePrice(com.amazon.xml.AWSECommerceServer.Price salePrice) {
        this.salePrice = salePrice;
    }


    /**
     * Gets the availability value for this OfferListing.
     * 
     * @return availability
     */
    public java.lang.String getAvailability() {
        return availability;
    }


    /**
     * Sets the availability value for this OfferListing.
     * 
     * @param availability
     */
    public void setAvailability(java.lang.String availability) {
        this.availability = availability;
    }


    /**
     * Gets the ISPUStoreAddress value for this OfferListing.
     * 
     * @return ISPUStoreAddress
     */
    public com.amazon.xml.AWSECommerceServer.Address getISPUStoreAddress() {
        return ISPUStoreAddress;
    }


    /**
     * Sets the ISPUStoreAddress value for this OfferListing.
     * 
     * @param ISPUStoreAddress
     */
    public void setISPUStoreAddress(com.amazon.xml.AWSECommerceServer.Address ISPUStoreAddress) {
        this.ISPUStoreAddress = ISPUStoreAddress;
    }


    /**
     * Gets the ISPUStoreHours value for this OfferListing.
     * 
     * @return ISPUStoreHours
     */
    public java.lang.String getISPUStoreHours() {
        return ISPUStoreHours;
    }


    /**
     * Sets the ISPUStoreHours value for this OfferListing.
     * 
     * @param ISPUStoreHours
     */
    public void setISPUStoreHours(java.lang.String ISPUStoreHours) {
        this.ISPUStoreHours = ISPUStoreHours;
    }


    /**
     * Gets the isEligibleForSuperSaverShipping value for this OfferListing.
     * 
     * @return isEligibleForSuperSaverShipping
     */
    public java.lang.Boolean getIsEligibleForSuperSaverShipping() {
        return isEligibleForSuperSaverShipping;
    }


    /**
     * Sets the isEligibleForSuperSaverShipping value for this OfferListing.
     * 
     * @param isEligibleForSuperSaverShipping
     */
    public void setIsEligibleForSuperSaverShipping(java.lang.Boolean isEligibleForSuperSaverShipping) {
        this.isEligibleForSuperSaverShipping = isEligibleForSuperSaverShipping;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OfferListing)) return false;
        OfferListing other = (OfferListing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offerListingId==null && other.getOfferListingId()==null) || 
             (this.offerListingId!=null &&
              this.offerListingId.equals(other.getOfferListingId()))) &&
            ((this.exchangeId==null && other.getExchangeId()==null) || 
             (this.exchangeId!=null &&
              this.exchangeId.equals(other.getExchangeId()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.salePrice==null && other.getSalePrice()==null) || 
             (this.salePrice!=null &&
              this.salePrice.equals(other.getSalePrice()))) &&
            ((this.availability==null && other.getAvailability()==null) || 
             (this.availability!=null &&
              this.availability.equals(other.getAvailability()))) &&
            ((this.ISPUStoreAddress==null && other.getISPUStoreAddress()==null) || 
             (this.ISPUStoreAddress!=null &&
              this.ISPUStoreAddress.equals(other.getISPUStoreAddress()))) &&
            ((this.ISPUStoreHours==null && other.getISPUStoreHours()==null) || 
             (this.ISPUStoreHours!=null &&
              this.ISPUStoreHours.equals(other.getISPUStoreHours()))) &&
            ((this.isEligibleForSuperSaverShipping==null && other.getIsEligibleForSuperSaverShipping()==null) || 
             (this.isEligibleForSuperSaverShipping!=null &&
              this.isEligibleForSuperSaverShipping.equals(other.getIsEligibleForSuperSaverShipping())));
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
        if (getOfferListingId() != null) {
            _hashCode += getOfferListingId().hashCode();
        }
        if (getExchangeId() != null) {
            _hashCode += getExchangeId().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getSalePrice() != null) {
            _hashCode += getSalePrice().hashCode();
        }
        if (getAvailability() != null) {
            _hashCode += getAvailability().hashCode();
        }
        if (getISPUStoreAddress() != null) {
            _hashCode += getISPUStoreAddress().hashCode();
        }
        if (getISPUStoreHours() != null) {
            _hashCode += getISPUStoreHours().hashCode();
        }
        if (getIsEligibleForSuperSaverShipping() != null) {
            _hashCode += getIsEligibleForSuperSaverShipping().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OfferListing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">OfferListing"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerListingId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "OfferListingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "ExchangeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Price"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "SalePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Price"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availability");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Availability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISPUStoreAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "ISPUStoreAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Address"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISPUStoreHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "ISPUStoreHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEligibleForSuperSaverShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "IsEligibleForSuperSaverShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
