package com.codeacademy.thymeleaf_blog.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@PropertySource("classpath:mySecrets.properties")
@EnableConfigurationProperties(CustomConfigProp.class)
//@Profile(value = {"!myCustomProfile"})
@Configuration
public class CustomProfileConfig {

//    //Not recommended
//    @Autowired
//    private Environment environment;

    @Bean
    public String defaultProfileTestBean(Environment environment, CustomConfigProp prop) {
        String[] activeProfiles = environment.getActiveProfiles();
        System.out.println("Active profiles: " + Arrays.toString(activeProfiles)
                + "email: %s, age: %s".formatted(prop.email(), prop.age()));
        return "";
    }

    /**
     * Execute this method (initialize myCustomProfileTestBean bean) only if myCustomProfile is active
     * @return: whatever (just for test)
     */
    @Profile(value = {"myCustomProfile"})
    @Bean
    public String myCustomProfileTestBean(Environment environment) {
        String[] activeProfiles = environment.getActiveProfiles();
        System.out.println("Active profiles: " + Arrays.toString(activeProfiles));
        return "";
    }
}
