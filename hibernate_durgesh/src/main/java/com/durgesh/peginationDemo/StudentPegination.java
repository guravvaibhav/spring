package com.durgesh.peginationDemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hibernate.util.Hib_util;

import hibernate1com.prowings.demo1.Student;

public class StudentPegination {
	public static void main(String[] args) {
		try(SessionFactory factory=Hib_util.getFactory();
				Session session=factory.openSession()){
			Query query=session.createQuery("from Student");
			query.setFirstResult(5);	//starting index
			query.setMaxResults(5);		//limit/ no of elements
			
			List<Student> l=query.getResultList();
			for(Student s:l) {
				System.out.println(s.getId()+" : "+s.getName()+" : "+s.getCity());
			}
			
		}
	}

}
