package com.CopyConstructor;

public class Student {
	int roll;
	String name;
	Address add;

	public Student(int roll, String name, Address add) {
		super();
		this.roll = roll;
		this.name = name;
		this.add = add;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name) {
		super();
		roll = roll;
		name = name;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

//	public Student(Student s) {
//		super();
//		roll = s.roll;
//		name = s.name;
//		Address ad=new Address(s.getAdd().getPin(),s.getAdd().getCity());
//		add = ad;
//	}
//	public Student(Student s) throws CloneNotSupportedException {
//		super();
//		roll = s.roll;
//		name = s.name;
//		Address ad=(Address)s.getAdd().clone();
//		
//		add = ad;
//	}
	public Student(Student s) {
		super();
		roll = s.roll;
		name = s.name;
		Address ad = new Address(s.add);
		add = ad;
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

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", add=" + add + "]";
	}

}
