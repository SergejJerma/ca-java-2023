package com.codeacademy.thymeleaf_blog.config;

import com.codeacademy.thymeleaf_blog.controller.CustomStatusException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ModelAndView handleMyException(CustomStatusException exception, Model model) {
        model.addAttribute("errorId", UUID.randomUUID().toString());
        model.addAttribute("message", exception.getMessage());
        return new ModelAndView("customError", model.asMap());
    }

    @ExceptionHandler
    public ModelAndView handleWhateverException(Exception exception, Model model) {
        model.addAttribute("errorId", UUID.randomUUID().toString());
        model.addAttribute("message", exception.getMessage());
        return new ModelAndView("customError", model.asMap());
    }
}
