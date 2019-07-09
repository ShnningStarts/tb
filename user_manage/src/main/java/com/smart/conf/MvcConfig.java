package com.smart.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.method.annotation.SessionAttributesHandler;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {

    }
    

    @Override
    public void addFormatters(FormatterRegistry registry) {

    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
registry.addViewController("/").setViewName("index");
registry.addViewController("/index").setViewName("index");
    }

}
