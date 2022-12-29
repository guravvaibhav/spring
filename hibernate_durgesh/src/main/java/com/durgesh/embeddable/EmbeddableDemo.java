package com.durgesh.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.util.Hib_util;

public class EmbeddableDemo {
	public static void main(String[] args) {
		System.out.println("project started..!!");
		Address1 adr=new Address1( 416202, "kop");
		Student1 s1=new Student1(101, "vaibhav", adr);
		try (SessionFactory factory = Hib_util.getFactory(); Session session = factory.openSession()) {
			Transaction tr=session.beginTransaction();
			
			session.save(s1);
			
			tr.commit();
			System.out.println("project ended..!!");
		}
	}
}
