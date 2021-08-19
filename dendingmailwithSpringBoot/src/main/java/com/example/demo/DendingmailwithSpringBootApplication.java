package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SuppressWarnings("deprecation")
@SpringBootApplication
@EnableSwagger2
public class DendingmailwithSpringBootApplication {

	public static void main(String[] args) 
	{
		
		SpringApplication.run(DendingmailwithSpringBootApplication.class, args);
	}
	@Bean
	public Docket api() { 
		
		return new Docket(DocumentationType.SWAGGER_2).groupName("users-public-api") .select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build().pathMapping("/").enableUrlTemplating(false); 
		
	}
}
