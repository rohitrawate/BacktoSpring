package com.web.BacktoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication( exclude = {SecurityAutoConfiguration.class})
@SpringBootApplication
public class BacktoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BacktoSpringApplication.class, args);
	}

}
