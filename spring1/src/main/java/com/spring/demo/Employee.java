package com.spring.demo;

public class Employee {
	private int empId;
	private String name;
	private Address add;
	public Employee() {
		super();
	}
	public Employee(int empId, String name, Address add) {
		super();
		this.empId = empId;
		this.name = name;
		this.add = add;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", add=" + add + "]";
	}
	
	
}
