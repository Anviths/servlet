package com.ty;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PageA extends HttpServlet{

	public PageA() {
	System.out.println("page a created");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("page A intantiate");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("page a service");
	}
}
