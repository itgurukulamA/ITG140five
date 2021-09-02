package com.example.demo.tester;


import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Mytest {
	@Test
	public void getTest() {
		RestAssured.baseURI = "http://localhost:8080";
		RestAssured.given().get("/data").then().statusCode(200).log().body();
		System.out.println("done");
		}
}