package apress.beehive.controls.javacontrol;

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

public class AmazonControlBeanBeanInfo 
extends org.apache.beehive.controls.runtime.bean.ControlBeanInfo
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
    
    /**
    * Default null-arg constructor used to create a new BeanInfo instance
    */
    public AmazonControlBeanBeanInfo()
    {
        super(apress.beehive.controls.javacontrol.AmazonControlBean.class);
    }
    
    /**
    * Protected constructor used if this BeanInfo class is extended.
    */
    protected AmazonControlBeanBeanInfo(Class beanClass)
    {
        super(beanClass);
    }
    
    // java.beans.BeanInfo.getBeanDescriptor
    public BeanDescriptor getBeanDescriptor()
    {
        BeanDescriptor bd = new BeanDescriptor(apress.beehive.controls.javacontrol.AmazonControlBean.class);
        bd.setName( "AmazonControlBean" );
        bd.setDisplayName( "AmazonControlBean" );
        
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
        // Declare MethodDescriptor for lookupISBN(isbn)
        //
        paramNames = _methodParamMap.get(_lookupISBNMethod);
        paramDescriptors = new ParameterDescriptor[paramNames.length];
        for (int j = 0; j < paramNames.length; j++)
        {
            paramDescriptors[j] = new ParameterDescriptor();
            paramDescriptors[j].setName(paramNames[j]);
            paramDescriptors[j].setDisplayName(paramNames[j]);
        }
        md = new MethodDescriptor(_lookupISBNMethod, paramDescriptors);
        methodDescriptors[index++] = md;
        
        //
        // Declare MethodDescriptor for searchBook(isbn)
        //
        paramNames = _methodParamMap.get(_searchBookMethod);
        paramDescriptors = new ParameterDescriptor[paramNames.length];
        for (int j = 0; j < paramNames.length; j++)
        {
            paramDescriptors[j] = new ParameterDescriptor();
            paramDescriptors[j].setName(paramNames[j]);
            paramDescriptors[j].setDisplayName(paramNames[j]);
        }
        md = new MethodDescriptor(_searchBookMethod, paramDescriptors);
        methodDescriptors[index++] = md;
        
        
    }
    
    public MethodDescriptor [] getMethodDescriptors()
    {
        MethodDescriptor [] methodDescriptors = new MethodDescriptor[2];
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
        
        pd = new PropertyDescriptor("controlImplementation", apress.beehive.controls.javacontrol.AmazonControlBean.class, "getControlImplementation", null );
        propDescriptors[index++] = pd;
        
    }
    
    // java.beans.BeanInfo.getPropertyDescriptors
    public PropertyDescriptor [] getPropertyDescriptors()
    {
        PropertyDescriptor [] propDescriptors = new PropertyDescriptor[1];
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
