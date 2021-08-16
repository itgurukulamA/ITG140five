package com.jdbc.main.update;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service
public class TableService {
	@Autowired
	public static final Logger log = LoggerFactory.getLogger(TableService.class);
	@Autowired
	private NamedParameterJdbcTemplate npt;

	public Map<String, String> insert(Table ta) {

		Map<String, String> data = new HashMap<String, String>();
		int result = 0;
		String sql = "INSERT INTO employee (id,name,age) VALUES (:Id,:Name,:Age)";
		try {
			SqlParameterSource parameters = new MapSqlParameterSource().addValue("Id", ta.getId())
					.addValue("Name", ta.getName()).addValue("Age", ta.getAge());

			result = npt.update(sql, parameters);
			if (result > 0)
				data.put("success", "Record inserted successfully");
			else
				data.put("failed", "Record failed to insert, please try again!");
		} catch   (Exception e) {

			data.put("error", "Error occured, please try again!");

		}

		return data;

	}

	public Map<String, String> update(Table ta) {
		Map<String, String> data = new HashMap<String, String>();
		log.info("entered into update method");
		String sql = "update employee set age = :age where id = :id";
		SqlParameterSource parameters = new MapSqlParameterSource().addValue("id", ta.getId()).addValue("age",
				ta.getAge());
		int status = npt.update(sql, parameters);
		if (status > 0) {
			log.info("Record updated successfully");
			data.put("updated", "succesfully data updated");
		} else {
			log.info("Record not updated ");
			data.put("not updated", "not ");

		}
		return data;

	}
	
}
