package com.ty;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(value = "/info")
public class MyInfo extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		
		Student	 s1=new Student();
		s1.setId(101);
		s1.setEmail("anvith@gmail.com");
		s1.setName("anvith");
		
		session.setAttribute("student", s1);
		session.setAttribute("name", "anvith");
		
//		req.setAttribute("student", s1);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("studentInfo.jsp");
		dispatcher.forward(req, resp);
	}
}
