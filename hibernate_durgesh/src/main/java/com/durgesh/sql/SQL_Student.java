package com.durgesh.sql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;

import com.hibernate.util.Hib_util;

import hibernate1com.prowings.demo1.Student;

public class SQL_Student {
	public static void main(String[] args) {
		try(SessionFactory factory=Hib_util.getFactory();Session session=factory.openSession();){
			NativeQuery query = session.createSQLQuery("select * from student");
			
//			***************<<<<<< IMP >>>>>>**************
			
			List<Object[]>l= query.getResultList();		// IMP
			for(Object[] student:l) {
				System.out.println(student[2]+" : "+student[1]);
			}
		}
		
	}

}
