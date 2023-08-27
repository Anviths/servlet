package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
	 
	  String name=req.getParameter("user_name");
	  String password=req.getParameter("password");
	  PrintWriter printWriter=resp.getWriter();
	 
	 
	  if(name.equals("admin") && password.equals("12345") ) {
		  HttpSession session = req.getSession();
		  session.setAttribute("user_name", name);
		  printWriter.print("<html> <body>");
			printWriter.print("<h1>iam page a</h1>");
			printWriter.print("</body></html> ");
		 
		  System.out.println("login sucessfull");
	  }
	  else {
		  printWriter.print("<html> <body>");
			printWriter.print("<h1>wrong password</h1>");
//			
			printWriter.print("</body></html> ");
	  }
	}
}
