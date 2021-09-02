package com.example.demo.rester;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
	
	@Autowired
	Testservice ns;
	
	@GetMapping("/data")
	public String getdata() {
		return ns.getdata();
	}
}
