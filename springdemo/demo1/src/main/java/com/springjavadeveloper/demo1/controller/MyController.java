package com.springjavadeveloper.demo1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springjavadeveloper.demo1.model.User;

@RestController
@RequestMapping(path = "/api")
public class MyController {
	
//	@GetMapping("/message/{message}")
//	public String getMyMessage(@PathVariable String message) {
//		return "Your message is " +message;
//	}
	
//	@GetMapping("/message/{m}")
//	public String getMyMessage(@PathVariable("m") String message) {
//		return "Your message is " + message;
//	}

//	@GetMapping("/message")
//	public String getMyMessage(@RequestParam String message) {
//		return "Your message is: " + message;
//	}
	
//	@GetMapping("/message")
//	public String getMyMessage(@RequestParam("m") String message) {
//		return "Your message is: " + message;
//	}

//	------------------
	
//	@GetMapping({"/message1" , "/message1/{message}"}) //PathVariable buradaki veriyi direkt olarak alır.
//	public String getMyMessageWithVariabla(@PathVariable(name = "message", required = false) String message) {
//		return "Your message is: " + message;
//	}
//	
//	@GetMapping("/message2") //RequestParam encoded olmuş veriyi alır. Araya boşluk yerine artı koyarsan boşluk olarak kabul eder gibi.
//	public String getMyMessageWithParam(@RequestParam(name = "message", required = false, defaultValue = "please add a value.") String message) {
//		return "Your message is: " + message;
//	}
	
//	------------------
	
//	@PostMapping("/users")
//	public User saveUser(@RequestBody User user) {
//		System.out.println("User saved!");
//		user.setPassword("********");
//		return user;
//	}
//	
//	@PostMapping("/users-all")
//	public List<User> saveAllUser(@RequestBody List<User> users) {
//		System.out.println("All users saved!");
//		users.forEach(user -> user.setPassword("******")); //her user'ın password bilgisini boş String ile doldur.
//		return users;
//	}
	
//	------------------
	
	@GetMapping("/header")
	public String getHeader(@RequestHeader("my-Header") String myHeader) {
		return "Your header is: " + myHeader;
		
	}
	
}
