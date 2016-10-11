package apress.beehive.controls.ejbcontrol;

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

public class BookDetailEJBControlBeanBeanInfo 
extends org.controlhaus.ejb.SessionEJBControlBeanBeanInfo
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
    
    /**
    * Default null-arg constructor used to create a new BeanInfo instance
    */
    public BookDetailEJBControlBeanBeanInfo()
    {
        super(apress.beehive.controls.ejbcontrol.BookDetailEJBControlBean.class);
    }
    
    /**
    * Protected constructor used if this BeanInfo class is extended.
    */
    protected BookDetailEJBControlBeanBeanInfo(Class beanClass)
    {
        super(beanClass);
    }
    
    // java.beans.BeanInfo.getBeanDescriptor
    public BeanDescriptor getBeanDescriptor()
    {
        BeanDescriptor bd = new BeanDescriptor(apress.beehive.controls.ejbcontrol.BookDetailEJBControlBean.class);
        bd.setName( "BookDetailEJBControlBean" );
        bd.setDisplayName( "BookDetailEJBControlBean" );
        
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
        // Declare MethodDescriptor for create()
        //
        paramNames = _methodParamMap.get(_createMethod);
        paramDescriptors = new ParameterDescriptor[paramNames.length];
        for (int j = 0; j < paramNames.length; j++)
        {
            paramDescriptors[j] = new ParameterDescriptor();
            paramDescriptors[j].setName(paramNames[j]);
            paramDescriptors[j].setDisplayName(paramNames[j]);
        }
        md = new MethodDescriptor(_createMethod, paramDescriptors);
        methodDescriptors[index++] = md;
        
        //
        // Declare MethodDescriptor for updateBookDetail(aBook)
        //
        paramNames = _methodParamMap.get(_updateBookDetailMethod);
        paramDescriptors = new ParameterDescriptor[paramNames.length];
        for (int j = 0; j < paramNames.length; j++)
        {
            paramDescriptors[j] = new ParameterDescriptor();
            paramDescriptors[j].setName(paramNames[j]);
            paramDescriptors[j].setDisplayName(paramNames[j]);
        }
        md = new MethodDescriptor(_updateBookDetailMethod, paramDescriptors);
        methodDescriptors[index++] = md;
        
        //
        // Declare MethodDescriptor for insertBookDetail(aBook)
        //
        paramNames = _methodParamMap.get(_insertBookDetailMethod);
        paramDescriptors = new ParameterDescriptor[paramNames.length];
        for (int j = 0; j < paramNames.length; j++)
        {
            paramDescriptors[j] = new ParameterDescriptor();
            paramDescriptors[j].setName(paramNames[j]);
            paramDescriptors[j].setDisplayName(paramNames[j]);
        }
        md = new MethodDescriptor(_insertBookDetailMethod, paramDescriptors);
        methodDescriptors[index++] = md;
        
        //
        // Declare MethodDescriptor for hello()
        //
        paramNames = _methodParamMap.get(_helloMethod);
        paramDescriptors = new ParameterDescriptor[paramNames.length];
        for (int j = 0; j < paramNames.length; j++)
        {
            paramDescriptors[j] = new ParameterDescriptor();
            paramDescriptors[j].setName(paramNames[j]);
            paramDescriptors[j].setDisplayName(paramNames[j]);
        }
        md = new MethodDescriptor(_helloMethod, paramDescriptors);
        methodDescriptors[index++] = md;
        
        //
        // Declare MethodDescriptor for remove(arg0)
        //
        paramNames = _methodParamMap.get(_remove0Method);
        paramDescriptors = new ParameterDescriptor[paramNames.length];
        for (int j = 0; j < paramNames.length; j++)
        {
            paramDescriptors[j] = new ParameterDescriptor();
            paramDescriptors[j].setName(paramNames[j]);
            paramDescriptors[j].setDisplayName(paramNames[j]);
        }
        md = new MethodDescriptor(_remove0Method, paramDescriptors);
        methodDescriptors[index++] = md;
        
        //
        // Declare MethodDescriptor for remove(arg0)
        //
        paramNames = _methodParamMap.get(_remove1Method);
        paramDescriptors = new ParameterDescriptor[paramNames.length];
        for (int j = 0; j < paramNames.length; j++)
        {
            paramDescriptors[j] = new ParameterDescriptor();
            paramDescriptors[j].setName(paramNames[j]);
            paramDescriptors[j].setDisplayName(paramNames[j]);
        }
        md = new MethodDescriptor(_remove1Method, paramDescriptors);
        methodDescriptors[index++] = md;
        
        //
        // Declare MethodDescriptor for getHomeHandle()
        //
        paramNames = _methodParamMap.get(_getHomeHandleMethod);
        paramDescriptors = new ParameterDescriptor[paramNames.length];
        for (int j = 0; j < paramNames.length; j++)
        {
            paramDescriptors[j] = new ParameterDescriptor();
            paramDescriptors[j].setName(paramNames[j]);
            paramDescriptors[j].setDisplayName(paramNames[j]);
        }
        md = new MethodDescriptor(_getHomeHandleMethod, paramDescriptors);
        methodDescriptors[index++] = md;
        
        //
        // Declare MethodDescriptor for getEJBMetaData()
        //
        paramNames = _methodParamMap.get(_getEJBMetaDataMethod);
        paramDescriptors = new ParameterDescriptor[paramNames.length];
        for (int j = 0; j < paramNames.length; j++)
        {
            paramDescriptors[j] = new ParameterDescriptor();
            paramDescriptors[j].setName(paramNames[j]);
            paramDescriptors[j].setDisplayName(paramNames[j]);
        }
        md = new MethodDescriptor(_getEJBMetaDataMethod, paramDescriptors);
        methodDescriptors[index++] = md;
        
        //
        // Declare MethodDescriptor for remove()
        //
        paramNames = _methodParamMap.get(_remove2Method);
        paramDescriptors = new ParameterDescriptor[paramNames.length];
        for (int j = 0; j < paramNames.length; j++)
        {
            paramDescriptors[j] = new ParameterDescriptor();
            paramDescriptors[j].setName(paramNames[j]);
            paramDescriptors[j].setDisplayName(paramNames[j]);
        }
        md = new MethodDescriptor(_remove2Method, paramDescriptors);
        methodDescriptors[index++] = md;
        
        //
        // Declare MethodDescriptor for isIdentical(arg0)
        //
        paramNames = _methodParamMap.get(_isIdenticalMethod);
        paramDescriptors = new ParameterDescriptor[paramNames.length];
        for (int j = 0; j < paramNames.length; j++)
        {
            paramDescriptors[j] = new ParameterDescriptor();
            paramDescriptors[j].setName(paramNames[j]);
            paramDescriptors[j].setDisplayName(paramNames[j]);
        }
        md = new MethodDescriptor(_isIdenticalMethod, paramDescriptors);
        methodDescriptors[index++] = md;
        
        //
        // Declare MethodDescriptor for getPrimaryKey()
        //
        paramNames = _methodParamMap.get(_getPrimaryKeyMethod);
        paramDescriptors = new ParameterDescriptor[paramNames.length];
        for (int j = 0; j < paramNames.length; j++)
        {
            paramDescriptors[j] = new ParameterDescriptor();
            paramDescriptors[j].setName(paramNames[j]);
            paramDescriptors[j].setDisplayName(paramNames[j]);
        }
        md = new MethodDescriptor(_getPrimaryKeyMethod, paramDescriptors);
        methodDescriptors[index++] = md;
        
        //
        // Declare MethodDescriptor for getHandle()
        //
        paramNames = _methodParamMap.get(_getHandleMethod);
        paramDescriptors = new ParameterDescriptor[paramNames.length];
        for (int j = 0; j < paramNames.length; j++)
        {
            paramDescriptors[j] = new ParameterDescriptor();
            paramDescriptors[j].setName(paramNames[j]);
            paramDescriptors[j].setDisplayName(paramNames[j]);
        }
        md = new MethodDescriptor(_getHandleMethod, paramDescriptors);
        methodDescriptors[index++] = md;
        
        //
        // Declare MethodDescriptor for getEJBHome()
        //
        paramNames = _methodParamMap.get(_getEJBHomeMethod);
        paramDescriptors = new ParameterDescriptor[paramNames.length];
        for (int j = 0; j < paramNames.length; j++)
        {
            paramDescriptors[j] = new ParameterDescriptor();
            paramDescriptors[j].setName(paramNames[j]);
            paramDescriptors[j].setDisplayName(paramNames[j]);
        }
        md = new MethodDescriptor(_getEJBHomeMethod, paramDescriptors);
        methodDescriptors[index++] = md;
        
        
        //
        // Add method descriptors from parent BeanInfo
        //
        super.initMethodDescriptors(methodDescriptors, index); 
    }
    
    public MethodDescriptor [] getMethodDescriptors()
    {
        MethodDescriptor [] methodDescriptors = new MethodDescriptor[17];
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
        
        pd = new PropertyDescriptor("controlImplementation", apress.beehive.controls.ejbcontrol.BookDetailEJBControlBean.class, "getControlImplementation", null );
        propDescriptors[index++] = pd;
        
        //
        // Add property descriptors from parent BeanInfo
        //
        super.initPropertyDescriptors(propDescriptors, index); 
    }
    
    // java.beans.BeanInfo.getPropertyDescriptors
    public PropertyDescriptor [] getPropertyDescriptors()
    {
        PropertyDescriptor [] propDescriptors = new PropertyDescriptor[9];
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
