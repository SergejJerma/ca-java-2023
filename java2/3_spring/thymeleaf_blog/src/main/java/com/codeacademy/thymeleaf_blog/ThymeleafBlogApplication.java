package com.codeacademy.thymeleaf_blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

//@ConfigurationPropertiesScan
@SpringBootApplication
public class ThymeleafBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafBlogApplication.class, args);
    }

}
