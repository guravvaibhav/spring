package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifecycleDemo {
	public static void main(String[] args) {
		ConfigurableApplicationContext ct=new ClassPathXmlApplicationContext("AnimalCfg.xml");
		Animal a=ct.getBean("animal",Animal.class);
		System.out.println(a);
		ct.registerShutdownHook();
		
	}

}
