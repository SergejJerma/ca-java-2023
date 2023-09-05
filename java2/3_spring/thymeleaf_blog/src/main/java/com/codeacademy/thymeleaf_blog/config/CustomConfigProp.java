package com.codeacademy.thymeleaf_blog.config;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;

@Validated
//@PropertySource("classpath:mySecrets.properties")
@ConfigurationProperties(prefix="custom.properties")
public record CustomConfigProp (
        //email must be like "<anySymbols>@<anySymbols>.<anySymbols>"
        @Pattern(regexp = ".*@.*\\..*", message = "does not match pattern!") String email,
        @NotNull Integer age)
{}
