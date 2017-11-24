package org.owndev.scs.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

@Configuration
@Import({DatabaseConfig.class})
@ComponentScan(basePackages = {"org.owndev.scs.dao", "org.owndev.scs.service", "org.owndev.scs.controllers"})
public class ScsWebAppInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(DatabaseConfig.class, ScsMvcConfig.class);
        rootContext.setServletContext(servletContext);

        servletContext.addListener(new ContextLoaderListener(rootContext));
        servletContext.addListener(new RequestContextListener());

        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet());
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }

}
