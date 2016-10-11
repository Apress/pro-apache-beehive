/**
 * CustomerReviews.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class CustomerReviews  implements java.io.Serializable {
    private java.math.BigDecimal averageRating;
    private org.apache.axis.types.NonNegativeInteger totalReviews;
    private org.apache.axis.types.NonNegativeInteger totalReviewPages;
    private com.amazon.xml.AWSECommerceServer.Review[] review;

    public CustomerReviews() {
    }

    public CustomerReviews(
           java.math.BigDecimal averageRating,
           com.amazon.xml.AWSECommerceServer.Review[] review,
           org.apache.axis.types.NonNegativeInteger totalReviewPages,
           org.apache.axis.types.NonNegativeInteger totalReviews) {
           this.averageRating = averageRating;
           this.totalReviews = totalReviews;
           this.totalReviewPages = totalReviewPages;
           this.review = review;
    }


    /**
     * Gets the averageRating value for this CustomerReviews.
     * 
     * @return averageRating
     */
    public java.math.BigDecimal getAverageRating() {
        return averageRating;
    }


    /**
     * Sets the averageRating value for this CustomerReviews.
     * 
     * @param averageRating
     */
    public void setAverageRating(java.math.BigDecimal averageRating) {
        this.averageRating = averageRating;
    }


    /**
     * Gets the totalReviews value for this CustomerReviews.
     * 
     * @return totalReviews
     */
    public org.apache.axis.types.NonNegativeInteger getTotalReviews() {
        return totalReviews;
    }


    /**
     * Sets the totalReviews value for this CustomerReviews.
     * 
     * @param totalReviews
     */
    public void setTotalReviews(org.apache.axis.types.NonNegativeInteger totalReviews) {
        this.totalReviews = totalReviews;
    }


    /**
     * Gets the totalReviewPages value for this CustomerReviews.
     * 
     * @return totalReviewPages
     */
    public org.apache.axis.types.NonNegativeInteger getTotalReviewPages() {
        return totalReviewPages;
    }


    /**
     * Sets the totalReviewPages value for this CustomerReviews.
     * 
     * @param totalReviewPages
     */
    public void setTotalReviewPages(org.apache.axis.types.NonNegativeInteger totalReviewPages) {
        this.totalReviewPages = totalReviewPages;
    }


    /**
     * Gets the review value for this CustomerReviews.
     * 
     * @return review
     */
    public com.amazon.xml.AWSECommerceServer.Review[] getReview() {
        return review;
    }


    /**
     * Sets the review value for this CustomerReviews.
     * 
     * @param review
     */
    public void setReview(com.amazon.xml.AWSECommerceServer.Review[] review) {
        this.review = review;
    }

    public com.amazon.xml.AWSECommerceServer.Review getReview(int i) {
        return this.review[i];
    }

    public void setReview(int i, com.amazon.xml.AWSECommerceServer.Review _value) {
        this.review[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerReviews)) return false;
        CustomerReviews other = (CustomerReviews) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.averageRating==null && other.getAverageRating()==null) || 
             (this.averageRating!=null &&
              this.averageRating.equals(other.getAverageRating()))) &&
            ((this.totalReviews==null && other.getTotalReviews()==null) || 
             (this.totalReviews!=null &&
              this.totalReviews.equals(other.getTotalReviews()))) &&
            ((this.totalReviewPages==null && other.getTotalReviewPages()==null) || 
             (this.totalReviewPages!=null &&
              this.totalReviewPages.equals(other.getTotalReviewPages()))) &&
            ((this.review==null && other.getReview()==null) || 
             (this.review!=null &&
              java.util.Arrays.equals(this.review, other.getReview())));
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
        if (getAverageRating() != null) {
            _hashCode += getAverageRating().hashCode();
        }
        if (getTotalReviews() != null) {
            _hashCode += getTotalReviews().hashCode();
        }
        if (getTotalReviewPages() != null) {
            _hashCode += getTotalReviewPages().hashCode();
        }
        if (getReview() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReview());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReview(), i);
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
        new org.apache.axis.description.TypeDesc(CustomerReviews.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">CustomerReviews"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageRating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "AverageRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalReviews");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "TotalReviews"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalReviewPages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "TotalReviewPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("review");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Review"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">Review"));
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
