package com.example.demo;

import java.util.*;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	@Autowired
	JdbcTemplate jt;
	@Autowired
	NamedParameterJdbcTemplate jpt;
	 public static Logger log= Logger.getLogger(DemoService.class);
	public String insert(DemoPOJO ex)
	{
		String sql="insert into student values(?,?,?)";
		int id=ex.getId();
		String name=ex.getName();
		int phoneno=ex.getPhoneno();
		int result=jt.update(sql,id,name,phoneno);
		if(result>0)
		{
			log.info("data inserted sucessfully");
			return "data inserted successfully";
		}
		else
		{
			log.info("data inserted failed");
			return "data inserted failed";
		}
	}
	public String insert1(DemoPOJO ex)
	{
		String sql="update student set name=? where id=?";
		int id=ex.getId();
		String name=ex.getName();
		int result=jt.update(sql,name,id);
		if(result>0)
		{
			log.info("data updated sucessfully");
			return "data updated sucessfully";
		}
		else
		{
			log.info("data updated failed");
			return "data updated failed";
		}
	}
	public Map<String,String> insert2(DemoPOJO ex)
	{
		Map<String,String> n=new HashMap<String,String>();
		String sql="insert into student(id,name,phoneno) values(:id,:name,:phoneno)";
		SqlParameterSource par=new MapSqlParameterSource()
				.addValue("id",ex.getId())
				.addValue("name",ex.getName())
				.addValue("phoneno",ex.getPhoneno());
		int result=jpt.update(sql,par);
		if(result>0)
		{
			log.info("sucess");
			n.put("success","data inserted successfully");
		}
		else
		{
			log.info("failed");
			n.put("failed","data inserted failed");
		}
		return n;
	}
	public String insert3(DemoPOJO ex)
	{
		String sql="delete from student where id=?";
		int id=ex.getId();
		int result =jt.update(sql,id);
		if(result>0)
		{
			log.info("deleted sucessfully");
			return "record is deleted sucessfully";
		}
		else
		{
			log.info("sorry");
			return "sorry...! record is deleted failed";
		}
	}
	/*public List selectall()
	  {
	 Map<String,Object> map=null;
	 List list=new ArrayList();
	 List<Map<String,Object>> obj=new ArrayList<Map<String,Object>>();
	 String sql= "select * from student";
	 obj=jt.queryForList(sql);
	 for(Map<String,Object> r1:obj)
	 {
	 map=new HashMap<String,Object>();
	 map.put("id",r1.get("id"));
	 map.put("name",r1.get("name"));
	 map.put("phoneno",r1.get("phoneno"));
	 list.add(map);
	 }
	 return list;
	   }*/
}
