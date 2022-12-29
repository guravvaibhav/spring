package hibernate1com.prowings.demo1;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		Student s=new Student(101, "vaibhav", "kop");
		Student s1=new Student(102, "model", "pune");
		Student s2=new Student(103, "shree", "mumbai");
		Student s3=new Student(104, "a", "kop");
		Student s4=new Student(105, "b", "pune");
		Student s5=new Student(106, "c", "mumbai");
		Student s6=new Student(107, "d", "kop");
		Student s7=new Student(108, "e", "pune");
		Student s8=new Student(109, "f", "mumbai");
		Student s9=new Student(110, "g", "kop");
		Student s10=new Student(111, "h", "pune");
		Student s11=new Student(112, "i", "mumbai");
		Student s12=new Student(113, "j", "kop");
		Student s13=new Student(114, "k", "pune");
		Student s14=new Student(115, "l", "mumbai");
		Student s15=new Student(116, "m", "kop");
		Student s16=new Student(117, "n", "pune");
		Student s17=new Student(118, "o", "mumbai");
		Student s18=new Student(119, "p", "kop");
//		Address add=new Address();
//		add.setStreet("Street1");
//		add.setCity("kop");
//		add.setOpen(true);
//		add.setAddedDate(new Date());
//		add.setX(963.43);					// transient state --> object created and value set then
		session.save(s);			// persistant state--> when we call save method then
		session.save(s1);			
		session.save(s2);
		session.save(s3);			
		session.save(s4);			
		session.save(s5);
		session.save(s6);
		session.save(s7);			
		session.save(s8);			
		session.save(s9);
		session.save(s9);			
		session.save(s10);			
		session.save(s11);
		session.save(s12);
		session.save(s13);			
		session.save(s14);			
		session.save(s15);
		session.save(s16);			
		session.save(s17);			
		session.save(s18);
		
		
		
		
		tr.commit();
		session.close();					// detached state--> when we call session.close/session.clear method
		factory.close();
		System.out.println("done..!!!");
	}
}
