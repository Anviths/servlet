package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EmployeeInfo extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String id=req.getParameter("emp_id");
		String name=req.getParameter("emp_name");
		String age=req.getParameter("emp_age");
		String email=req.getParameter("emp_email");
		String desgnation=req.getParameter("emp_desination");
		
		PrintWriter printWriter=res.getWriter();
		printWriter.print("<html> <body>");
		printWriter.print("<h2>"+id+"</h2>");
		printWriter.print("<h2>"+name+"</h2>");
		printWriter.print("<h2>"+age+"</h2>");
		printWriter.print("<h2>"+email+"</h2>");
		printWriter.print("<h2>"+desgnation+"</h2>");
		printWriter.print("</body> </html> ");
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(email);
		System.out.println(desgnation);
		System.out.println("============");
	}

}
