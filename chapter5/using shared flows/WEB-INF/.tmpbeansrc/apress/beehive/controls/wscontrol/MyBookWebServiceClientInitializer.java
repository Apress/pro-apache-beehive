
package apress.beehive.controls.wscontrol;

import java.lang.reflect.Field;
import org.apache.beehive.controls.api.ControlException;
import org.apache.beehive.controls.api.bean.Controls;
import org.apache.beehive.controls.api.context.ControlBeanContext;
import org.apache.beehive.controls.runtime.bean.ControlBean;
import org.apache.beehive.controls.runtime.bean.EventAdaptor;
import org.apache.beehive.controls.runtime.bean.AdaptorPersistenceDelegate;

public class MyBookWebServiceClientInitializer
extends org.apache.beehive.controls.runtime.bean.ClientInitializer
{
    static final Field _ejbcontrolField;
    static final Field _amazonField;
    static
    {
        try
        {
            _ejbcontrolField = apress.beehive.controls.wscontrol.MyBookWebService.class.getDeclaredField("ejbcontrol");
            _ejbcontrolField.setAccessible(true);
            _amazonField = apress.beehive.controls.wscontrol.MyBookWebService.class.getDeclaredField("amazon");
            _amazonField.setAccessible(true);
        }
        catch (NoSuchFieldException nsfe)
        {
            throw new ExceptionInInitializerError(nsfe);
        }
    }
    
    
    private static void initializeFields(ControlBeanContext cbc,
    apress.beehive.controls.wscontrol.MyBookWebService client)
    {
        try
        {
            //
            // Initialize any nested controls used by the client
            //
            apress.beehive.controls.ejbcontrol.BookDetailEJBControlBean _ejbcontrol = (apress.beehive.controls.ejbcontrol.BookDetailEJBControlBean)cbc.getBean("ejbcontrol");
            if (_ejbcontrol == null)
            _ejbcontrol = (apress.beehive.controls.ejbcontrol.BookDetailEJBControlBean) Controls.instantiate(apress.beehive.controls.ejbcontrol.BookDetailEJBControlBean.class, getAnnotationMap(cbc, _ejbcontrolField), cbc, "ejbcontrol" );
            client.ejbcontrol = _ejbcontrol; 
            
            apress.beehive.controls.javacontrol.AmazonControlBean _amazon = (apress.beehive.controls.javacontrol.AmazonControlBean)cbc.getBean("amazon");
            if (_amazon == null)
            _amazon = (apress.beehive.controls.javacontrol.AmazonControlBean) Controls.instantiate(apress.beehive.controls.javacontrol.AmazonControlBean.class, getAnnotationMap(cbc, _amazonField), cbc, "amazon" );
            client.amazon = _amazon; 
            
        }
        catch (RuntimeException re) { throw re; }
        catch (Exception e)
        {
            throw new ControlException("Initializer failure", e);
        }
    }
    
    public static void initialize(ControlBeanContext cbc, apress.beehive.controls.wscontrol.MyBookWebService client)
    {
        
        initializeFields( cbc, client );
    }
}
