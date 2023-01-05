package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value = "p")
@Lazy(value = true)
public class Person {
	@Value("ram")
	String name;
	@Value("26")
	int age;
	@Autowired
	Address adr;
	public Person() {
		super();
		System.out.println("no arg of person");
	}
	public Person(String name, int age, Address adr) {
		super();
		this.name = name;
		this.age = age;
		this.adr = adr;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", adr=" + adr + "]";
	}
	
	

}
