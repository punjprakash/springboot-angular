package com.products.springbootangular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.products")
public class SpringbootAngularApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAngularApplication.class, args);
    }

}
