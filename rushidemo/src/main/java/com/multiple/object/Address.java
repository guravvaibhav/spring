package com.multiple.object;

import java.io.Serializable;

public class Address implements Serializable{
	int pin;
	String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
	

}
