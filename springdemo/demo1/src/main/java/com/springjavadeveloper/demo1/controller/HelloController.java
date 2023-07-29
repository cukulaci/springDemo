package com.springjavadeveloper.demo1.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class HelloController {

	//localhost:8080/hello
	
	//@GetMapping(path = "/hello")
	@RequestMapping(path = "/get", method = RequestMethod.GET)
	public String screenIt() {
		return "Displayed!";
	}
	
	@PostMapping("/save")
	public String save() {
		return "Data saved!";
	}
	
	@DeleteMapping("/delete")
	public String delete() {
		return "Data deleted!";
	}
	
}
