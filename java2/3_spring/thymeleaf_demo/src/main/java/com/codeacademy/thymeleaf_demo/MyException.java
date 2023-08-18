package com.codeacademy.thymeleaf_demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.I_AM_A_TEAPOT, reason = "ran out of coffee")
public class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }
}
