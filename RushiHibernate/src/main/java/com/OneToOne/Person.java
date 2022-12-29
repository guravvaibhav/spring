package com.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
    @Id
	private int age;
	private String name;
	@OneToOne
	private Voter voter;
	public Person() {
		super();
	}
	public Person(int age, String name, Voter voter) {
		super();
		this.age = age;
		this.name = name;
		this.voter = voter;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Voter getVoter() {
		return voter;
	}
	public void setVoter(Voter voter) {
		this.voter = voter;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", voter=" + voter + "]";
	}
}
