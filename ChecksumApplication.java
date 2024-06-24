package com.twk.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ChecksumApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChecksumApplication.class, args);
    }
}
