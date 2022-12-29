package com.clone.shallow;

public class TestEmp {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Dept d=new Dept(10,"Dev");
		Employee e1=new Employee(1,"AA",d);
		Employee e2=(Employee)e1.clone();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1==e2);
		System.out.println(e1.getDept()==e2.getDept());

	}

}
