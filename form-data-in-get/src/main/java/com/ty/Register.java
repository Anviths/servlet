package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("user_name");
		String email=req.getParameter("user_email");
		String age=req.getParameter("user_age");
		String gender=req.getParameter("user_gender");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(age);
		System.out.println(gender);
		System.out.println("=======================");
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("<h1> Name "+name+"</h1>");
		printWriter.print("<h1> email "+email+"</h1>");
		printWriter.print("<h1> Age "+age+"</h1>");
		printWriter.print("<h1> Age "+gender+"</h1>");
	}
}
