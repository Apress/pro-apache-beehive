
package apress.beehive.controls.ejbcontrol;

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

public class BookDetailEJBControlBean 
extends org.controlhaus.ejb.SessionEJBControlBean
implements apress.beehive.controls.ejbcontrol.BookDetailEJBControl
{
    static final Method _createMethod;
    static final Method _updateBookDetailMethod;
    static final Method _insertBookDetailMethod;
    static final Method _helloMethod;
    static final Method _remove0Method;
    static final Method _remove1Method;
    static final Method _getHomeHandleMethod;
    static final Method _getEJBMetaDataMethod;
    static final Method _remove2Method;
    static final Method _isIdenticalMethod;
    static final Method _getPrimaryKeyMethod;
    static final Method _getHandleMethod;
    static final Method _getEJBHomeMethod;
    
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
            _createMethod = apress.beehive.controls.ejbcontrol.BookDetailEJBControl.class.getMethod("create", new Class [] {});
            _methodParamMap.put(_createMethod, new String [] {  });
            _updateBookDetailMethod = apress.beehive.controls.ejbcontrol.BookDetailEJBControl.class.getMethod("updateBookDetail", new Class [] {com.apress.beehive.bookstore.vo.BookDetailDocument.BookDetail.class});
            _methodParamMap.put(_updateBookDetailMethod, new String [] { "aBook" });
            _insertBookDetailMethod = apress.beehive.controls.ejbcontrol.BookDetailEJBControl.class.getMethod("insertBookDetail", new Class [] {com.apress.beehive.bookstore.vo.BookDetailDocument.BookDetail.class});
            _methodParamMap.put(_insertBookDetailMethod, new String [] { "aBook" });
            _helloMethod = apress.beehive.controls.ejbcontrol.BookDetailEJBControl.class.getMethod("hello", new Class [] {});
            _methodParamMap.put(_helloMethod, new String [] {  });
            _remove0Method = apress.beehive.controls.ejbcontrol.BookDetailEJBControl.class.getMethod("remove", new Class [] {javax.ejb.Handle.class});
            _methodParamMap.put(_remove0Method, new String [] { "arg0" });
            _remove1Method = apress.beehive.controls.ejbcontrol.BookDetailEJBControl.class.getMethod("remove", new Class [] {java.lang.Object.class});
            _methodParamMap.put(_remove1Method, new String [] { "arg0" });
            _getHomeHandleMethod = apress.beehive.controls.ejbcontrol.BookDetailEJBControl.class.getMethod("getHomeHandle", new Class [] {});
            _methodParamMap.put(_getHomeHandleMethod, new String [] {  });
            _getEJBMetaDataMethod = apress.beehive.controls.ejbcontrol.BookDetailEJBControl.class.getMethod("getEJBMetaData", new Class [] {});
            _methodParamMap.put(_getEJBMetaDataMethod, new String [] {  });
            _remove2Method = apress.beehive.controls.ejbcontrol.BookDetailEJBControl.class.getMethod("remove", new Class [] {});
            _methodParamMap.put(_remove2Method, new String [] {  });
            _isIdenticalMethod = apress.beehive.controls.ejbcontrol.BookDetailEJBControl.class.getMethod("isIdentical", new Class [] {javax.ejb.EJBObject.class});
            _methodParamMap.put(_isIdenticalMethod, new String [] { "arg0" });
            _getPrimaryKeyMethod = apress.beehive.controls.ejbcontrol.BookDetailEJBControl.class.getMethod("getPrimaryKey", new Class [] {});
            _methodParamMap.put(_getPrimaryKeyMethod, new String [] {  });
            _getHandleMethod = apress.beehive.controls.ejbcontrol.BookDetailEJBControl.class.getMethod("getHandle", new Class [] {});
            _methodParamMap.put(_getHandleMethod, new String [] {  });
            _getEJBHomeMethod = apress.beehive.controls.ejbcontrol.BookDetailEJBControl.class.getMethod("getEJBHome", new Class [] {});
            _methodParamMap.put(_getEJBHomeMethod, new String [] {  });
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
        Class controlIntf = org.apache.beehive.controls.runtime.bean.ControlBean.getMostDerivedInterface(apress.beehive.controls.ejbcontrol.BookDetailEJBControl.class);
        
        Version versionPresent = (Version)controlIntf.getAnnotation(Version.class);
        VersionRequired versionRequired = (BookDetailEJBControlBean.class).getAnnotation(VersionRequired.class);
        
        org.apache.beehive.controls.runtime.bean.ControlBean.enforceVersionRequired("apress.beehive.controls.ejbcontrol.BookDetailEJBControl", versionPresent, versionRequired);
    }
    
    /**
    * This is the public constructor for the class.  A client-defined control ID may
    * be provided.  This ID must be unique within the nesting ControlBeanContext.
    * @param context The containing ControlBeanContext
    * @param id The control identifier (or null to autogenerate a unique value)
    * @param props The initialization Properties for the new instance (or null for defaults)
    */
    public BookDetailEJBControlBean(ControlBeanContext context, String id, PropertyMap props)
    {
        this(context, id, props, apress.beehive.controls.ejbcontrol.BookDetailEJBControl.class);
    }
    
    /**
    * This is the public null-arg constructor for this ControlBean.  If a control id
    * is not provided, a unique value will be auto-generated.
    */
    public BookDetailEJBControlBean()
    {
        this(null, null, null);
    }
    
    /**
    * This is the protected version that is used by any ControlBean subclass
    */
    protected BookDetailEJBControlBean(ControlBeanContext context, String id, PropertyMap props,
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
    * Implements apress.beehive.controls.ejbcontrol.BookDetailEJBControl.create
    */
    public  com.apress.beehive.bookstore.ejb.BookDetailRemote create() throws javax.ejb.CreateException, java.rmi.RemoteException
    {
        Object [] argArray = new Object[] {  };
        Throwable thrown = null;
        Extensible target = (Extensible)ensureControl();
        com.apress.beehive.bookstore.ejb.BookDetailRemote retval = null;
        
        try
        {
            preInvoke(_createMethod, argArray);
            
            retval = 
            (com.apress.beehive.bookstore.ejb.BookDetailRemote)
            target.invoke(_createMethod, argArray)
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
            else if (t instanceof javax.ejb.CreateException) throw (javax.ejb.CreateException)t;
            else if (t instanceof java.rmi.RemoteException) throw (java.rmi.RemoteException)t;
            
            throw new UndeclaredThrowableException(t);
        }
        finally
        {
            Object rv = retval;
            postInvoke(_createMethod, argArray, rv, thrown);
        }
        return retval;
    }
    
    /**
    * Implements apress.beehive.controls.ejbcontrol.BookDetailEJBControl.updateBookDetail
    */
    public  java.lang.String updateBookDetail(com.apress.beehive.bookstore.vo.BookDetailDocument.BookDetail aBook) throws java.rmi.RemoteException, java.sql.SQLException
    {
        Object [] argArray = new Object[] { aBook };
        Throwable thrown = null;
        Extensible target = (Extensible)ensureControl();
        java.lang.String retval = null;
        
        try
        {
            preInvoke(_updateBookDetailMethod, argArray);
            
            retval = 
            (java.lang.String)
            target.invoke(_updateBookDetailMethod, argArray)
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
            else if (t instanceof java.sql.SQLException) throw (java.sql.SQLException)t;
            
            throw new UndeclaredThrowableException(t);
        }
        finally
        {
            Object rv = retval;
            postInvoke(_updateBookDetailMethod, argArray, rv, thrown);
        }
        return retval;
    }
    
    /**
    * Implements apress.beehive.controls.ejbcontrol.BookDetailEJBControl.insertBookDetail
    */
    public  java.lang.String insertBookDetail(com.apress.beehive.bookstore.vo.BookDetailDocument.BookDetail aBook) throws java.rmi.RemoteException, java.sql.SQLException
    {
        Object [] argArray = new Object[] { aBook };
        Throwable thrown = null;
        Extensible target = (Extensible)ensureControl();
        java.lang.String retval = null;
        
        try
        {
            preInvoke(_insertBookDetailMethod, argArray);
            
            retval = 
            (java.lang.String)
            target.invoke(_insertBookDetailMethod, argArray)
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
            else if (t instanceof java.sql.SQLException) throw (java.sql.SQLException)t;
            
            throw new UndeclaredThrowableException(t);
        }
        finally
        {
            Object rv = retval;
            postInvoke(_insertBookDetailMethod, argArray, rv, thrown);
        }
        return retval;
    }
    
    /**
    * Implements apress.beehive.controls.ejbcontrol.BookDetailEJBControl.hello
    */
    public  java.lang.String hello() throws java.rmi.RemoteException
    {
        Object [] argArray = new Object[] {  };
        Throwable thrown = null;
        Extensible target = (Extensible)ensureControl();
        java.lang.String retval = null;
        
        try
        {
            preInvoke(_helloMethod, argArray);
            
            retval = 
            (java.lang.String)
            target.invoke(_helloMethod, argArray)
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
            postInvoke(_helloMethod, argArray, rv, thrown);
        }
        return retval;
    }
    
    /**
    * Implements apress.beehive.controls.ejbcontrol.BookDetailEJBControl.remove
    */
    public  void remove(javax.ejb.Handle arg0) throws java.rmi.RemoteException, javax.ejb.RemoveException
    {
        Object [] argArray = new Object[] { arg0 };
        Throwable thrown = null;
        Extensible target = (Extensible)ensureControl();
        
        try
        {
            preInvoke(_remove0Method, argArray);
            
            target.invoke(_remove0Method, argArray)
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
            else if (t instanceof javax.ejb.RemoveException) throw (javax.ejb.RemoveException)t;
            
            throw new UndeclaredThrowableException(t);
        }
        finally
        {
            Object rv = null;
            postInvoke(_remove0Method, argArray, rv, thrown);
        }
    }
    
    /**
    * Implements apress.beehive.controls.ejbcontrol.BookDetailEJBControl.remove
    */
    public  void remove(java.lang.Object arg0) throws java.rmi.RemoteException, javax.ejb.RemoveException
    {
        Object [] argArray = new Object[] { arg0 };
        Throwable thrown = null;
        Extensible target = (Extensible)ensureControl();
        
        try
        {
            preInvoke(_remove1Method, argArray);
            
            target.invoke(_remove1Method, argArray)
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
            else if (t instanceof javax.ejb.RemoveException) throw (javax.ejb.RemoveException)t;
            
            throw new UndeclaredThrowableException(t);
        }
        finally
        {
            Object rv = null;
            postInvoke(_remove1Method, argArray, rv, thrown);
        }
    }
    
    /**
    * Implements apress.beehive.controls.ejbcontrol.BookDetailEJBControl.getHomeHandle
    */
    public  javax.ejb.HomeHandle getHomeHandle() throws java.rmi.RemoteException
    {
        Object [] argArray = new Object[] {  };
        Throwable thrown = null;
        Extensible target = (Extensible)ensureControl();
        javax.ejb.HomeHandle retval = null;
        
        try
        {
            preInvoke(_getHomeHandleMethod, argArray);
            
            retval = 
            (javax.ejb.HomeHandle)
            target.invoke(_getHomeHandleMethod, argArray)
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
            postInvoke(_getHomeHandleMethod, argArray, rv, thrown);
        }
        return retval;
    }
    
    /**
    * Implements apress.beehive.controls.ejbcontrol.BookDetailEJBControl.getEJBMetaData
    */
    public  javax.ejb.EJBMetaData getEJBMetaData() throws java.rmi.RemoteException
    {
        Object [] argArray = new Object[] {  };
        Throwable thrown = null;
        Extensible target = (Extensible)ensureControl();
        javax.ejb.EJBMetaData retval = null;
        
        try
        {
            preInvoke(_getEJBMetaDataMethod, argArray);
            
            retval = 
            (javax.ejb.EJBMetaData)
            target.invoke(_getEJBMetaDataMethod, argArray)
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
            postInvoke(_getEJBMetaDataMethod, argArray, rv, thrown);
        }
        return retval;
    }
    
    /**
    * Implements apress.beehive.controls.ejbcontrol.BookDetailEJBControl.remove
    */
    public  void remove() throws java.rmi.RemoteException, javax.ejb.RemoveException
    {
        Object [] argArray = new Object[] {  };
        Throwable thrown = null;
        Extensible target = (Extensible)ensureControl();
        
        try
        {
            preInvoke(_remove2Method, argArray);
            
            target.invoke(_remove2Method, argArray)
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
            else if (t instanceof javax.ejb.RemoveException) throw (javax.ejb.RemoveException)t;
            
            throw new UndeclaredThrowableException(t);
        }
        finally
        {
            Object rv = null;
            postInvoke(_remove2Method, argArray, rv, thrown);
        }
    }
    
    /**
    * Implements apress.beehive.controls.ejbcontrol.BookDetailEJBControl.isIdentical
    */
    public  boolean isIdentical(javax.ejb.EJBObject arg0) throws java.rmi.RemoteException
    {
        Object [] argArray = new Object[] { arg0 };
        Throwable thrown = null;
        Extensible target = (Extensible)ensureControl();
        boolean retval = false;
        
        try
        {
            preInvoke(_isIdenticalMethod, argArray);
            
            retval = 
            (Boolean)
            target.invoke(_isIdenticalMethod, argArray)
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
            Object rv = Boolean.valueOf(retval);
            postInvoke(_isIdenticalMethod, argArray, rv, thrown);
        }
        return retval;
    }
    
    /**
    * Implements apress.beehive.controls.ejbcontrol.BookDetailEJBControl.getPrimaryKey
    */
    public  java.lang.Object getPrimaryKey() throws java.rmi.RemoteException
    {
        Object [] argArray = new Object[] {  };
        Throwable thrown = null;
        Extensible target = (Extensible)ensureControl();
        java.lang.Object retval = null;
        
        try
        {
            preInvoke(_getPrimaryKeyMethod, argArray);
            
            retval = 
            (java.lang.Object)
            target.invoke(_getPrimaryKeyMethod, argArray)
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
            postInvoke(_getPrimaryKeyMethod, argArray, rv, thrown);
        }
        return retval;
    }
    
    /**
    * Implements apress.beehive.controls.ejbcontrol.BookDetailEJBControl.getHandle
    */
    public  javax.ejb.Handle getHandle() throws java.rmi.RemoteException
    {
        Object [] argArray = new Object[] {  };
        Throwable thrown = null;
        Extensible target = (Extensible)ensureControl();
        javax.ejb.Handle retval = null;
        
        try
        {
            preInvoke(_getHandleMethod, argArray);
            
            retval = 
            (javax.ejb.Handle)
            target.invoke(_getHandleMethod, argArray)
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
            postInvoke(_getHandleMethod, argArray, rv, thrown);
        }
        return retval;
    }
    
    /**
    * Implements apress.beehive.controls.ejbcontrol.BookDetailEJBControl.getEJBHome
    */
    public  javax.ejb.EJBHome getEJBHome() throws java.rmi.RemoteException
    {
        Object [] argArray = new Object[] {  };
        Throwable thrown = null;
        Extensible target = (Extensible)ensureControl();
        javax.ejb.EJBHome retval = null;
        
        try
        {
            preInvoke(_getEJBHomeMethod, argArray);
            
            retval = 
            (javax.ejb.EJBHome)
            target.invoke(_getEJBHomeMethod, argArray)
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
            postInvoke(_getEJBHomeMethod, argArray, rv, thrown);
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
