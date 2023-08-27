package edu.ty;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class First extends GenericServlet{

	

	@Override   
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("hi i am called");
	}

}
