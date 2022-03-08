package com.firstspringboot.FirstProject;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstProjectcontroller {
	
@GetMapping("/department") 
public DepartmentDetails deptDetails(@RequestParam(value="dept_id") int dept_id,@RequestParam(value="dept_name") String dept_name)
{ 
	DepartmentDetails deptDetails=new DepartmentDetails();
	deptDetails.setDept_id(dept_id);
	deptDetails.setDept_name(dept_name);
	return deptDetails;
	 }
	

}
