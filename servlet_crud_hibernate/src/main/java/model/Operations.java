package model;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import servletWeb.hibernatecfg.Hib_util;

public class Operations {

	// to add an student data in DB
	public static void create(Student s) {
		SessionFactory f = Hib_util.getFactory();
		Session session = f.openSession();
		Transaction tr = session.beginTransaction();
		session.save(s);
		tr.commit();
		session.close();

	}

	// to read an student data from DB
	public static void read(int roll, HttpServletResponse resp, HttpServletRequest req) throws IOException {
		SessionFactory f = Hib_util.getFactory();
		Session session = f.openSession();
		Student s = (Student) session.get(Student.class, roll);
		session.close();
		PrintWriter out = resp.getWriter();
		if (s != null) {
			out.print("<html><body>");
			out.print("<h3>Details are : </h3><br/>");

			out.print("Student roll : " + s.getRoll_no() + "<br/>");
			out.print("Student name : " + s.getName() + "<br/>");
			out.print("Student city : " + s.getCity() + "<br/>");
			out.print("Student marks : " + s.getMarks() + "<br/>");
		}
		out.print("<html><body>");
		out.print("<h3> Student not available for roll no : " + roll + "</h3><br/>");

	}

	// to update an student city from DB
	public static void update(int roll, String city, HttpServletResponse resp, HttpServletRequest req)
			throws IOException {
		SessionFactory f = Hib_util.getFactory();
		Session session = f.openSession();
		Student s = (Student) session.get(Student.class, roll);
		PrintWriter out = resp.getWriter();
		if (s != null) {

			s.setCity(city);

			Transaction tr = session.beginTransaction();
			session.saveOrUpdate(s);
			tr.commit();
			session.close();

			out.print("<html><body>");
			out.print("<h3>updated Details are : </h3><br/>");

			out.print("Student roll : " + s.getRoll_no() + "<br/>");
			out.print("Student name : " + s.getName() + "<br/>");
			out.print("Student city : " + s.getCity() + "<br/>");
			out.print("Student marks : " + s.getMarks() + "<br/>");

		}
		out.print("<html><body>");
		out.print("<h3> Student not available for roll no : " + roll + "</h3><br/>");

	}

	// to delete an student data from DB
	public static void delete(int roll, HttpServletResponse resp, HttpServletRequest req) throws IOException {
		PrintWriter out = resp.getWriter();
		SessionFactory f = Hib_util.getFactory();
		Session session = f.openSession();
		Student s = (Student) session.get(Student.class, roll);
		if (s != null) {
		Transaction tr = session.beginTransaction();
		session.delete(s);
		resp.setContentType("text/html");
		out.print("<html><body>");
		out.print("<h3>Details Entered</h3><br/>");

		out.print("Student roll : " + req.getParameter("roll") + "deleted successfully" + "<br/>");

		tr.commit();
		session.close();
		}
		out.print("<html><body>");
		out.print("<h3> Student not available for roll no : " + roll + "</h3><br/>");

	}

}
