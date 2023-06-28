package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootJpaApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(BootJpaApplication.class, args);
		ZAlienController c=context.getBean(ZAlienController.class);
		c.home();
		
		
	}
}
