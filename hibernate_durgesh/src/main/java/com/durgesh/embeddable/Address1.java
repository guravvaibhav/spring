package com.durgesh.embeddable;

import javax.persistence.Embeddable;
@Embeddable
public class Address1 {
	private int pin;
	private String city;
	public Address1() {
		super();
	}
	public Address1(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
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
	
	
	
}
