package com.firstspringboot.FirstProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class FirstProjectApplication implements CommandLineRunner {
@Autowired
private Department_repo deprepo;
	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * List<DepartmentDetails> dept_det=deprepo.findAll(); for(DepartmentDetails
		 * dept:dept_det) System.out.println(dept);
		 */
		
	}

	

}
