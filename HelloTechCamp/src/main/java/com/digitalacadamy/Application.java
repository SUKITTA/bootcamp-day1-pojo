package com.digitalacadamy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        System.out.println("HEllO TechCamp");
        System.out.println("--------------");
        SpringApplication.run(Application.class, args);
    }


}
