package com.example.todolist.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("security.jwt")
public record ConfigProperties(String secret) {

}
