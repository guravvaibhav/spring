package hibernate.inheritance.TABLE_PER_CLASS;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test_TABLE_PER_CLASS {
	public static void main(String[] args) {
		Person p=new Person();
		Student std=new Student();
		std.setRoll(11);
		Teacher tcr=new Teacher();
		tcr.setSal(10000);
		SessionFactory f=new Configuration().configure().buildSessionFactory();
		Session s=f.openSession();
		Transaction t=s.beginTransaction();
		s.save(p);
		s.save(std);
		s.save(tcr);
		
		t.commit();
		s.close();
		f.close();
	}

}
