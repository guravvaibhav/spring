package com.rushiannotations;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity
@Table(name="Student_info")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int srno;
	@Column(name="Roll")
	private int roll;
	@Column(name="Name",length = 30)
	private String name;
	@Transient
	private double marks;
	@Column(name="Eligible")
	private boolean isFirstClass;
	@Column(name="City")
	private String city;
	@Temporal(TemporalType.DATE)
	private Date DOB;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, double marks, boolean isFirstClass, String city, Date dOB) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.isFirstClass = isFirstClass;
		this.city = city;
		DOB = dOB;
	}
	public int getSrno() {
		return srno;
	}
	public void setSrno(int srno) {
		this.srno = srno;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public boolean isFirstClass() {
		return isFirstClass;
	}
	public void setFirstClass(boolean isFirstClass) {
		this.isFirstClass = isFirstClass;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	@Override
	public String toString() {
		return "Student [srno=" + srno + ", roll=" + roll + ", name=" + name + ", marks=" + marks + ", isFirstClass="
				+ isFirstClass + ", city=" + city + ", DOB=" + DOB + "]";
	}
	
	

}
