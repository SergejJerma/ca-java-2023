package com.codeacademy.thymeleaf_blog.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@Profile(value = "!prodProfile")
@RestController
@RequestMapping("/hello")
public class OnlyTestController {

    private final Environment environment;

    @Value("${my.custom.environment.property}")
    private String environmentProperty;

    public OnlyTestController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/profiles")
    public String helloProfiles() {
        String allActiveProfiles = Arrays.toString(environment.getActiveProfiles());
        return "Some info %s about currently active profiles that should not be visible in PROD, like %s"
                .formatted(allActiveProfiles, this.environmentProperty);
    }

}
