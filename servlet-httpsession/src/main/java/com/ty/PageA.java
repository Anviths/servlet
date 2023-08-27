package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(value = "/page-a")
public class PageA extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		session.setAttribute("name", "vikas");
		session.setAttribute("phone", 944585858);
		
		User user=new User("priya", "priya@gmail.com", "55655556", 10);
		session.setAttribute("user", user);
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("<html> <body>");
		printWriter.print("<h1> iam page-a </h1>");
		printWriter.print("<body> </html> ");
//		session.setAttribute("object", new String("123"));
	}
}
