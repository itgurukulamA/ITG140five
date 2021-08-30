package com.example.demo;


import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;

@SpringBootTest
class LaxmanApplicationTests {
	@Test
	public void getItems() {
		RestAssured.baseURI = "http://localhost:8080";
		RestAssured.given().get("/value4").then().statusCode(200).log().body();
		System.out.println("ok");
		
	}
    @org.testng.annotations.Test
    public void addTestProjectContacts() {
	RestAssured.baseURI = "http://localhost:8080";
	RestAssured.when().post("/value").then().statusCode(200).log().body();
	JSONObject req = new JSONObject();

	req.put("id",20);
	req.put("name","Sony vivo");
	req.put("phoneno",36574);

	System.out.println("req" + req);
	Response res = RestAssured.given().contentType(ContentType.JSON)
			.header("Content-Type", "application/json")
			.body(req.toJSONString()).when().post("/value").then().extract().response();
	System.out.println("res==>" + res.asString());
	String result = res.jsonPath().getString("success");

	String samplepost = "Record  successfully";
	System.out.println("result==>" + result);

	Assert.assertEquals(result, samplepost);

}
	}

