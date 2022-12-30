package com.methodInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMethodInjection {

	public static void main(String[] args) {
		ApplicationContext c=getContext();
		Showroom s1 = c.getBean("showroom",Showroom.class);
		Showroom s2 = c.getBean("showroom",Showroom.class);
		System.out.println(s1==s2);
		System.out.println(s1.getCar()== s2.getCar());
		
		System.out.println(s1);
		System.out.println(s2);
		
		
	}
	public static ApplicationContext getContext() {
		return new ClassPathXmlApplicationContext("Showroom.xml");
	}
}
