package com.example.demo.student;



	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class Studentcontroller {
	@Autowired Studentservice studentservice;
	@PostMapping("/istudent")
	public String insert(@RequestBody student student) {
	int i= studentservice.insert(student);
	if (i>0) {
	return "inserted";
	}else {
	return "not inserted";
	}

	}
	@GetMapping("/")
	public String test() {
	return "hello";
	}
	@PostMapping("/ustudent")
	public String update(@RequestBody  student s)
	{
	int i=studentservice.update(s);
	if(i>0)
	{
	return "updated";
	}
	else {
	return "not updated";
	}
	}
	@GetMapping("/get")
	public List get(@RequestBody student s)
	{
		return studentservice.getStudent(s);
	}
	@GetMapping("/getall")
	public List getall() {
		return studentservice.getAll();
	}
	@RequestMapping("/delete")
	public String delete(@RequestBody  student s)
	{
	int i=studentservice.update(s);
	if(i>0)
	{
	return "deleted";
	}
	else {
	return "not deleted";
	}
	}
	
	}
