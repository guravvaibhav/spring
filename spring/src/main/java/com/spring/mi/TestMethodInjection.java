package com.spring.mi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMethodInjection {

	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("methodinjection.xml");
		Student s1 = cxt.getBean("std", Student.class);
		Student s2 = cxt.getBean("std", Student.class);

		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s1 == s2);
		System.out.println(s1.getAddress() == s2.getAddress());
		System.out.println(s1.createAddress() == s2.createAddress());

	}

}
