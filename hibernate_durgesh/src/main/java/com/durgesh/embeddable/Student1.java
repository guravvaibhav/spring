package com.durgesh.embeddable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student1 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int std_id;
	private int rollNo;
	private String name;
	private Address1 adddress;
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student1(int rollNo, String name, Address1 adddress) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.adddress = adddress;
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
	public Address1 getAdddress() {
		return adddress;
	}
	public void setAdddress(Address1 adddress) {
		this.adddress = adddress;
	}
	
	

}
