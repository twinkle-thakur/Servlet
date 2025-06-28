package com.servlet.lifecycle;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class PalakListener
 *
 */
@WebListener
public class PalakListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public PalakListener() {
    	  System.out.println("PalakListener constructor()");
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
    	  System.out.println("PalakListener contextDestroyed()");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    System.out.println("PalakListener contextInitialized()");
    }
	
}
