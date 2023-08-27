package com.ty;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageA extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext context=getServletContext();
		Animal animal=new Animal();
		animal.name="tiger";
		animal.age=10;
		animal.height=1.5;
		
		context.setAttribute("animal", animal);
		System.out.println("------Page A---------------");
	}
	
	
}
