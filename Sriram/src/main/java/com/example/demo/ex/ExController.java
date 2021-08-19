package com.example.demo.ex;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ExController {
	@Autowired
	ExService es;
	@PostMapping("/value")
	public String insert(@RequestBody Example ex)
	{
		return es.insert(ex);
	}
	@PostMapping("/value1")
	public String insert1(@RequestBody Example ex)
	{
		return es.insert1(ex);
	}
	@PostMapping("/value2")
	public Map insert2(@RequestBody Example ex)
	{
		return es.insert2(ex);
	}
	@PostMapping("/value3")
	public String insert3(@RequestBody Example ex)
	{
		return es.insert3(ex);
	}
	@GetMapping("/value4")
	public List select1()
	{
		return  es.select1();
	}
	@GetMapping("/value5")
	public List select2(@RequestBody Example ex)
	{
		return es.select3(ex.getId());
	}
}