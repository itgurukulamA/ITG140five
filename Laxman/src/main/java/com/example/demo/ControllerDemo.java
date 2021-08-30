package com.example.demo;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControllerDemo {
	@Autowired
	DemoService es;
	@PostMapping("/value")
	public String insert(@RequestBody DemoPOJO ex)
	{
		return es.insert(ex);
	}
	@PostMapping("/value1")
	public String insert1(@RequestBody DemoPOJO ex)
	{
		return es.insert1(ex);
	}
	@PostMapping("/value2")
	public Map insert2(@RequestBody DemoPOJO ex)
	{
		return es.insert2(ex);
	}
	@PostMapping("/value3")
	public String insert3(@RequestBody DemoPOJO ex)
	{
		return es.insert3(ex);
	}
}