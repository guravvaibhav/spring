package com.prowings;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext cxt=new ClassPathXmlApplicationContext("context.xml");
		
		Student s1=(Student) cxt.getBean("std1");
		
		System.out.println(s1);
		
		
	}

}
