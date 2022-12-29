package com.immutable;

public class TestStudent {

	public static void main(String[] args) {

		Address ad=new Address(1234,"kop");
		Student s1=new Student(10, "Model", ad);
		System.out.println("Before => "+s1);
		s1.getAdd().setCity("Pune");
		System.out.println("After => "+s1);
		
	}

}
