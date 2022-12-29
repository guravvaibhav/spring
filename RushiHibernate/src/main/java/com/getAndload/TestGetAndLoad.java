package com.getAndload;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rushiannotations.Student;

public class TestGetAndLoad {

	public static void main(String[] args) {
		System.out.println("Project started...!!");
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		com.getAndload.Student std1=new com.getAndload.Student(60, "Model", "pune");
		Transaction t1=session.beginTransaction();
		
//		int i1=(Integer)session.save(std1); 	// returns serialisabl
//		session.persist(std1);					// returns void
		t1.commit();
		com.getAndload.Student s1=(com.getAndload.Student)session.get(com.getAndload.Student.class, "Rt");
//		com.getAndload.Student s1=(com.getAndload.Student)session.load(com.getAndload.Student.class, "Rohit");
	
//		get returns null if object not found
//		get throws ObjectNotFoundException if object not found
		
//		
		System.out.println(s1);
		session.close();
		System.out.println("Project Ended...!!!");
		
	}

}
