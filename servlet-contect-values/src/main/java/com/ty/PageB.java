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
		ServletContext context=req.getServletContext();
		String user=context.getInitParameter("user");
		String url=context.getInitParameter("url");
		System.out.println("---------PAGE-B-----------");
		System.out.println(user);
		System.out.println(url);
	}
}
