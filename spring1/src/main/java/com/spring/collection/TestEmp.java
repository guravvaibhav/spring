package com.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {
	public static void main(String[] args) {
		ApplicationContext ct=new ClassPathXmlApplicationContext("EmployeeProp.xml");
		Employee bean = ct.getBean("emp1",Employee.class);
		System.out.println(bean);
	}

}
