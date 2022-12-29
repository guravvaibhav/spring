package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		Employee e=context.getBean("emp1",Employee.class);
		Employee e1=context.getBean("emp1",Employee.class);
		System.out.println(e.getAdd());
		System.out.println(e1.getAdd());
		e.getAdd().setCity("pune");
		System.out.println(e==e1);
		System.out.println(e.getAdd());
		System.out.println(e1.getAdd());
	}

}
