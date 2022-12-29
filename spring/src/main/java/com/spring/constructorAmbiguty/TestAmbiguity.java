package com.spring.constructorAmbiguty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAmbiguity {

	public static void main(String[] args) {
		ApplicationContext cxt=new ClassPathXmlApplicationContext("AmbiguityCfg2.xml");
		AmbugityDemo bean = cxt.getBean("obj",AmbugityDemo.class);
		System.out.println(bean);

	}

}
