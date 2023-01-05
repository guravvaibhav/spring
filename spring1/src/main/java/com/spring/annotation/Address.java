package com.spring.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("416202")
	int pin;
	@Value("kolhapur")
	String city;
	public Address() {
		super();
		System.out.println("no arg of Address");
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
