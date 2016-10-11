package apress.beehive.controls.bookstoredb;

import java.beans.BeanDescriptor;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.MethodDescriptor;
import java.beans.ParameterDescriptor;
import java.beans.PropertyDescriptor;
import java.beans.PropertyEditor;
import java.lang.reflect.Method;
import java.util.HashMap;

import org.apache.beehive.controls.api.ControlException;
import org.apache.beehive.controls.runtime.bean.BeanPersistenceDelegate;
import org.apache.beehive.controls.runtime.packaging.ControlEventSetDescriptor;

public class BookDBControlBeanBeanInfo 
extends org.controlhaus.jdbc.JdbcControlBeanBeanInfo
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
    
    /**
    * Default null-arg constructor used to create a new BeanInfo instance
    */
    public BookDBControlBeanBeanInfo()
    {
        super(apress.beehive.controls.bookstoredb.BookDBControlBean.class);
    }
    
    /**
    * Protected constructor used if this BeanInfo class is extended.
    */
    protected BookDBControlBeanBeanInfo(Class beanClass)
    {
        super(beanClass);
    }
    
    // java.beans.BeanInfo.getBeanDescriptor
    public BeanDescriptor getBeanDescriptor()
    {
        BeanDescriptor bd = new BeanDescriptor(apress.beehive.controls.bookstoredb.BookDBControlBean.class);
        bd.setName( "BookDBControlBean" );
        bd.setDisplayName( "BookDBControlBean" );
        
        //
        // The org.apache.beehive.controls.runtime.bean.BeanPersistenceDelegate class
        // implements the XMLDecode delegation model for all Control JavaBean types. It
        // provides optimized XML persistance based upon the Control runtime architecture.
        // The 'persistenceDelegate' attribute of a BeanDescriptor is used by XMLEncoder to 
        // locate a delegate for a particular JavaBean type.
        //
        bd.setValue("persistenceDelegate", new BeanPersistenceDelegate());
        
        return bd;
    }
    
    /**
    * Stores MethodDescriptor descriptors for this bean and its superclasses into
    * an array, starting at the specified index
    */
    protected void initMethodDescriptors(MethodDescriptor [] methodDescriptors, int index)
    throws java.beans.IntrospectionException
    {
        String [] paramNames;
        ParameterDescriptor [] paramDescriptors;
        MethodDescriptor md;
        
        //
        // Declare MethodDescriptor for findBooksByAuthorAndType(author, type)
        //
        paramNames = _methodParamMap.get(_findBooksByAuthorAndTypeMethod);
        paramDescriptors = new ParameterDescriptor[paramNames.length];
        for (int j = 0; j < paramNames.length; j++)
        {
            paramDescriptors[j] = new ParameterDescriptor();
            paramDescriptors[j].setName(paramNames[j]);
            paramDescriptors[j].setDisplayName(paramNames[j]);
        }
        md = new MethodDescriptor(_findBooksByAuthorAndTypeMethod, paramDescriptors);
        methodDescriptors[index++] = md;
        
        //
        // Declare MethodDescriptor for getBookDetails(book_Id)
        //
        paramNames = _methodParamMap.get(_getBookDetailsMethod);
        paramDescriptors = new ParameterDescriptor[paramNames.length];
        for (int j = 0; j < paramNames.length; j++)
        {
            paramDescriptors[j] = new ParameterDescriptor();
            paramDescriptors[j].setName(paramNames[j]);
            paramDescriptors[j].setDisplayName(paramNames[j]);
        }
        md = new MethodDescriptor(_getBookDetailsMethod, paramDescriptors);
        methodDescriptors[index++] = md;
        
        //
        // Declare MethodDescriptor for getAllBooksTitlesForAuthor(name)
        //
        paramNames = _methodParamMap.get(_getAllBooksTitlesForAuthorMethod);
        paramDescriptors = new ParameterDescriptor[paramNames.length];
        for (int j = 0; j < paramNames.length; j++)
        {
            paramDescriptors[j] = new ParameterDescriptor();
            paramDescriptors[j].setName(paramNames[j]);
            paramDescriptors[j].setDisplayName(paramNames[j]);
        }
        md = new MethodDescriptor(_getAllBooksTitlesForAuthorMethod, paramDescriptors);
        methodDescriptors[index++] = md;
        
        //
        // Declare MethodDescriptor for addBook()
        //
        paramNames = _methodParamMap.get(_addBookMethod);
        paramDescriptors = new ParameterDescriptor[paramNames.length];
        for (int j = 0; j < paramNames.length; j++)
        {
            paramDescriptors[j] = new ParameterDescriptor();
            paramDescriptors[j].setName(paramNames[j]);
            paramDescriptors[j].setDisplayName(paramNames[j]);
        }
        md = new MethodDescriptor(_addBookMethod, paramDescriptors);
        methodDescriptors[index++] = md;
        
        
        //
        // Add method descriptors from parent BeanInfo
        //
        super.initMethodDescriptors(methodDescriptors, index); 
    }
    
    public MethodDescriptor [] getMethodDescriptors()
    {
        MethodDescriptor [] methodDescriptors = new MethodDescriptor[7];
        try
        {
            initMethodDescriptors(methodDescriptors, 0);
        }
        catch (java.beans.IntrospectionException ie)
        {
            throw new ControlException("Unable to create MethodDescriptor", ie);
        }
        return methodDescriptors;
    }
    
    /**
    * Stores PropertyDescriptor descriptors for this bean and its superclasses into
    * an array, starting at the specified index
    */
    protected void initPropertyDescriptors(PropertyDescriptor [] propDescriptors, int index)
    throws java.beans.IntrospectionException
    {
        PropertyDescriptor pd;
        
        pd = new PropertyDescriptor("controlImplementation", apress.beehive.controls.bookstoredb.BookDBControlBean.class, "getControlImplementation", null );
        propDescriptors[index++] = pd;
        
        //
        // Add property descriptors from parent BeanInfo
        //
        super.initPropertyDescriptors(propDescriptors, index); 
    }
    
    // java.beans.BeanInfo.getPropertyDescriptors
    public PropertyDescriptor [] getPropertyDescriptors()
    {
        PropertyDescriptor [] propDescriptors = new PropertyDescriptor[28];
        try
        {
            initPropertyDescriptors(propDescriptors, 0);
        }
        catch (java.beans.IntrospectionException ie)
        {
            throw new ControlException("Unable to create PropertyDescriptor", ie);
        }
        return propDescriptors;
    }
    
    
    protected void initEventSetDescriptors(EventSetDescriptor [] eventSetDescriptors, int index)
    throws java.beans.IntrospectionException
    {
        int eventIndex = 0;
        MethodDescriptor [] eventDescriptors;
        EventSetDescriptor esd;
        Method addListener, removeListener, getListeners;
        Class eventIntf;
        
        
        //
        // Add event set descriptors from parent BeanInfo
        //
        super.initEventSetDescriptors(eventSetDescriptors, index); 
    }
    
    // java.beans.BeanInfo.getEventSetDescriptors
    public EventSetDescriptor [] getEventSetDescriptors()
    {
        EventSetDescriptor [] eventSetDescriptors = new EventSetDescriptor[0];
        try
        {
            initEventSetDescriptors(eventSetDescriptors, 0);
        }
        catch (java.beans.IntrospectionException ie)
        {
            throw new ControlException("Unable to create EventSetDescriptor", ie);
        }
        return eventSetDescriptors;
    }
}
