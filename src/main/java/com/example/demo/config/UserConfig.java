package com.example.demo.config;

import com.example.demo.service.NameGenerator;
import com.example.demo.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    public UserService createUser(NameGenerator nameGenerator) {
        return new UserService(nameGenerator);
    }
}

