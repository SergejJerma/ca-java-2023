package com.codeacademy.thymeleaf_blog.config;

import com.codeacademy.thymeleaf_blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	private final UserService userService;

	public WebSecurityConfig(UserService userService) {
		this.userService = userService;
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.authorizeRequests()
				.antMatchers("/", "/h2/**", "/topics", "/registration").permitAll()
				.anyRequest().authenticated()
				.and()
				.formLogin()
				.loginPage("/login")
				.permitAll()
				.successForwardUrl("/hello")
				.and()
				.logout()
				.permitAll()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
				.logoutSuccessUrl("/login");

		http.csrf().disable();
		http.headers().frameOptions().disable();


		return http.build();
	}
	@Autowired
	public void configure(AuthenticationManagerBuilder auth, PasswordEncoder passwordEncoder) throws Exception {
		auth.userDetailsService(userService)
				.passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
}