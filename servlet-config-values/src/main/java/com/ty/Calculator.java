package com.ty;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig config=getServletConfig();
		String pi=config.getInitParameter("pi");
		String rate=config.getInitParameter("rate");
		
		
		
		System.out.println(pi);
		System.out.println(rate);
		
	}
}