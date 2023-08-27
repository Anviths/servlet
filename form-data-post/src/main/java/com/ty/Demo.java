package com.ty;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Demo extends GenericServlet {
	static {
		System.out.println("Class Loading");
	}

	public Demo() {
		super();
		System.out.println("object Creation");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("objects intialised");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service Method ");

	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("object destred");
	}

}
