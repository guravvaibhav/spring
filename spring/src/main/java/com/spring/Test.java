package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	
	ApplicationContext cxt=new ClassPathXmlApplicationContext("StudentCfg.xml");
	Student student = cxt.getBean("std1",Student.class);
	System.out.println(student);
}
}
