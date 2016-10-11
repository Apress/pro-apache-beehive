/**
 * OperationRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class OperationRequest  implements java.io.Serializable {
    private com.amazon.xml.AWSECommerceServer.HTTPHeaders HTTPHeaders;
    private java.lang.String requestId;
    private com.amazon.xml.AWSECommerceServer.Arguments arguments;
    private com.amazon.xml.AWSECommerceServer.Errors errors;
    private java.lang.Float requestProcessingTime;

    public OperationRequest() {
    }

    public OperationRequest(
           com.amazon.xml.AWSECommerceServer.HTTPHeaders HTTPHeaders,
           com.amazon.xml.AWSECommerceServer.Arguments arguments,
           com.amazon.xml.AWSECommerceServer.Errors errors,
           java.lang.String requestId,
           java.lang.Float requestProcessingTime) {
           this.HTTPHeaders = HTTPHeaders;
           this.requestId = requestId;
           this.arguments = arguments;
           this.errors = errors;
           this.requestProcessingTime = requestProcessingTime;
    }


    /**
     * Gets the HTTPHeaders value for this OperationRequest.
     * 
     * @return HTTPHeaders
     */
    public com.amazon.xml.AWSECommerceServer.HTTPHeaders getHTTPHeaders() {
        return HTTPHeaders;
    }


    /**
     * Sets the HTTPHeaders value for this OperationRequest.
     * 
     * @param HTTPHeaders
     */
    public void setHTTPHeaders(com.amazon.xml.AWSECommerceServer.HTTPHeaders HTTPHeaders) {
        this.HTTPHeaders = HTTPHeaders;
    }


    /**
     * Gets the requestId value for this OperationRequest.
     * 
     * @return requestId
     */
    public java.lang.String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this OperationRequest.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the arguments value for this OperationRequest.
     * 
     * @return arguments
     */
    public com.amazon.xml.AWSECommerceServer.Arguments getArguments() {
        return arguments;
    }


    /**
     * Sets the arguments value for this OperationRequest.
     * 
     * @param arguments
     */
    public void setArguments(com.amazon.xml.AWSECommerceServer.Arguments arguments) {
        this.arguments = arguments;
    }


    /**
     * Gets the errors value for this OperationRequest.
     * 
     * @return errors
     */
    public com.amazon.xml.AWSECommerceServer.Errors getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this OperationRequest.
     * 
     * @param errors
     */
    public void setErrors(com.amazon.xml.AWSECommerceServer.Errors errors) {
        this.errors = errors;
    }


    /**
     * Gets the requestProcessingTime value for this OperationRequest.
     * 
     * @return requestProcessingTime
     */
    public java.lang.Float getRequestProcessingTime() {
        return requestProcessingTime;
    }


    /**
     * Sets the requestProcessingTime value for this OperationRequest.
     * 
     * @param requestProcessingTime
     */
    public void setRequestProcessingTime(java.lang.Float requestProcessingTime) {
        this.requestProcessingTime = requestProcessingTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationRequest)) return false;
        OperationRequest other = (OperationRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HTTPHeaders==null && other.getHTTPHeaders()==null) || 
             (this.HTTPHeaders!=null &&
              this.HTTPHeaders.equals(other.getHTTPHeaders()))) &&
            ((this.requestId==null && other.getRequestId()==null) || 
             (this.requestId!=null &&
              this.requestId.equals(other.getRequestId()))) &&
            ((this.arguments==null && other.getArguments()==null) || 
             (this.arguments!=null &&
              this.arguments.equals(other.getArguments()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              this.errors.equals(other.getErrors()))) &&
            ((this.requestProcessingTime==null && other.getRequestProcessingTime()==null) || 
             (this.requestProcessingTime!=null &&
              this.requestProcessingTime.equals(other.getRequestProcessingTime())));
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
        if (getHTTPHeaders() != null) {
            _hashCode += getHTTPHeaders().hashCode();
        }
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        if (getArguments() != null) {
            _hashCode += getArguments().hashCode();
        }
        if (getErrors() != null) {
            _hashCode += getErrors().hashCode();
        }
        if (getRequestProcessingTime() != null) {
            _hashCode += getRequestProcessingTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperationRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">OperationRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HTTPHeaders");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "HTTPHeaders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">HTTPHeaders"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "RequestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arguments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Arguments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">Arguments"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "Errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", ">Errors"));
        elemField.setMinOccurs(0);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestProcessingTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "RequestProcessingTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
