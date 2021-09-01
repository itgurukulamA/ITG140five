package com.example.demo.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwethakController {
	@Autowired
	SwethakService ss;
	
	@PostMapping("/insert")
	public String insertOperation(@RequestBody Swethak s) {
		return ss.saveBatsman(s);
	}
	
	@PostMapping("/update")
	public String updateOperation(@RequestBody Swethak s) {
		return ss.updateBatsman(s);
	}
	
	@PostMapping("/delete")
	public String deleteOperation(@RequestBody Swethak s) {
		return ss.deleteBatsman(s);
	}
	@GetMapping("/select")
	public List selectOperation() {
		return ss.selectBatsman();
	}
	@GetMapping("/selectone")
	public List selectOneBatsman(@RequestBody Swethak s) {
		return ss.selectOneBatsman(s.getId());
	}
}

