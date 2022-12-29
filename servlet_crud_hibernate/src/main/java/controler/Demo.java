package controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Operations;
import model.Student;

public class Demo extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int roll=Integer.parseInt(req.getParameter("roll"));
		String city=req.getParameter("city");
		
		
		String action = req.getServletPath();
	
            switch (action) {
                case "/delete":
                   Operations.delete(roll,resp,req);
                    break;
                case "/put":
                   Operations.update(roll, city,resp,req);
                    break;
                case "/get":
                	Operations.read(roll,resp,req);
                	break;
               
            }
       
	}
	
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Student s=new Student();
		s.setRoll_no(Integer.parseInt(req.getParameter("roll")));
		s.setName(req.getParameter("name"));
		s.setCity(req.getParameter("city"));
		s.setMarks(Long.parseLong(req.getParameter("marks")));
		Operations.create(s);
		
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("<html><body>");
		out.print("<h3>Details Entered</h3><br/>");
		
		out.print("Student roll : "+req.getParameter("roll")+"<br/>");
		out.print("Student name : "+req.getParameter("name")+"<br/>");
		out.print("Student city : "+req.getParameter("city")+"<br/>");
		out.print("Student marks : "+req.getParameter("marks")+"<br/>");
		out.print("<h3>Details Entered</h3><br/>");
	}

	

}
