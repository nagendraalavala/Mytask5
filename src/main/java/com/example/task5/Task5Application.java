package com.example.task5;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Task5Application {

	private static  final Logger logger = LoggerFactory.getLogger(Task5Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Task5Application.class, args);
	}

}
