package com.example.demo_spring_cicd;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class DemoSpringCicdApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringCicdApplication.class, args);
    }

    @Bean
    @Order(1)
    ApplicationRunner run() {
        System.out.println("hello word");
        return null;
    }
}
