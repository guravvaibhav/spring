package com.prowings.hibernate.inheritance.Table_class;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	Person p=new Person();
    	p.setAge(89);
    	p.setGender("other");
    	p.setName("aaa");
    
    	
    	Student s=new Student();
    	s.setAge(3);
    	s.setGender("m");
    	s.setMarks(99);
    	s.setName("shree");
    	s.setRoll(10);

    	
    	Employee e =new Employee();
    	e.setAge(12);
    	e.setGender("M");
    	e.setName("Ram");
    	e.setSal(100);
    	e.setDept("Dev");
    	
    	SessionFactory f=new Configuration().configure().buildSessionFactory();
    	Session session=f.openSession();
    	
    	Transaction t=session.beginTransaction();
    	
    	session.save(p);
    	session.save(s);
    	session.save(e);
    	
    	
    	
    	t.commit();
    	session.close();
    	f.close();
    
    }
}
