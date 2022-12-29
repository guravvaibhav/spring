package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {
	public static void main(String[] args) {
		
	ApplicationContext c=new ClassPathXmlApplicationContext("PersonCfg.xml"); 
	Person p=c.getBean("person",Person.class);
	System.out.println(p);
	}
	

}
