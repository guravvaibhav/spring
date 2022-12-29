package com.immutable;

public final class Student {
	private final int roll;
	private final String name;
	private final Address add;
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public Address getAdd() {
		Address ad=new Address(add.getPin(),add.getCity());
		return ad;
	}
	public Student(int roll, String name, Address add) {
		super();
		this.roll = roll;
		this.name = name;
		Address ad=new Address(add.getPin(),add.getCity());
		this.add = ad;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", add=" + add + "]";
	}
		
	
}
