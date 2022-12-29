package com.practice.oneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class StudentS {
	@Id
	private int rollNo;
	private String name;
	@ManyToOne
	private School school;

	public StudentS() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentS(int rollNo, String name, School school) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.school = school;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "StudentS [rollNo=" + rollNo + ", name=" + name + ", school=" + school + "]";
	}

}
