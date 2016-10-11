/**
 * Seller.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class Seller  implements java.io.Serializable {
    private java.lang.String sellerId;
    private java.lang.String sellerName;
    private java.lang.String nickname;
    private java.lang.String glancePage;
    private java.lang.String about;
    private java.lang.String moreAbout;
    private com.amazon.xml.AWSECommerceServer.SellerLocation location;
    private java.math.BigDecimal averageFeedbackRating;
    private org.apache.axis.types.NonNegativeInteger totalFeedback;
    private org.apache.axis.types.NonNegativeInteger totalFeedbackPages;
    private com.amazon.xml.AWSECommerceServer.SellerFeedback sellerFeedback;

    public Seller() {
    }

    public Seller(
           java.lang.String about,
           java.math.BigDecimal averageFeedbackRating,
           java.lang.String glancePage,
           com.amazon.xml.AWSECommerceServer.SellerLocation location,
           java.lang.String moreAbout,
           java.lang.String nickname,
           com.amazon.xml.AWSECommerceServer.SellerFeedback sellerFeedback,
           java.lang.String sellerId,
           java.lang.String sellerName,
           org.apache.axis.types.NonNegativeInteger totalFeedback,
           org.apache.axis.types.NonNegativeInteger totalFeedbackPages) {
           this.sellerId = sellerId;
           this.sellerName = sellerName;
           this.nickname = nickname;
           this.glancePage = glancePage;
           this.about = about;
           this.moreAbout = moreAbout;
           this.location = location;
           this.averageFeedbackRating = averageFeedbackRating;
           this.totalFeedback = totalFeedback;
           this.totalFeedbackPages = totalFeedbackPages;
           this.sellerFeedback = sellerFeedback;
    }


    /**
     * Gets the sellerId value for this Seller.
     * 
     * @return sellerId
     */
    public java.lang.String getSellerId() {
        return sellerId;
    }


    /**
     * Sets the sellerId value for this Seller.
     * 
     * @param sellerId
     */
    public void setSellerId(java.lang.String sellerId) {
        this.sellerId = sellerId;
    }


    /**
     * Gets the sellerName value for this Seller.
     * 
     * @return sellerName
     */
    public java.lang.String getSellerName() {
        return sellerName;
    }


    /**
     * Sets the sellerName value for this Seller.
     * 
     * @param sellerName
     */
    public void setSellerName(java.lang.String sellerName) {
        this.sellerName = sellerName;
    }


    /**
     * Gets the nickname value for this Seller.
     * 
     * @return nickname
     */
    public java.lang.String getNickname() {
        return nickname;
    }


    /**
     * Sets the nickname value for this Seller.
     * 
     * @param nickname
     */
    public void setNickname(java.lang.String nickname) {
        this.nickname = nickname;
    }


    /**
     * Gets the glancePage value for this Seller.
     * 
     * @return glancePage
     */
    public java.lang.String getGlancePage() {
        return glancePage;
    }


    /**
     * Sets the glancePage value for this Seller.
     * 
     * @param glancePage
     */
    public void setGlancePage(java.lang.String glancePage) {
        this.glancePage = glancePage;
    }


    /**
     * Gets the about value for this Seller.
     * 
     * @return about
     */
    public java.lang.String getAbout() {
        return about;
    }


    /**
     * Sets the about value for this Seller.
     * 
     * @param about
     */
    public void setAbout(java.lang.String about) {
        this.about = about;
    }


    /**
     * Gets the moreAbout value for this Seller.
     * 
     * @return moreAbout
     */
    public java.lang.String getMoreAbout() {
        return moreAbout;
    }


    /**
     * Sets the moreAbout value for this Seller.
     * 
     * @param moreAbout
     */
    public void setMoreAbout(java.lang.String moreAbout) {
        this.moreAbout = moreAbout;
    }


    /**
     * Gets the location value for this Seller.
     * 
     * @return location
     */
    public com.amazon.xml.AWSECommerceServer.SellerLocation getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Seller.
     * 
     * @param location
     */
    public void setLocation(com.amazon.xml.AWSECommerceServer.SellerLocation location) {
        this.location = location;
    }


    /**
     * Gets the averageFeedbackRating value for this Seller.
     * 
     * @return averageFeedbackRating
     */
    public java.math.BigDecimal getAverageFeedbackRating() {
        return averageFeedbackRating;
    }


    /**
     * Sets the averageFeedbackRating value for this Seller.
     * 
     * @param averageFeedbackRating
     */
    public void setAverageFeedbackRating(java.math.BigDecimal averageFeedbackRating) {
        this.averageFeedbackRating = averageFeedbackRating;
    }


    /**
     * Gets the totalFeedback value for this Seller.
     * 
     * @return totalFeedback
     */
    public org.apache.axis.types.NonNegativeInteger getTotalFeedback() {
        return totalFeedback;
    }


    /**
     * Sets the totalFeedback value for this Seller.
     * 
     * @param totalFeedback
     */
    public void setTotalFeedback(org.apache.axis.types.NonNegativeInteger totalFeedback) {
        this.totalFeedback = totalFeedback;
    }


    /**
     * Gets the totalFeedbackPages value for this Seller.
     * 
     * @return totalFeedbackPages
     */
    public org.apache.axis.types.NonNegativeInteger getTotalFeedbackPages() {
        return totalFeedbackPages;
    }


    /**
     * Sets the totalFeedbackPages value for this Seller.
     * 
     * @param totalFeedbackPages
     */
    public void setTotalFeedbackPages(org.apache.axis.types.NonNegativeInteger totalFeedbackPages) {
        this.totalFeedbackPages = totalFeedbackPages;
    }


    /**
     * Gets the sellerFeedback value for this Seller.
     * 
     * @return sellerFeedback
     */
    public com.amazon.xml.AWSECommerceServer.SellerFeedback getSellerFeedback() {
        return sellerFeedback;
    }


    /**
     * Sets the sellerFeedback value for this Seller.
     * 
     * @param sellerFeedback
     */
    public void setSellerFeedback(com.amazon.xml.AWSECommerceServer.SellerFeedback sellerFeedback) {
        this.sellerFeedback = sellerFeedback;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Seller)) return false;
        Seller other = (Seller) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sellerId==null && other.getSellerId()==null) || 
             (this.sellerId!=null &&
              this.sellerId.equals(other.getSellerId()))) &&
            ((this.sellerName==null && other.getSellerName()==null) || 
             (this.sellerName!=null &&
              this.sellerName.equals(other.getSellerName()))) &&
            ((this.nickname==null && other.getNickname()==null) || 
             (this.nickname!=null &&
              this.nickname.equals(other.getNickname()))) &&
            ((this.glancePage==null && other.getGlancePage()==null) || 
             (this.glancePage!=null &&
              this.glancePage.equals(other.getGlancePage()))) &&
            ((this.about==null && other.getAbout()==null) || 
             (this.about!=null &&
              this.about.equals(other.getAbout()))) &&
            ((this.moreAbout==null && other.getMoreAbout()==null) || 
             (this.moreAbout!=null &&
              this.moreAbout.equals(other.getMoreAbout()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.averageFeedbackRating==null && other.getAverageFeedbackRating()==null) || 
             (this.averageFeedbackRating!=null &&
              this.averageFeedbackRating.equals(other.getAverageFeedbackRating()))) &&
            ((this.totalFeedback==null && other.getTotalFeedback()==null) || 
             (this.totalFeedback!=null &&
              this.totalFeedback.equals(other.getTotalFeedback()))) &&
            ((this.totalFeedbackPages==null && other.getTotalFeedbackPages()==null) || 
             (this.totalFeedbackPages!=null &&
              this.totalFeedbackPages.equals(other.getTotalFeedbackPages()))) &&
            ((this.sellerFeedback==null && other.getSellerFeedback()==null) || 
             (this.sellerFeedback!=null &&
              this.sellerFeedback.equals(other.getSellerFeedback())));
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
        if (getSellerId() != null) {
            _hashCode += getSellerId().hashCode();
        }
        if (getSellerName() != null) {
            _hashCode += getSellerName().hashCode();
        }
        if (getNickname() != null) {
            _hashCode += getNickname().hashCode();
        }
        if (getGlancePage() != null) {
            _hashCode += getGlancePage().hashCode();
        }
        if (getAbout() != null) {
            _hashCode += getAbout().hashCode();
        }
        if (getMoreAbout() != null) {
            _hashCode += getMoreAbout().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getAverageFeedbackRating() != null) {
            _hashCode += getAverageFeedbackRating().hashCode();
        }
        if (getTotalFeedback() != null) {
            _hashCode += getTotalFeedback().hashCode();
        }
        if (getTotalFeedbackPages() != null) {
            _hashCode += getTotalFeedbackPages().hashCode();
        }
        if (getSellerFeedback() != null) {
            _hashCode += getSellerFeedback().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Seller.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">Seller"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "SellerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "SellerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nickname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Nickname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("glancePage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "GlancePage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("about");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "About"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moreAbout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "MoreAbout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">>Seller>Location"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageFeedbackRating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "AverageFeedbackRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFeedback");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "TotalFeedback"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFeedbackPages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "TotalFeedbackPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerFeedback");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "SellerFeedback"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">SellerFeedback"));
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
