package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
@ComponentScan
@MapperScan("com.example.repository")
@SpringBootApplication
public class VuedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VuedemoApplication.class, args);
	}
}
