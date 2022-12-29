package com.CopyConstructor;

public class Address implements Cloneable{
	
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
	public Address(Address a) {
		super();
		this.pin = a.pin;
		this.city =a. city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
	
}
