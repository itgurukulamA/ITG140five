package com.example.demo.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;


@Service
public class SwethakService {
@Autowired	
JdbcTemplate jt;

public static Logger log = Logger.getLogger(SwethakService.class);

public String saveBatsman(Swethak s) {
	String str="insert into csk values(?,?,?,?)";
	int result = jt.update(str, s.getId(),s.getName(),s.getAge(),s.getPhno());
	log.info("insert operation");
	if(result>0) {
		return "data inserted successfully" ;
	}
	else {
		return "insert operation failed";
	}
	
}
	public  String updateBatsman(Swethak s) {
	    	String sql = "update csk set name=? where id=?";
	    	String name=s.getName();
	    	int id = s.getId();
			int i=jt.update(sql,name,id);
		    if (i>0) {
		    	return "Update operation performed succesfully";
		    }
		    else {
		    	return "Update operation failed";
		    }
	    	  }
	public String deleteBatsman(Swethak s) {
  	  String sql = "delete from csk where id=?";
  	  int id = s.getId();
  	  int result = jt.update(sql,id);
  	  if (result>0) {
	    	return "Record deleted successfully";
	    }
	    else {
	    	return "Record deletion failed";
	    }
  	  
    }
	
	public List selectBatsman() {
		log.info("select operation is performed");
		log.warn("if select operation is failed give a warning message");
		log.trace("it is used to trace out the information");
  	  Map<String,Object> map=null;
  	  List list = new ArrayList();
  	  List <Map<String,Object>> obj = new ArrayList<Map<String,Object>>();
  	  String sql = "Select * from csk";
  	  obj=jt.queryForList(sql);
  	  for(Map<String,Object>s1:obj) {
  		 map  = new HashMap<String,Object>();
  		 map.put("id", s1.get("id"));
  		 map.put("name", s1.get("name"));
  		 map.put("age", s1.get("age"));
  		 map.put("phno", s1.get("phno"));
  		 list.add(map);
  	  }
  	  return list;
    } 
	
	public List selectOneBatsman(int id) {
		log.info("select operation is performed");
		log.warn("if select operation is failed give a warning message");
		log.trace("it is used to trace out the information");
  	  Map<String,Object> map=null;
  	  List list = new ArrayList();
  	  List <Map<String,Object>> obj = new ArrayList<Map<String,Object>>();
  	  String sql = "Select id,name,age,phno from csk where id=?";
  	  obj=jt.queryForList(sql,id);
  	  for(Map<String,Object>s1:obj) {
  		 map  = new HashMap<String,Object>();
  		 map.put("id", s1.get("id"));
  		 map.put("name", s1.get("name"));
  		 map.put("age", s1.get("age"));
  		 map.put("phno", s1.get("phno"));
  		 list.add(map);
  	  }
  	  return list;
    } 
}



