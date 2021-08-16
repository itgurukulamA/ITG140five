package com.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired EmployeeService em;
	
	@PostMapping("/emps")
	public String insert (@RequestBody Employee emp) {
		int i  = em.insert(emp);
		if(i>0) {
			return "Data inserted successfully";
		}
		else
		{
			return "data not inserted";
		}
		
		
	}

}
