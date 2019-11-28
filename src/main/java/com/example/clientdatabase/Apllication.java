package com.example.clientdatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.clientdatabase")
public class Apllication {
    public static void main(String[] args) {
        SpringApplication.run(Apllication.class, args);
    }
}
