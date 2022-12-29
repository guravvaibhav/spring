package com.durgesh.oneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.durgesh.embeddable.Student1;
import com.hibernate.util.Hib_util;

public class OneToManyDemo {
	public static void main(String[] args) {
		Question1 question=new Question1(101, "what is java", null);
		
		Answer1 answer1=new Answer1(1, "java software development language", question);
		Answer1 answer2=new Answer1(2, "java is simple language", question);
		Answer1 answer3=new Answer1(3, "using java we can create web applications", question);
		
		List<Answer1> list=new ArrayList<>();
		list.add(answer1);
		list.add(answer2);
		list.add(answer3);
		
		question.setAnswers(list);
		
		
		
		
		try(SessionFactory factory=Hib_util.getFactory();Session session=factory.openSession()) {
			
			Transaction tr=session.beginTransaction();
			session.save(question);
			session.save(answer1);
			session.save(answer2);
			session.save(answer3);
			
//			Question1 q=(Question1)session.get(Question1.class, 101);
//			System.out.println(q);
//			for(Answer1 ans:q.getAnswers()) {
//				
//				System.out.println(ans.getAnswer());
//			}
			tr.commit();
		}
		System.out.println("project completed...!!!");
	}

}
