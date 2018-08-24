package com.ferdinand.blog.tutorials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@Configuration
public class SpringConfig {

    @Autowired
    private Environment env;

    @Value("${name}")
    private String firstName;

    @Autowired
    private DatabaseConfig dbConfig;

    @PostConstruct
    public void onStartUp(){
        String propertyFile = env.getProperty("properties.file");
        System.out.println("Propertyfile being used is: " + propertyFile);
        System.out.println("My name is: " + firstName);

        //DB configuration
        System.out.println(dbConfig);

        //Cross referenced message
        System.out.println(env.getProperty("message"));
    }
}