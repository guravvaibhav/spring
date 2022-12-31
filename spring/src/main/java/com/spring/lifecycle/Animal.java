package com.spring.lifecycle;

public class Animal {
	int id;
	
	public void init() {
		System.out.println("init method");
	}

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + "]";
	}

	public void destroy() {
		System.out.println("destroy method");
	}
	

}
