package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String sayHello() {
        return "<h1 style='font-family:sans-serif; text-align:center; margin-top:50px; font-size:60px;'>" + 
               "Hello from a simple Java Spring Boot app! 🍎🚀</h1>";
    }
}