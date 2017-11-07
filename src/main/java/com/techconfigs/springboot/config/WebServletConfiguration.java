package com.techconfigs.springboot.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by Ali Adnan
 */

public class WebServletConfiguration implements WebApplicationInitializer {
    public void onStartup(ServletContext ctx) throws ServletException {
        AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
        webCtx.register(SpringConfig.class);
        webCtx.setServletContext(ctx);
        ServletRegistration.Dynamic servlet = ctx.addServlet("dispatcher", new DispatcherServlet(webCtx));
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }
}