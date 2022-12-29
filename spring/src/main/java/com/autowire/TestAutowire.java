package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestAutowire {

	public static void main(String[] args) {
		
		ApplicationContext cxt = new ClassPathXmlApplicationContext("autowire.xml");
		com.autowire.Employee bean = cxt.getBean("emp", Employee.class);
		System.out.println(bean);
	
	}

}
