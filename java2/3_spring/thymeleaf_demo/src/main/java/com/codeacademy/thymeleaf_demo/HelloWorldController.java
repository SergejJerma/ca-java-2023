package com.codeacademy.thymeleaf_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping("/world")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/world/{name}")
    public String sayHelloToMe(@PathVariable String name) {
        return "Hello World!" + name;
    }

}
