package com.spring;

import java.util.Properties;

public class Employee {
	int empid;
	String empname;
	Properties prop;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empname, Properties prop) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.prop = prop;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", prop=" + prop + "]";
	}
	
	
	

}
