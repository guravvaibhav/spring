package com.rushiannotations;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestAnnotations {

	public static void main(String[] args) {
		System.out.println("Project started...!!");
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Date d=new Date(1999 , 9 ,29);
		Student s1=new Student(103, "Model", 99.99, true, "kop", new Date());
		session.save(s1);
		
		System.out.println(s1);
		session.close();
		System.out.println("Project Ended...!!!");
	}

}
