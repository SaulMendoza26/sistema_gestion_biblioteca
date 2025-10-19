package com.saulproyects.biblioteca.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.saulproyects.biblioteca")
public class AppConfig {

    @Bean 
    public ViewResolver viewResolver(){

        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/templates/");
        internalResourceViewResolver.setSuffix(".html");
        return internalResourceViewResolver;
    }
    
}
