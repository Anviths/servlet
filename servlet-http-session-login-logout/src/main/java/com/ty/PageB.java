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
		
		 PrintWriter printWriter=resp.getWriter();
		 String name=(String) session.getAttribute("user_name");
		  if(name != null ) {
		printWriter.print("<html> <body>");
		printWriter.print("<h1>iam page b</h1>");
		printWriter.print("</body></html> ");
		  }
		  else {
			  printWriter.print("<html> <body>");
				printWriter.print("<h1>login to use</h1>");
				printWriter.print("</body></html> ");
		  }
	}
}
