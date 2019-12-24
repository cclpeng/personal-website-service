package com.tutorial.mongo.db.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer
{
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // eg. "/post/**" but not "*/post/**" or "*". Must start w "/"
        registry.addMapping("/**")
                .allowCredentials(true)
                .allowedOrigins("http://localhost:3000")
                .allowedMethods("GET", "POST", "DELETE")
                .allowedHeaders("*");
    }
}
