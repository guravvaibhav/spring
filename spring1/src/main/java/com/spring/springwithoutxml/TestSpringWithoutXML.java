package com.spring.springwithoutxml;

import java.util.Properties;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringWithoutXML {

	public static void main(String[] args) {

		ConfigurableApplicationContext cxt = new AnnotationConfigApplicationContext(StudentConfig.class);

		Student bean1 = cxt.getBean(Student.class);
//		Student bean2 = cxt.getBean(Student.class);
//		System.out.println(bean1 == bean2);
		System.out.println(bean1);
//		System.out.println(bean2);
//		System.out.println(bean1.getAddress() == bean2.getAddress());
		
//		DatabaseProp d=cxt.getBean(DatabaseProp.class);
		Properties p=cxt.getBean("prop",Properties.class);
		
		System.out.println(p);
		cxt.registerShutdownHook();
	}
}
