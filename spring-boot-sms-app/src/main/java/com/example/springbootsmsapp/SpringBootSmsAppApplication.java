package com.example.springbootsmsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.solution.controller,+ com.solution.mobiquality.service")
public class SpringBootSmsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSmsAppApplication.class, args);
	}

}
