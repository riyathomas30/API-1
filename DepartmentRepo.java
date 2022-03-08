package com.DepProject.DepartmentProject;

import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepo  extends JpaRepository<DepartmentDetails,Integer > {
	

}
