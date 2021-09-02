package com.example.demo.student;

import java.util.List;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Studentcontroller {

	private static Logger log = LoggerFactory.getLogger(Studentcontroller.class);
	@Autowired
	Studentservice studentservice;

	@PostMapping("/istudent")
	public String insert(@RequestBody student student) {
		int i = studentservice.insert(student);
		if (i > 0) {
			log.warn("inserted");
			return "inserted";
		} else {
			log.warn("not inserted");
			return "not inserted";
		}

	}

	@GetMapping("/")
	public String test() {
		return "hello";
	}

	@PutMapping("/ustudent")
	public String update(@RequestBody student s) {
		int i = studentservice.update(s);
		if (i > 0) {
			log.warn("data updated");
			return "updated";
		} else {
			log.warn("data not updated");
			return "not updated";
		}
	}

	@GetMapping("/get")
	public List get(@RequestBody student s) {
		return studentservice.getStudent(s);
	}

	@GetMapping("/getall")
	public List getall() {
		return studentservice.getAll();
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		int i = studentservice.delete(id);
		if (i > 0) {
			log.warn("data deleted");
			return "deleted";
		} else {
			log.warn("data not deleted");
			return "not deleted";
		}
	}

	// RestTemplate//
	@PostMapping("/insert")
	public String insert() {
		RestTemplate resttemplate = new RestTemplate();
		student s = new student(8, "teja", "teja@gmail.com", 34567829);
		HttpEntity<student> request = new HttpEntity<>(s);
		return resttemplate.postForObject("http://localhost:8080/istudent", request, String.class);
	}

	@PutMapping("/update")
	public String update() {
		RestTemplate resttemplate = new RestTemplate();
		student s = new student(8, "vineeth", "vinnu@gmail.com", 6785678);
		HttpEntity<student> request = new HttpEntity<>(s);
		resttemplate.put("http://localhost:8080/ustudent", request, String.class);
		return "Data Updated";

	}

	@GetMapping("/select")
	public String select() {
		RestTemplate restTemplate = new RestTemplate();
		String str = restTemplate.getForObject("http://localhost:8080/getall", String.class);
		return str;
	}

	@DeleteMapping("/deletion/{id}")
	public String deletet(@PathVariable int id) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete("http://localhost:8080/delete/" + id, String.class);
		return "Data deleted";
	}

	// .....Pagination.....//
	@GetMapping("/pages/{page}/{size}")
	public List page(@PathVariable int page, @PathVariable int size) {
		return studentservice.getoffset(page, size);
	}
}