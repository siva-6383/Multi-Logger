package com.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.log")
public class LogsivaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogsivaApplication.class, args);
	}

}
