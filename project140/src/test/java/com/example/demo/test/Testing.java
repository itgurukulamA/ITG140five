package com.example.demo.test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;

public class Testing {
	@Test
	public void inserttest() {
		RestAssured.baseURI = "http://localhost:8080";
		JSONObject ins = new JSONObject();

		ins.put("id", 7);
		ins.put("name", "mishra");
		ins.put("mail", "mishra@mail.com");
		ins.put("phno", 929292);

		System.out.println("data" + ins);
		Response res = RestAssured.given().contentType(ContentType.JSON).header("Content-Type", "application/json")
				.body(ins.toJSONString()).when().post("/istudent").then().extract().response();
		System.out.println("res==>" + res.asString());
		System.out.println("sucessfully inserted!!");

	}

	@Test

	public void getTest() {
		RestAssured.baseURI = "http://localhost:8080";
		RestAssured.given().get("/getall").then().statusCode(200).log().body();
		System.out.println("Fetched");
	}

	@Test
	public void deletetest() {
		RestAssured.baseURI = "http://localhost:8080";
		JSONObject req = new JSONObject();

		req.put("id", 6);

		System.out.println("req" + req);
		Response res = RestAssured.given().contentType(ContentType.JSON).header("Content-Type", "application/json")
				.body(req.toJSONString()).when().delete("/delete").then().extract().response();
		System.out.println("res==>" + res.asString());
	}

}