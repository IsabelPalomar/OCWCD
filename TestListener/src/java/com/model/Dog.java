/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 *
 * @author isabelpalomar
 */
@WebListener
public class Dog implements HttpSessionBindingListener {

       private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
       System.out.println("This is the name of the attribute" + event.getName()); 
       System.out.println("This is the vakue of the attribute" + event.getValue()); 

    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
