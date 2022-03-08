package com.firstspringboot.FirstProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department_details") 
public class DepartmentDetails {
	
	  @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int dept_id;
	 private String dept_name;
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	
	public DepartmentDetails(int dept_id, String dept_name) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
	}
	
	public DepartmentDetails() { super(); }
	 /* 
	 * @Override public String toString() { return "DepartmentDetails [dept_id=" +
	 * dept_id + ", dept_name=" + dept_name + "]"; }
	 */
	 
}
