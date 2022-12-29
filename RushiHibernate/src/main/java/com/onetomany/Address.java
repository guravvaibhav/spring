package com.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int srno;
	private int pin;
	private String city;
	@ManyToOne()
	private Student student;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int pin, String city, Student student) {
		super();
		this.pin = pin;
		this.city = city;
		this.student = student;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student getStd() {
		return student;
	}
	public void setStd(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + ", std=" + student + "]";
	}
	
	

}
