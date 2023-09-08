package com.codeacademy.thymeleaf_blog.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Validated
//@PropertySource("classpath:mySecrets.properties")
@ConfigurationProperties(prefix="custom.properties")
public record CustomConfigProp (
        //email must be like "<anySymbols>@<anySymbols>.<anySymbols>"
        @Pattern(regexp = ".*@.*\\..*", message = "does not match pattern!") String email,
        @NotNull Integer age)
{}
