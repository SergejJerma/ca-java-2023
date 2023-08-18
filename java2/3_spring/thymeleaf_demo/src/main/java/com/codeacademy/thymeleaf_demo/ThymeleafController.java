package com.codeacademy.thymeleaf_demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/thymeleaf")
public class ThymeleafController {

    @GetMapping
    public String thymeleaf() {
        return "myCustomHtml";
    }

    @GetMapping("/dynamicHtml/{name}")
    public String thymeleaf(@PathVariable String name, Model model) {
        MyClass myClassInstance = new MyClass();
        myClassInstance.setMyName(name);

        model.addAttribute("paramName", myClassInstance);
        return "myCustomHtml";
    }

    @ModelAttribute("paramName")
    public MyClass setDefaultParamName() {
        MyClass myClassDefaultInstance = new MyClass();
        myClassDefaultInstance.setMyName("default value");
        return myClassDefaultInstance;
    }

}
