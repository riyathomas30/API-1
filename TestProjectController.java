package com.testproject.TestProject;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestProjectController {

	@GetMapping("/Hello") 
	public String displayHello()
	{ 
		return "Hello";
		
		 }
}
