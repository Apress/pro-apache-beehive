
package apress.beehive.controls.bookstoredb;

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

public class BookDBControlBean 
extends org.controlhaus.jdbc.JdbcControlBean
implements apress.beehive.controls.bookstoredb.BookDBControl
{
    static final Method _findBooksByAuthorAndTypeMethod;
    static final Method _getBookDetailsMethod;
    static final Method _getAllBooksTitlesForAuthorMethod;
    static final Method _addBookMethod;
    
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
            _findBooksByAuthorAndTypeMethod = apress.beehive.controls.bookstoredb.BookDBControl.class.getMethod("findBooksByAuthorAndType", new Class [] {java.lang.String.class, java.lang.String.class});
            _methodParamMap.put(_findBooksByAuthorAndTypeMethod, new String [] { "author", "type" });
            _getBookDetailsMethod = apress.beehive.controls.bookstoredb.BookDBControl.class.getMethod("getBookDetails", new Class [] {int.class});
            _methodParamMap.put(_getBookDetailsMethod, new String [] { "book_Id" });
            _getAllBooksTitlesForAuthorMethod = apress.beehive.controls.bookstoredb.BookDBControl.class.getMethod("getAllBooksTitlesForAuthor", new Class [] {java.lang.String.class});
            _methodParamMap.put(_getAllBooksTitlesForAuthorMethod, new String [] { "name" });
            _addBookMethod = apress.beehive.controls.bookstoredb.BookDBControl.class.getMethod("addBook", new Class [] {});
            _methodParamMap.put(_addBookMethod, new String [] {  });
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
        Class controlIntf = org.apache.beehive.controls.runtime.bean.ControlBean.getMostDerivedInterface(apress.beehive.controls.bookstoredb.BookDBControl.class);
        
        Version versionPresent = (Version)controlIntf.getAnnotation(Version.class);
        VersionRequired versionRequired = (BookDBControlBean.class).getAnnotation(VersionRequired.class);
        
        org.apache.beehive.controls.runtime.bean.ControlBean.enforceVersionRequired("apress.beehive.controls.bookstoredb.BookDBControl", versionPresent, versionRequired);
    }
    
    /**
    * This is the public constructor for the class.  A client-defined control ID may
    * be provided.  This ID must be unique within the nesting ControlBeanContext.
    * @param context The containing ControlBeanContext
    * @param id The control identifier (or null to autogenerate a unique value)
    * @param props The initialization Properties for the new instance (or null for defaults)
    */
    public BookDBControlBean(ControlBeanContext context, String id, PropertyMap props)
    {
        this(context, id, props, apress.beehive.controls.bookstoredb.BookDBControl.class);
    }
    
    /**
    * This is the public null-arg constructor for this ControlBean.  If a control id
    * is not provided, a unique value will be auto-generated.
    */
    public BookDBControlBean()
    {
        this(null, null, null);
    }
    
    /**
    * This is the protected version that is used by any ControlBean subclass
    */
    protected BookDBControlBean(ControlBeanContext context, String id, PropertyMap props,
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
    * Implements apress.beehive.controls.bookstoredb.BookDBControl.findBooksByAuthorAndType
    */
    public  java.sql.ResultSet findBooksByAuthorAndType(java.lang.String author, java.lang.String type) throws java.sql.SQLException
    {
        Object [] argArray = new Object[] { author, type };
        Throwable thrown = null;
        Extensible target = (Extensible)ensureControl();
        java.sql.ResultSet retval = null;
        
        try
        {
            preInvoke(_findBooksByAuthorAndTypeMethod, argArray);
            
            retval = 
            (java.sql.ResultSet)
            target.invoke(_findBooksByAuthorAndTypeMethod, argArray)
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
            else if (t instanceof java.sql.SQLException) throw (java.sql.SQLException)t;
            
            throw new UndeclaredThrowableException(t);
        }
        finally
        {
            Object rv = retval;
            postInvoke(_findBooksByAuthorAndTypeMethod, argArray, rv, thrown);
        }
        return retval;
    }
    
    /**
    * Implements apress.beehive.controls.bookstoredb.BookDBControl.getBookDetails
    */
    public  com.apress.beehive.bookstore.vo.BookDetailDocument.BookDetail getBookDetails(int book_Id) throws java.sql.SQLException
    {
        Object [] argArray = new Object[] { book_Id };
        Throwable thrown = null;
        Extensible target = (Extensible)ensureControl();
        com.apress.beehive.bookstore.vo.BookDetailDocument.BookDetail retval = null;
        
        try
        {
            preInvoke(_getBookDetailsMethod, argArray);
            
            retval = 
            (com.apress.beehive.bookstore.vo.BookDetailDocument.BookDetail)
            target.invoke(_getBookDetailsMethod, argArray)
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
            else if (t instanceof java.sql.SQLException) throw (java.sql.SQLException)t;
            
            throw new UndeclaredThrowableException(t);
        }
        finally
        {
            Object rv = retval;
            postInvoke(_getBookDetailsMethod, argArray, rv, thrown);
        }
        return retval;
    }
    
    /**
    * Implements apress.beehive.controls.bookstoredb.BookDBControl.getAllBooksTitlesForAuthor
    */
    public  java.lang.String[] getAllBooksTitlesForAuthor(java.lang.String name) 
    {
        Object [] argArray = new Object[] { name };
        Throwable thrown = null;
        Extensible target = (Extensible)ensureControl();
        java.lang.String[] retval = null;
        
        try
        {
            preInvoke(_getAllBooksTitlesForAuthorMethod, argArray);
            
            retval = 
            (java.lang.String[])
            target.invoke(_getAllBooksTitlesForAuthorMethod, argArray)
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
            
            throw new UndeclaredThrowableException(t);
        }
        finally
        {
            Object rv = retval;
            postInvoke(_getAllBooksTitlesForAuthorMethod, argArray, rv, thrown);
        }
        return retval;
    }
    
    /**
    * Implements apress.beehive.controls.bookstoredb.BookDBControl.addBook
    */
    public  void addBook() 
    {
        Object [] argArray = new Object[] {  };
        Throwable thrown = null;
        Extensible target = (Extensible)ensureControl();
        
        try
        {
            preInvoke(_addBookMethod, argArray);
            
            target.invoke(_addBookMethod, argArray)
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
            
            throw new UndeclaredThrowableException(t);
        }
        finally
        {
            Object rv = null;
            postInvoke(_addBookMethod, argArray, rv, thrown);
        }
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
