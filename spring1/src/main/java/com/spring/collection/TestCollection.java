package com.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("student.xml");
	Student bean = ctx.getBean("std1",Student.class);
	System.out.println(bean);
}
}
