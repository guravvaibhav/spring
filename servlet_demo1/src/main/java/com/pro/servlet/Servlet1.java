package com.pro.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String bookNm=req.getParameter("Book_Name");
		String AuthNm=req.getParameter("Auther_Name");
		String bPrice=req.getParameter("Book_Price");
		resp.setContentType("text/html");
		
		BookSell s=new BookSell(bookNm, AuthNm, bPrice);
		Text.saveData(s);
		PrintWriter out = resp.getWriter();
		
        out.print("<html><body>");
        out.print("<h3>Details Entered</h3><br/>");
          
        out.print("Book Name: "+ bookNm + "<br/>");
        out.print("Auther Name: "+ AuthNm +"<br/>");
        out.print("Book Price: "+ bPrice +"<br/>");
        out.print("</body></html>");
	}
}
