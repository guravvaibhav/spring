package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {

		
		ApplicationContext cxt=new ClassPathXmlApplicationContext("employee.xml");
		Employee bean = cxt.getBean("emp1",Employee.class);
		System.out.println(bean);
	}

}
