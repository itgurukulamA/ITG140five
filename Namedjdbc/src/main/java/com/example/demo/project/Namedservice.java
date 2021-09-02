package com.example.demo.project;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service
public class Namedservice {
	static Logger log = LoggerFactory.getLogger(Namedservice.class);

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
				log.info("insertion successful");
				t.put("successful", "data inserted");
			} else {
				log.info("not inserted");
				t.put("unsuccessful", "not inserted");
			}
		} catch (Exception e) {
			log.info("entered into exception");
			t.put("error ocuured", e);

		}
		return t;
	}
	public String getdata() {	
		return "hello";
	}
				
		
	}

