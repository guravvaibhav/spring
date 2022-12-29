package com.durgesh.hql;

import java.util.Arrays;
import java.util.List;

//import org.hibernate.Query;	// deprigated from 5.2 version
import org.hibernate.query.*;	// recommended to use this
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.annotations.NamedQueries;

import com.hibernate.util.Hib_util;

import hibernate1com.prowings.demo1.Student;

public class HqlDemo1 {
	public static void main(String[] args) {
		try(SessionFactory factory=Hib_util.getFactory();Session session=factory.openSession();){
			Transaction tr =session.beginTransaction();
			
	// select/fetch query :-
			
//			String query="from Student";							// select *
//			String query="from Student where id=101";				// using where clause
//			String query="from Student where id=:x";				// using : as prepare statement(need to set x parameter)
//			String query="from Student where id=:x and city=:y";	// using as and
			String query="from Student where id=:x or city=:y"; 	// using as or
			
			Query q=session.createQuery(query);						// hibernate.Query
			q.setParameter("x",102);								// setting parameter value
			q.setParameter("y","kop");
			
			List<Student> l=q.list();
			for(Student s:l) {
				System.out.println(s.getId()+","+s.getName()+","+s.getCity());
			}
				
		
			
	// delete query :-
			
//			Query del_query=session.createQuery("delete from Student where city=:z");
//			del_query.setParameter("z", "mumbai");
			
//			int row_affected=del_query.executeUpdate();				  // to delete/update the data-->executeUpdate()
//			System.out.println("row affected : "+row_affected);
			
	// update query :-
			
//			Query upd_query=session.createQuery("update Student set city=:m where name=:n");
//			upd_query.setParameter("m", "london");
//			upd_query.setParameter("n", "model");
//			
//			int row_affected=upd_query.executeUpdate();
//			System.out.println(row_affected);
			
	// join query :-
			
			Query join_query=session.createQuery("select q.q_id,q.question,a.Answer from Question1 as q inner join q.Answers as a");
			List<Object []> res= join_query.getResultList();
			for(Object [] arr:res) {
				System.out.println(Arrays.toString(arr));
			}
			tr.commit();
			
			
		}
		System.out.println("Done...!!!");
		
	}

}
