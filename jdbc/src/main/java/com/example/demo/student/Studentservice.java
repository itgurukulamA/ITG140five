package com.example.demo.student;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class Studentservice{
@Autowired
JdbcTemplate t;

public int insert(student s)
{

String c="insert into student values(?,?,?,?)";
return t.update(c,s.getId(),s.getName(),s.getMail(),s.getPhno());
}

public int update(student s) {
// TODO Auto-generated method stub
String sql="update student set name=? where id=?";
System.out.println(s.getName()+"  "+s.getId());
int i= t.update(sql,s.getName(),s.getId()); 
if(i>0)
{
	System.out.println("data updated");
	return i;
}
else 
{
	System.out.println("data is not updated ");
	return i;
}
}
public List<student> getStudent( student s1) {
	String sql="select * from student where name='"+s1.getName()+"'";
	List<student> student=t.query( sql,
			 (s, rowNum)-> new student(
				s.getInt(1),
				s.getString(2),
				s.getString(3),
				s.getInt(4)));
			
	return student;
}

public List getAll() {
	
	Map<String, Object> dataMap = null;
	List<Map> responseList = new ArrayList<Map>();
	List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
	String sql = "select id,name,mail,phno from student";

	try {
		dataList = t.queryForList(sql);

		for (Map<String, Object> s: dataList) {
			dataMap = new HashMap<String, Object>();
			dataMap.put("id", s.get("id"));
			dataMap.put("name", s.get("name"));
			dataMap.put("mail", s.get("mail"));
			dataMap.put("phno", s.get("phno"));
			responseList.add(dataMap);
		}

	} catch (Exception e) {
		dataMap.put("error", "Error occured");

	}
	
	return responseList;
}
public  void delete(student s) {
	String SQL = "delete from Student where id = ?";
	t.update(SQL, s);
	System.out.println("record deleted");
	return;
}
}

