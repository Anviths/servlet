package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class First extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		PrintWriter printWriter=res.getWriter();
		printWriter.print("<html> <body>");
		printWriter.print("<h1>hi i am called </hi>");
		printWriter.print("</body> </html>");
	}

	
	
}
