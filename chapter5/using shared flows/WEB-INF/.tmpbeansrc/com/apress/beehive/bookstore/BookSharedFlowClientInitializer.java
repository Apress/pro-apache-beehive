
package com.apress.beehive.bookstore;

import java.lang.reflect.Field;
import org.apache.beehive.controls.api.ControlException;
import org.apache.beehive.controls.api.bean.Controls;
import org.apache.beehive.controls.api.context.ControlBeanContext;
import org.apache.beehive.controls.runtime.bean.ControlBean;
import org.apache.beehive.controls.runtime.bean.EventAdaptor;
import org.apache.beehive.controls.runtime.bean.AdaptorPersistenceDelegate;

public class BookSharedFlowClientInitializer
extends org.apache.beehive.controls.runtime.bean.ClientInitializer
{
    static final Field _dbcontrolField;
    static
    {
        try
        {
            _dbcontrolField = com.apress.beehive.bookstore.BookSharedFlow.class.getDeclaredField("dbcontrol");
            _dbcontrolField.setAccessible(true);
        }
        catch (NoSuchFieldException nsfe)
        {
            throw new ExceptionInInitializerError(nsfe);
        }
    }
    
    
    private static void initializeFields(ControlBeanContext cbc,
    com.apress.beehive.bookstore.BookSharedFlow client)
    {
        try
        {
            //
            // Initialize any nested controls used by the client
            //
            apress.beehive.controls.bookstoredb.BookDBControlBean _dbcontrol = (apress.beehive.controls.bookstoredb.BookDBControlBean)cbc.getBean("dbcontrol");
            if (_dbcontrol == null)
            _dbcontrol = (apress.beehive.controls.bookstoredb.BookDBControlBean) Controls.instantiate(apress.beehive.controls.bookstoredb.BookDBControlBean.class, getAnnotationMap(cbc, _dbcontrolField), cbc, "dbcontrol" );
            client.dbcontrol = _dbcontrol; 
            
        }
        catch (RuntimeException re) { throw re; }
        catch (Exception e)
        {
            throw new ControlException("Initializer failure", e);
        }
    }
    
    public static void initialize(ControlBeanContext cbc, com.apress.beehive.bookstore.BookSharedFlow client)
    {
        
        initializeFields( cbc, client );
    }
}
