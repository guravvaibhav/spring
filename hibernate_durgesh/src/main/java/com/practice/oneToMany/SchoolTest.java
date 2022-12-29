package com.practice.oneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.util.Hib_util;

public class SchoolTest {
	public static void main(String[] args) {
		List<StudentS> l1=new ArrayList<>();
		School school1=new School("new English School", "kolhapur", l1);
		
		StudentS s1=new StudentS(101, "vaibhav", school1);
		StudentS s2=new StudentS(102, "Rushikesh", school1);
		StudentS s3=new StudentS(103, "Model", school1);
		
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		
		school1.setStudents(l1);
		List<StudentS> l2=new ArrayList<>();

		School school2=new School("sgi", "pune", l2);
		StudentS s4=new StudentS(104, "onkar", school2);
		StudentS s5=new StudentS(105, "shubham", school2);
		StudentS s6=new StudentS(106, "shree", school2);
		
		l2.add(s4);
		l2.add(s5);
		l2.add(s6);
		
		school2.setStudents(l2);
		
		try(SessionFactory factory=Hib_util.getFactory();Session session=factory.openSession()){
			Transaction tr= session.beginTransaction();
			
//			session.save(school1);
//			session.save(s1);
//			session.save(s2);
//			session.save(s3);
			
			tr.commit();
			
			Transaction tr1= session.beginTransaction();
//			session.save(school2);
//			session.save(s4);
//			session.save(s5);
//			session.save(s6);
			
			System.out.println("inside transcation");
			tr1.commit();
			School w=(School)session.get(School.class, 1);
			
			for(StudentS s:w.getStudents()) {
				System.out.println(s.getRollNo()+","+s.getName());
			}
			
			//System.out.println(w.getCity()+","+w.getS);
		}
		System.out.println("project ended..");
		
	}

}
