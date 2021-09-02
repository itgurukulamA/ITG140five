package com.example.demo.project;


import java.awt.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Namedcontroller {
	
	@Autowired
	Namedservice njs; 
	
	@PostMapping("/iname")
		public Map<String,String> insert(@RequestBody named n) {
			return njs.insert(n);
}
	@GetMapping("/data")
	public String getdata() {
		return njs.getdata();
	}
	
	@GetMapping("/Gdata")
	public String gtJdbc( ){
	RestTemplate restTemplate =  new RestTemplate();
	String s=restTemplate.getForObject("http://localhost:8080/data", String.class);
	return s;

	}
	
}
