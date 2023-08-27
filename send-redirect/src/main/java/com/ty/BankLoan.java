package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BankLoan extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String option=req.getParameter("loan");
		
		PrintWriter printWriter=resp.getWriter();
		if(option.equals("car")){
			printWriter.print("<html> <body>");
			printWriter.print("<h1>car loan <h1>");
			
			printWriter.print(" </body></html>");
		}
		else if(option.equals("personal")) {
			printWriter.print("<html> <body>");
			printWriter.print("<h1>PERSONAL loan <h1>");
			
			printWriter.print(" </body></html>");
		}
		else if(option.equals("house")) {
			resp.sendRedirect("https://portal.hdfc.com/");
		}
		else if(option.equals("gold")) {
			resp.sendRedirect("https://www.manappuram.com/gold-loan.html");
		}
		else {
			resp.sendRedirect("https://www.google.com/");
		}
	}
}
