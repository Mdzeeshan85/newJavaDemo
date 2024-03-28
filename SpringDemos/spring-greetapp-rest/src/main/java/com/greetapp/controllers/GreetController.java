package com.greetapp.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
 
	@GetMapping("/show")
	public String showMessage() {
		return "great day";
	}
	
	//http://localhost:8080/say-hello/pri
	//data comes from url itself
	@GetMapping("/say-hello/{uname}")
	public String sayHello(@PathVariable("uname") String username) {
		return "Hello"+username;
	}
	
	//http://localhost:8080/user-details?name=pri&&city=bnglr
	//data comesfrom the form
	@GetMapping("/user-details")
	public String showUserDetails(@RequestParam("name")String username,@RequestParam("city")String  city) {
		return "welcome "+username+"from "+city;
	}
	
	//localhost:8080/show-coursses
	@GetMapping("/show-courses")
	public List<String> shoeCourses() {
		return Arrays.asList("java","angular","spring");
	}
}
