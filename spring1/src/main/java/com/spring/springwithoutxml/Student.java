package com.spring.springwithoutxml;

import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
@PropertySource("classpath:Student.properties")
public abstract class Student {

	@Value("101")
	private int roll;
	@Value("Rushi")
	private String name;
	@Autowired
	@Qualifier("add1")
	private Address address;
	
	

	public Student() {
		super();
	}

	public Student(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
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

	public Address getAddress() {
		return createAddress();
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}


	@PostConstruct
	public void init() {
		System.out.println("Inside Init Method");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Inside Destroy Method");
	}

	@Lookup
	protected abstract Address createAddress();
}
