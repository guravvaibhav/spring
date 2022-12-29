package hibernate1com.prowings.demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("project statrted..!!!");
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println(factory);
		
		Employee e1 = new Employee();
		e1.setEmpName("Mahesh");
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(e1);
		
		tx.commit();
		session.close();
		factory.close();
//		
		System.out.println("Done.....!!!!");
	}
}
