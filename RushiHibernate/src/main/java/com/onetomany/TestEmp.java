package com.onetomany;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestEmp {

	public static void main(String[] args) {
		
		System.out.println("Project Started");
		List<Projects> l=new ArrayList();
		Emp e1 =new Emp(10,"Rushi",100,l);
		Projects p1=new Projects(1, "Bank", 1000,e1);
		Projects p2=new Projects(2, "Telecom", 2000,e1);
		Projects p3=new Projects(3, "Travel", 3000,e1);
		l.add(p1);
		l.add(p2);
		l.add(p3);
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(e1);
		
		transaction.commit();
		session.close();
		factory.close();
		System.out.println("Project ended");
		
		
	}

}
