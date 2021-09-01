package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService {
	
	@Autowired JdbcTemplate jt;
	
	public String getAll(Student s)
	{
		 String s1="insert into persons values(?,?)";
		    int i=jt.update(s1,new Object[] {s.getId(),s.getName()});
		    if(i>0)
		    {
		    return "data inserted successfully";
		    }
		    else
		    {
		    return "data not inserted";
		    }
	}
	public String updatePerson(Student s) {
		String s1 = "update persons set name=? where id=?";
		int i=jt.update(s1,new Object[] {s.getName(),s.getId()});
		if(i>0) {
			return "data updated successfully";
		}
		else {
			return "sorry data was not updated";
		}
	}
	public String deleteById(@RequestBody Student s) {
    String s1="delete from persons where id =?";
    int i=jt.update(s1,s.getId());
    if(i>0)
    {
    return "Record with id="+s.getId()+"deleted successfully";
    }
    else
    {
    return " Record with id="+s.getId()+" deosn't deleted";
    }
    }
	public List<Student> getall()
    {
    String sql="select * from Student";
    List<Student> p=jt.query(sql,(rs,rownum)->new Student(
    rs.getInt(1),
    rs.getString(2)
    ));
    return p;
    }
}
