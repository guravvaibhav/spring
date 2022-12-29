package com.durgesh.first_level_cashe;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.util.Hib_util;

import hibernate1com.prowings.demo1.Student;

public class FirstLevelCasheDemoStudent {
	public static void main(String[] args) {
		
	try(SessionFactory factory=Hib_util.getFactory();Session session=factory.openSession();){
		Student std1 = session.get(Student.class, 101);
		System.out.println(std1);
		Student std2 = session.get(Student.class, 101); // here query will not be hited it will 
		System.out.println(std2);						//return student object stored in session(1st level cashe)
	}
	}

}
