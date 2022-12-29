package hibernate_withsingleton.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hib_util {
	private static SessionFactory factory=null;
	
	private Hib_util() {
		super();
	}

	public static SessionFactory getFactory() {
		if(factory==null) {
			 factory=new Configuration().configure().buildSessionFactory();
		}
		return factory;
	}

}
