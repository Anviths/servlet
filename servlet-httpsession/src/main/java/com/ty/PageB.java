package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(value = "/page-b")
public class PageB extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		String name=(String)session.getAttribute("name");
		int phone=(Integer)session.getAttribute("phone");
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("<html> <body>");
		printWriter.print("<h1> iam page-b </h1>");
		printWriter.print("<h1>user name "+name+"</h1>");
		printWriter.print("<h1>user name "+phone+"</h1>");
		printWriter.print("<body> </html> ");
	}
}
