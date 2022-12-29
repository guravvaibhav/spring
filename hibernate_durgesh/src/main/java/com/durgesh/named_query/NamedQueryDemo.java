package com.durgesh.named_query;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.durgesh.many_to_many.Project;
import com.hibernate.util.Hib_util;

public class NamedQueryDemo {
	public static void main(String[] args) {
		try(SessionFactory factory=Hib_util.getFactory();Session session=factory.openSession();){
			Query query = session.getNamedQuery("xyz");
			query.setParameter("x", 101);
			List<Object[]> list = query.list();
		for(Object p:list) {
			Project p1=(Project) p;
			System.out.println(p1.getProject_nm());
		}
	}

	}}
