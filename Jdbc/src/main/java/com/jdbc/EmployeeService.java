package com.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
   @Autowired JdbcTemplate jdbctemplate;
   public int insert(Employee emp) {
	   
	   
	   int id = emp.getId();
	   String name = emp.getName();
	   int age = emp.getAge();
	   String sql = "insert into jdbc values(?,?,?)";
	   
	   return jdbctemplate.update(sql,id, name, age);
   }
   }
   
   

