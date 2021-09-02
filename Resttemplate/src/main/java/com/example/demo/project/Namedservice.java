package com.example.demo.project;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class Namedservice {
	
	@Autowired
	NamedParameterJdbcTemplate njt;
	
	public Map insert(named np) {
		Map<String, Object> t = new HashMap();
		String sql = "insert into njdbc(name,email) values(:Name,:Email)";
		try {
			t.put("Name",np.getName() );
			t.put("Email", np.getEmail());

			int i = njt.update(sql, t);
			if (i > 0) {
				
				t.put("successful", "data inserted");
			} else {
				
				t.put("unsuccessful", "not inserted");
			}
		} catch (Exception e) {
			
			t.put("error ocuured", e);

		}
		return t;
	}
	public List<named> getdata() {	
		
		String sql= "select * from njdbc";
		return njt.query(sql, (rs,rownum)->
		new named(rs.getString(2),rs.getString(3)));		
	}	
 }