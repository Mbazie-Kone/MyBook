package com.mbaziekone.mybook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.mbaziekone.mybook")
public class MyBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBookApplication.class, args);
	}

}
