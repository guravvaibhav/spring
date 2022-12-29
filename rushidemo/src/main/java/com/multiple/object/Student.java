package com.multiple.object;

import java.io.Serializable;

public class Student implements Serializable{

	int roll;
	String name;
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
