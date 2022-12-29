package com.embaddle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestEmbeddle {

	public static void main(String[] args) {
		
		System.out.println("Project Started...!!!");
		
		Dept dept=new Dept(101, "Dev", "Banking", 1000);
		Employee e1=new Employee(10, "Rushi", "kop", dept);
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction t1=session.beginTransaction();
		session.save(e1);
		t1.commit();
		System.out.println(e1);
		System.out.println("Project Ended...!!!");
	}

}
