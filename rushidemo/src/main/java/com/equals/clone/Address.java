package com.equals.clone;

public class Address implements Cloneable
{

	int pin ;
	String city;
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
	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}
	public Address() {
		super();
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
	
}
