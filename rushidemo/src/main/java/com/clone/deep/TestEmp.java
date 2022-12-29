package com.clone.deep;

public class TestEmp {

	public static void main(String[] args) throws CloneNotSupportedException {

		Dept d=new Dept(10,"Dev");
		Employee e1=new Employee(1,"AA",d);
		Employee e2=(Employee)e1.clone();
		System.out.println("Before => "+e1);
		System.out.println("Before => "+e2);
		e1.getDept().setDeptName("Test");
		System.out.println("After => "+e1);
		System.out.println("After => "+e2);
		
	}

}
