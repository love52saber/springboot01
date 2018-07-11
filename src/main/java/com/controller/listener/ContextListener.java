package com.controller.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {


    private ServletContext servletContext;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        servletContext = servletContextEvent.getServletContext();
        String resourcePath = "http://127.0.0.1";
        servletContext.setAttribute("resourcePath",resourcePath);
    }



    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
