package com.onetomany;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOneToMany {

	public static void main(String[] args) {
		System.out.println("Project Started...");

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		List<Address> l = new ArrayList();
		Student std = new Student(10, "Rushi", l);

		Address ad1 = new Address(1234, "Kop", std);
		Address ad2 = new Address(4321, "Pune", std);

		l.add(ad1);
		l.add(ad2);

		Transaction t = session.beginTransaction();
		session.save(std);
		session.save(ad1);
		session.save(ad2);

		t.commit();
		session.close();
		factory.close();

		System.out.println("Project Ended...");

	}

}
