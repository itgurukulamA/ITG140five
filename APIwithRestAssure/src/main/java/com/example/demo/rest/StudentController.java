package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StudentController {
	@Autowired JdbcTemplate jt;
	
	@Autowired StudentService obj;
	@GetMapping("/")
	public String getResult() {
		return "hi swethak";
	}
	@GetMapping("/select")
    public List<Student> getall()
    {
    return obj.getall();
    }
    @PostMapping("/insert")
    public  String addPerson(@RequestBody Student s)
    {
        return obj.getAll(s);
    }
    @PutMapping("/update")
    public String updatePerson(@RequestBody Student s) {
    return obj.updatePerson(s);
    }
    @DeleteMapping("delete")
    public String deleteById(@RequestBody Student s)
    {
    return obj.deleteById(s);
    }
    @GetMapping("/rest")
    public String  restTmp() {
       RestTemplate resttemplate = new RestTemplate();
       return resttemplate.getForObject("http://localhost:9090/select", String.class);
    }
    @PostMapping("/restinsert")
    public String restIns() {
    	  RestTemplate resttemplate = new RestTemplate();
    	  Swethak s = new Swethak(12,"karthik",28,7288);
    	  HttpEntity<Swethak> request = new HttpEntity<>(s);
    	  return resttemplate.postForObject("http://localhost:9090/insert", request,String.class);
//    	  return resttemplate.getForObject("http://localhost:9090/select", String.class);
    }
}


