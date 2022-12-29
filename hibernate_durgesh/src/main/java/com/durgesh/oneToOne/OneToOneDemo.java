package com.durgesh.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.util.Hib_util;

public class OneToOneDemo {
	public static void main(String[] args) {
		System.out.println("project started..!!");
		Answer answer1 = new Answer(105, "java development toolkit");
		Question question1 = new Question(5, "what is jdk ?", answer1);
		answer1.setQuestion(question1);

		try (SessionFactory factory = Hib_util.getFactory(); Session session = factory.openSession();) {
			Transaction tr = session.beginTransaction();

//			session.save(answer1);
//			session.save(question1);

			tr.commit();

//			Question q = (Question)session.get(Question.class, 5);
			Answer a=(Answer)session.get(Answer.class, 105);
//			System.out.println(q.getQuestion());
//			System.out.println(q.getAnswer().getAnswer());
			System.out.println(a.getAnswer());
			System.out.println(a.getQuestion().getQuestion());
			
			System.out.println("project ended..!!");
		}
	}

}
