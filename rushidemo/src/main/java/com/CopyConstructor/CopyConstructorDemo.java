package com.CopyConstructor;

public class CopyConstructorDemo {
	public static void main(String[] args)  {

		Address ad = new Address(1234, "kop");
		Student s1 = new Student(1, "Rushi", ad);

		Student s2 = new Student(s1);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		System.out.println(s1.add == s2.add);

	}

}
