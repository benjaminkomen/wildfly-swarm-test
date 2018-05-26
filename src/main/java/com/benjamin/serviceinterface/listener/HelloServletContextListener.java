package com.benjamin.serviceinterface.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HelloServletContextListener implements ServletContextListener {

    private static final Logger logger = LoggerFactory.getLogger(HelloServletContextListener.class);

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        logger.info("We are initializing the servletcontextlistener.");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        // nothing to do here
    }
}
