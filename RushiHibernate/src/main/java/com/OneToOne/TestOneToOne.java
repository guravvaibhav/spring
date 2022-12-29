package com.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOneToOne {

	public static void main(String[] args) {

		System.out.println("Project started...!!");
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
		Voter v1=new Voter(2, "kop");
		Person p1=new Person(25, "Rushi", v1);
		
		Transaction t1=session.beginTransaction();
		
		int i1=(Integer)session.save(v1); 
		int i2=(Integer)session.save(p1); 
		t1.commit();
	
		Voter v=(Voter)session.get(Voter.class, i1);
		Person p=(Person)session.get(Person.class, i2);
		
		System.out.println(v);
		System.out.println(p);
		
		session.close();
		System.out.println("Project Ended...!!!");
	}

}
