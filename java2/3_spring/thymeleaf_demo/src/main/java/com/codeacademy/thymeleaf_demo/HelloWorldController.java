package com.codeacademy.thymeleaf_demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    //http://localhost:8080/hello/world
    @GetMapping("/world")
    public String sayHello() {
        return "Hello World!";
    }

    //http://localhost:8080/hello/world/tomas
    @GetMapping("/world/{name}")
    public String sayHelloToMe(@PathVariable String name) {
        return "Hello World!" + name;
    }

    //http://localhost:8080/hello/world/byRequestParam?name=tomas_zvinys
    @GetMapping("/world/byRequestParam")
    public String sayHelloToMeUsingRequestParam(@RequestParam String name) {
        return "Hello World!" + name;
    }

    //http://localhost:8080/hello/exception
    @GetMapping("/exception")
    public String exceptionThrowingEndpoint() {
        throw new MyException("for whatever reason");
    }



}
