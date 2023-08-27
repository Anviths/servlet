package com.ty;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageB extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context=getServletContext();
		Animal animal=(Animal)context.getAttribute("animal");
		
		System.out.println("------PageB---------------");
		System.out.println("animal name : "+animal.name);
		System.out.println("animal name : "+animal.age);
		System.out.println("animal name : "+animal.height);
	}
}
