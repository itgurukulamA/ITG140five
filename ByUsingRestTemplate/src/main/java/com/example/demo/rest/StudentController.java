package com.example.demo.rest;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StudentController {
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "hello";
	}
	@RequestMapping(value = "/posts")
	public String getProductsList() {
		RestTemplate obj=new RestTemplate();
		String s =obj.getForObject("http://localhost:8080/hello",String.class);
		return s+"Swethak";
		
	}
}
	

