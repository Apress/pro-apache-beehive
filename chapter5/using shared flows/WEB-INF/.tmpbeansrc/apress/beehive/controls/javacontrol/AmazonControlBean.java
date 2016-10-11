
package apress.beehive.controls.javacontrol;

import java.beans.*;

import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.HashMap;
import java.util.Map;

import org.apache.beehive.controls.api.bean.*;
import org.apache.beehive.controls.api.context.ControlBeanContext;
import org.apache.beehive.controls.api.properties.PropertyKey;
import org.apache.beehive.controls.api.properties.PropertyMap;
import org.apache.beehive.controls.api.versioning.*;

public class AmazonControlBean 
extends org.apache.beehive.controls.runtime.bean.ControlBean
implements apress.beehive.controls.javacontrol.AmazonControl
{
    static final Method _lookupISBNMethod;
    static final Method _searchBookMethod;
    
    //
    // This HashMap will map from a Method to the array of names for parameters of the
    // method.  This is necessary because parameter name data isn't carried along in the
    // class file, but if available can enable ease of use by referencing parameters by
    // the declared name (vs. by index).
    //
    // This map should be read-only after its initialization in the static block, hence
    // using a plain HashMap is thread-safe.
    //
    static HashMap<Method, String []> _methodParamMap = new HashMap<Method, String []>();
    
    static
    {
        try
        {
            _lookupISBNMethod = apress.beehive.controls.javacontrol.AmazonControl.class.getMethod("lookupISBN", new Class [] {java.lang.String.class});
            _methodParamMap.put(_lookupISBNMethod, new String [] { "isbn" });
            _searchBookMethod = apress.beehive.controls.javacontrol.AmazonControl.class.getMethod("searchBook", new Class [] {java.lang.String.class});
            _methodParamMap.put(_searchBookMethod, new String [] { "isbn" });
        }
        catch (NoSuchMethodException nsme)
        {
            throw new ExceptionInInitializerError(nsme);
        }
    }
    
    
    
    static
    {
        
    }
    
    
    static
    {
        /*
        * Enforce VersionRequired
        */
        Class controlIntf = org.apache.beehive.controls.runtime.bean.ControlBean.getMostDerivedInterface(apress.beehive.controls.javacontrol.AmazonControl.class);
        
        Version versionPresent = (Version)controlIntf.getAnnotation(Version.class);
        VersionRequired versionRequired = (AmazonControlBean.class).getAnnotation(VersionRequired.class);
        
        org.apache.beehive.controls.runtime.bean.ControlBean.enforceVersionRequired("apress.beehive.controls.javacontrol.AmazonControl", versionPresent, versionRequired);
    }
    
    /**
    * This is the public constructor for the class.  A client-defined control ID may
    * be provided.  This ID must be unique within the nesting ControlBeanContext.
    * @param context The containing ControlBeanContext
    * @param id The control identifier (or null to autogenerate a unique value)
    * @param props The initialization Properties for the new instance (or null for defaults)
    */
    public AmazonControlBean(ControlBeanContext context, String id, PropertyMap props)
    {
        this(context, id, props, apress.beehive.controls.javacontrol.AmazonControl.class);
    }
    
    /**
    * This is the public null-arg constructor for this ControlBean.  If a control id
    * is not provided, a unique value will be auto-generated.
    */
    public AmazonControlBean()
    {
        this(null, null, null);
    }
    
    /**
    * This is the protected version that is used by any ControlBean subclass
    */
    protected AmazonControlBean(ControlBeanContext context, String id, PropertyMap props,
    Class controlClass)
    {
        super(context, id, props, controlClass);
        
    }
    
    
    /**
    * Returns an array of parameter names for the request method, or null if no parameter
    * data is available.
    */
    protected String [] getParameterNames(Method m)
    {
        // Check the local map for operations on this bean type
        if (_methodParamMap.containsKey(m)) 
        {
            return _methodParamMap.get(m); 
        }
        
        // Delegate up if not found locally
        return super.getParameterNames(m);
    }
    
    /**
    * Implements apress.beehive.controls.javacontrol.AmazonControl.lookupISBN
    */
    public  com.amazon.xml.AWSECommerceServer.Items[] lookupISBN(java.lang.String isbn) throws java.rmi.RemoteException
    {
        Object [] argArray = new Object[] { isbn };
        Throwable thrown = null;
        apress.beehive.controls.javacontrol.AmazonControl target = (apress.beehive.controls.javacontrol.AmazonControl)ensureControl();
        com.amazon.xml.AWSECommerceServer.Items[] retval = null;
        
        try
        {
            preInvoke(_lookupISBNMethod, argArray);
            
            retval = 
            target.lookupISBN(isbn)
            ;
        }
        catch (Throwable t)
        {
            //
            // All exceptions are caught here, so postInvoke processing has visibility into
            // the exception status.  Errors, RuntimExceptions, or declared checked exceptions will 
            // be rethrown.
            //
            thrown = t;
            
            if (t instanceof Error) throw (Error)t;
            else if (t instanceof RuntimeException) throw (RuntimeException)t;
            else if (t instanceof java.rmi.RemoteException) throw (java.rmi.RemoteException)t;
            
            throw new UndeclaredThrowableException(t);
        }
        finally
        {
            Object rv = retval;
            postInvoke(_lookupISBNMethod, argArray, rv, thrown);
        }
        return retval;
    }
    
    /**
    * Implements apress.beehive.controls.javacontrol.AmazonControl.searchBook
    */
    public  java.lang.String searchBook(java.lang.String isbn) throws java.rmi.RemoteException
    {
        Object [] argArray = new Object[] { isbn };
        Throwable thrown = null;
        apress.beehive.controls.javacontrol.AmazonControl target = (apress.beehive.controls.javacontrol.AmazonControl)ensureControl();
        java.lang.String retval = null;
        
        try
        {
            preInvoke(_searchBookMethod, argArray);
            
            retval = 
            target.searchBook(isbn)
            ;
        }
        catch (Throwable t)
        {
            //
            // All exceptions are caught here, so postInvoke processing has visibility into
            // the exception status.  Errors, RuntimExceptions, or declared checked exceptions will 
            // be rethrown.
            //
            thrown = t;
            
            if (t instanceof Error) throw (Error)t;
            else if (t instanceof RuntimeException) throw (RuntimeException)t;
            else if (t instanceof java.rmi.RemoteException) throw (java.rmi.RemoteException)t;
            
            throw new UndeclaredThrowableException(t);
        }
        finally
        {
            Object rv = retval;
            postInvoke(_searchBookMethod, argArray, rv, thrown);
        }
        return retval;
    }
    
    
    /**
    * A PropertyKey that can be used to access the controlImplementation property of the
    * BaseProperties PropertySet
    */
    public static final PropertyKey ControlImplementationKey = new PropertyKey(org.apache.beehive.controls.api.properties.BaseProperties.class, "controlImplementation");
    
    
    public java.lang.String getControlImplementation()
    {
        return (java.lang.String)getControlProperty(ControlImplementationKey);
    }
    
    
    
    
    
    /**
    * The _annotCache maintains a lookup cache from AnnotatedElements to an associated
    * PropertyMap.  This enables these maps to be shared across multiple beans.
    */
    static private HashMap _annotCache = new HashMap();
    
    protected Map getPropertyMapCache() { return _annotCache; }
}
