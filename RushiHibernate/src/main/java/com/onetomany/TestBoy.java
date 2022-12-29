package com.onetomany;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestBoy {

	public static void main(String[] args) {
		System.out.println("Project Started");

		List<Girls> l = new ArrayList();
		Boy b1 = new Boy(26, "ABC", "KOP", l);
		Girls g1 = new Girls(25, "X", "Pune", b1);
		Girls g2 = new Girls(24, "Y", "Mumbai", b1);
		Girls g3 = new Girls(24, "Z", "Satara", b1);
		l.add(g1);
		l.add(g2);
		l.add(g3);
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(b1);
		session.save(g1);
		session.save(g2);
		session.save(g3);
		transaction.commit();
		session.close();
		factory.close();
		System.out.println("Project Ended");

	}

}
