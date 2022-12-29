package com.durgesh.many_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class EmployeeP {
	@Id
	private int emp_id;
	private String emp_name;
	@ManyToMany(mappedBy = "employees")
	private List<Project> projects;
	public EmployeeP() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeP(int emp_id, String emp_name, List<Project> projects) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.projects = projects;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "EmployeeP [emp_id=" + emp_id + ", emp_name=" + emp_name + ", projects=" + projects + "]";
	}
	
	
}
