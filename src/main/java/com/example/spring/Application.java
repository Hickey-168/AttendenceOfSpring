package com.example.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    @Value("${status}")

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
