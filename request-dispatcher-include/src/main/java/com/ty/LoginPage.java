package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginPage extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userName=req.getParameter("user_name");
		String password=req.getParameter("password");
		
		
		PrintWriter printWriter=resp.getWriter();
		Dao dao =new Dao();
		boolean res=dao.login(userName, password);
		if(res) {
			printWriter.print("<html><body>");
			printWriter.print("<h1>sucessfull</h1>");
			printWriter.print("</body></html>");
		}
		else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
			printWriter.print("<html><body>");
			printWriter.print("<small style='color:red' text-align:center >!Wrong password....</small> <br>");
			printWriter.print("</body></html>");
			
		}
	}
}
