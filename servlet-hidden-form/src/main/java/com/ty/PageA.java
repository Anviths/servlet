package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value = "/page-a")
public class PageA extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String userName=req.getParameter("user_name");
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("<html><body>");
		printWriter.print("<form action='page-b'> ");
		printWriter.print("<input type='hidden' name='user_name' value="+userName+">");
		printWriter.print("User Email :<input type='email' name='user_email'>");
		printWriter.print("User Phone :<input type='phone' name='user_phone'>");
		printWriter.print("<input type='submit'  value='submit'>");
		printWriter.print("</form> ");
		printWriter.print("</body></html>");
		
		
	}
}
