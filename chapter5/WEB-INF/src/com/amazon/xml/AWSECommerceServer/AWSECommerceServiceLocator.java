/**
 * AWSECommerceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package com.amazon.xml.AWSECommerceServer;

public class AWSECommerceServiceLocator extends org.apache.axis.client.Service implements com.amazon.xml.AWSECommerceServer.AWSECommerceService {

    public AWSECommerceServiceLocator() {
    }


    public AWSECommerceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AWSECommerceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AWSECommerceServicePort
    private java.lang.String AWSECommerceServicePort_address = "http://soap.amazon.com/onca/soap?Service=AWSECommerceService";

    public java.lang.String getAWSECommerceServicePortAddress() {
        return AWSECommerceServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AWSECommerceServicePortWSDDServiceName = "AWSECommerceServicePort";

    public java.lang.String getAWSECommerceServicePortWSDDServiceName() {
        return AWSECommerceServicePortWSDDServiceName;
    }

    public void setAWSECommerceServicePortWSDDServiceName(java.lang.String name) {
        AWSECommerceServicePortWSDDServiceName = name;
    }

    public com.amazon.xml.AWSECommerceServer.AWSECommerceServicePortType getAWSECommerceServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AWSECommerceServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAWSECommerceServicePort(endpoint);
    }

    public com.amazon.xml.AWSECommerceServer.AWSECommerceServicePortType getAWSECommerceServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.amazon.xml.AWSECommerceServer.AWSECommerceServiceBindingStub _stub = new com.amazon.xml.AWSECommerceServer.AWSECommerceServiceBindingStub(portAddress, this);
            _stub.setPortName(getAWSECommerceServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAWSECommerceServicePortEndpointAddress(java.lang.String address) {
        AWSECommerceServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.amazon.xml.AWSECommerceServer.AWSECommerceServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.amazon.xml.AWSECommerceServer.AWSECommerceServiceBindingStub _stub = new com.amazon.xml.AWSECommerceServer.AWSECommerceServiceBindingStub(new java.net.URL(AWSECommerceServicePort_address), this);
                _stub.setPortName(getAWSECommerceServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AWSECommerceServicePort".equals(inputPortName)) {
            return getAWSECommerceServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "AWSECommerceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2005-03-23", "AWSECommerceServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        if ("AWSECommerceServicePort".equals(portName)) {
            setAWSECommerceServicePortEndpointAddress(address);
        }
        else { // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
