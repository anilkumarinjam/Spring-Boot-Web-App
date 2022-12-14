package com.spring1.SBP1.security;

import java.util.function.Function;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfiguration {
    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
    	
    	Function<String, String> encoder = input -> passwordEncoder().encode(input);
		
    	UserDetails user = User.builder().passwordEncoder(encoder)
            .username("Anil")
            .password("Anil")
            .roles("USER")
            .build();
    	UserDetails user1 = User.builder().passwordEncoder(encoder)
                .username("Praveen")
                .password("Praveen")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(user,user1);
    }
    
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    } 
  
}