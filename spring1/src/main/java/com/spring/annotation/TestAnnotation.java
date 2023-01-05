package com.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {	public static void main(String[] args) {
	ApplicationContext ct=new ClassPathXmlApplicationContext("AnnotationCfg.xml");
	Person person = ct.getBean("p",Person.class);
	System.out.println(person);
	Person person2 = getPerson();
	System.out.println("person by factory : "+person2);
}
@Bean
public static Person getPerson() {
	return new Person("sham",20,new Address(2323,"pune"));
}

}
