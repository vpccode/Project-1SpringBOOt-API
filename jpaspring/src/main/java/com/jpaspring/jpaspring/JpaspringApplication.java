package com.jpaspring.jpaspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackageClasses = "{com.jpaspring.jpaspring," + "com.jpaspring.jpaspring.Controller," + "com.jpaspring.jpaspring.Model"+"com.jpaspring.jpaspring.Repository"+)
public class JpaspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaspringApplication.class, args);
		System.out.println("********  Hello  ******");
		
		
	}

}
