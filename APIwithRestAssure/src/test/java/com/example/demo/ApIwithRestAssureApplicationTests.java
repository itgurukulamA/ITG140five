package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import io.restassured.RestAssured;

@SpringBootTest
class ApIwithRestAssureApplicationTests {

	 @org.testng.annotations.Test
	 
	 public void contextLoads() {
		RestAssured.baseURI = "http://localhost:8080";
		 RestAssured.given().get("/itemdata").then().statusCode(200).log().body();
		 System.out.println("ok");
		 }
	}

