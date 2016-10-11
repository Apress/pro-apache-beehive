/**
 * ListItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class ListItem  implements java.io.Serializable {
    private java.lang.String listItemId;
    private java.lang.String dateAdded;
    private java.lang.String comment;
    private java.lang.String quantityDesired;
    private java.lang.String quantityReceived;
    private com.amazon.xml.AWSECommerceServer.Item item;

    public ListItem() {
    }

    public ListItem(
           java.lang.String comment,
           java.lang.String dateAdded,
           com.amazon.xml.AWSECommerceServer.Item item,
           java.lang.String listItemId,
           java.lang.String quantityDesired,
           java.lang.String quantityReceived) {
           this.listItemId = listItemId;
           this.dateAdded = dateAdded;
           this.comment = comment;
           this.quantityDesired = quantityDesired;
           this.quantityReceived = quantityReceived;
           this.item = item;
    }


    /**
     * Gets the listItemId value for this ListItem.
     * 
     * @return listItemId
     */
    public java.lang.String getListItemId() {
        return listItemId;
    }


    /**
     * Sets the listItemId value for this ListItem.
     * 
     * @param listItemId
     */
    public void setListItemId(java.lang.String listItemId) {
        this.listItemId = listItemId;
    }


    /**
     * Gets the dateAdded value for this ListItem.
     * 
     * @return dateAdded
     */
    public java.lang.String getDateAdded() {
        return dateAdded;
    }


    /**
     * Sets the dateAdded value for this ListItem.
     * 
     * @param dateAdded
     */
    public void setDateAdded(java.lang.String dateAdded) {
        this.dateAdded = dateAdded;
    }


    /**
     * Gets the comment value for this ListItem.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this ListItem.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the quantityDesired value for this ListItem.
     * 
     * @return quantityDesired
     */
    public java.lang.String getQuantityDesired() {
        return quantityDesired;
    }


    /**
     * Sets the quantityDesired value for this ListItem.
     * 
     * @param quantityDesired
     */
    public void setQuantityDesired(java.lang.String quantityDesired) {
        this.quantityDesired = quantityDesired;
    }


    /**
     * Gets the quantityReceived value for this ListItem.
     * 
     * @return quantityReceived
     */
    public java.lang.String getQuantityReceived() {
        return quantityReceived;
    }


    /**
     * Sets the quantityReceived value for this ListItem.
     * 
     * @param quantityReceived
     */
    public void setQuantityReceived(java.lang.String quantityReceived) {
        this.quantityReceived = quantityReceived;
    }


    /**
     * Gets the item value for this ListItem.
     * 
     * @return item
     */
    public com.amazon.xml.AWSECommerceServer.Item getItem() {
        return item;
    }


    /**
     * Sets the item value for this ListItem.
     * 
     * @param item
     */
    public void setItem(com.amazon.xml.AWSECommerceServer.Item item) {
        this.item = item;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListItem)) return false;
        ListItem other = (ListItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listItemId==null && other.getListItemId()==null) || 
             (this.listItemId!=null &&
              this.listItemId.equals(other.getListItemId()))) &&
            ((this.dateAdded==null && other.getDateAdded()==null) || 
             (this.dateAdded!=null &&
              this.dateAdded.equals(other.getDateAdded()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.quantityDesired==null && other.getQuantityDesired()==null) || 
             (this.quantityDesired!=null &&
              this.quantityDesired.equals(other.getQuantityDesired()))) &&
            ((this.quantityReceived==null && other.getQuantityReceived()==null) || 
             (this.quantityReceived!=null &&
              this.quantityReceived.equals(other.getQuantityReceived()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem())));
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
        if (getListItemId() != null) {
            _hashCode += getListItemId().hashCode();
        }
        if (getDateAdded() != null) {
            _hashCode += getDateAdded().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getQuantityDesired() != null) {
            _hashCode += getQuantityDesired().hashCode();
        }
        if (getQuantityReceived() != null) {
            _hashCode += getQuantityReceived().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">ListItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listItemId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "ListItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateAdded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "DateAdded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityDesired");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "QuantityDesired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityReceived");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "QuantityReceived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Item"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">Item"));
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
