package com.logkart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.context.request.RequestContextListener;
/**
 * 
 * @author Vishal Gupta
 *
 */
@SpringBootApplication
@Configuration
@EnableWebSecurity
public class LogKartBackendApplication extends WebSecurityConfigurerAdapter {
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
    	
    	http.cors().and()
    		.authorizeRequests()
    		.antMatchers("/api/v1/**").permitAll()
    		.anyRequest().permitAll();
    }
	
	@Bean
	public RequestContextListener requestContextListener() {
	    return new RequestContextListener();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(LogKartBackendApplication.class, args);
	}
}
