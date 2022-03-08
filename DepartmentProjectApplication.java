package com.DepProject.DepartmentProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DepartmentProjectApplication  implements CommandLineRunner{

	@Autowired
	private DepartmentRepo deprepo;
	public static void main(String[] args) {
		SpringApplication.run(DepartmentProjectApplication.class, args);
	}
	
@Override
	public void run(String... args) throws Exception {
		
		  List<DepartmentDetails> dept_det=deprepo.findAll(); 
		  for(DepartmentDetails dept:dept_det) 
			  System.out.println(dept);
		
	}


}
