package com.onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Emp {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sr;
	
	private int empid;
	private String name;
	private int salary;
	@OneToMany
	private List <Projects> projects;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Emp(int empid, String name, int salary, List<Projects> projects) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.projects = projects;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [sr=" + sr + ", empid=" + empid + ", name=" + name + ", salary=" + salary + ", projects=" + projects
				+ "]";
	}
	
}
