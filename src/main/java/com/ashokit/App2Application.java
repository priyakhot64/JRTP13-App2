package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App2Application {
	int a = 10;
	int b = 20;
	
	String s1 = "hello";
	String s2 = "world";
	public static void main(String[] args) {
		SpringApplication.run(App2Application.class, args);
	}

}
