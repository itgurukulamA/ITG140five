package com.example.demo.namedjdbc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Namedcontroller {
@Autowired Namedservice njs;
@PostMapping("/iname")
public Map<String,String> insert(@RequestBody named n) {
return njs.insert(n);
}
}
