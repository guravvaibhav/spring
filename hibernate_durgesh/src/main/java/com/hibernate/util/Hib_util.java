package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hib_util {
	public static SessionFactory factory=null;
	public static SessionFactory getFactory() {
		if(factory ==null) {
			factory=new Configuration().configure().buildSessionFactory();
		}
		return factory;
	}

}
