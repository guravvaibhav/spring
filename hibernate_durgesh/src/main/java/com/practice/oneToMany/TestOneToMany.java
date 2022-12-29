package com.practice.oneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.util.Hib_util;

public class TestOneToMany {
	public static void main(String[] args) {
		List<Girlfriend> girlfriends = new ArrayList();
		Boy boy = new Boy(101, "pranav", 27, girlfriends);

		Girlfriend g1 = new Girlfriend(1, 26, "Sakshi", boy);
		Girlfriend g2 = new Girlfriend(2, 25, "Gitanjali", boy);
		Girlfriend g3 = new Girlfriend(3, 27, "Shrddha", boy);

		girlfriends.add(g1);
		girlfriends.add(g2);
		girlfriends.add(g3);

		boy.setGirlfriends(girlfriends);

		try (SessionFactory factory = Hib_util.getFactory(); Session session = factory.openSession()) {

			Transaction tr = session.beginTransaction();

			session.save(boy);
			session.save(g1);
			session.save(g2);
			session.save(g3);

			tr.commit();
		}
		System.out.println("project completed..!!!");

	}

}
