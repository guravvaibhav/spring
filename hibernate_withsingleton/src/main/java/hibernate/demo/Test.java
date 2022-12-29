package hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import hibernate_withsingleton.util.Hib_util;

public class Test {
	public static void main(String[] args) {
		System.out.println("Project started..!!!");
		Student s1=new Student();
		s1.setName("vaibhav");
		Student s2=new Student();
		s1.setName("rushida");

		try(SessionFactory factory=Hib_util.getFactory();Session session=factory.openSession()){
			Transaction tr=session.beginTransaction();
			session.save(s1);
			session.save(s2);
			tr.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Project ended..!!!");
	}

}
