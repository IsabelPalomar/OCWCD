package com.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isabelpalomar
 */
public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener {

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
         System.out.println("This is the name of the attribute" + event.getName()); 
       System.out.println("This is the vakue of the attribute" + event.getValue()); 
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
         System.out.println("This is the name of the attribute" + event.getName()); 
       System.out.println("This is the vakue of the attribute" + event.getValue()); 
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
