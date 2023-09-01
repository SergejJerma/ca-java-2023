package com.codeacademy.thymeleaf_blog.controller;

public class CustomException extends RuntimeException {

    public CustomException(String s) {
        super(s);
    }
}
