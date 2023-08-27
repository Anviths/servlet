package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BMICalculator extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String weight=req.getParameter("weight");
		String height=req.getParameter("height");

		double h=Double.parseDouble(height);
		double w=Double.parseDouble(weight);
		double v=  w/(h*h);

		req.setAttribute("height", h);
		req.setAttribute("weight", w);
		req.setAttribute("value", v);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("result");
		dispatcher.forward(req, resp);
	}
}
