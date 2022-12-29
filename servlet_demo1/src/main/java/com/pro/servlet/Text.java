package com.pro.servlet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Text {
	public static void saveData(BookSell b) {
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session session =factory.openSession();
	Transaction tr=session.beginTransaction();
	session.save(b);
	tr.commit();
	session.close();
	factory.close();
		
	
	System.out.println("done...!!!!");
	}

}

