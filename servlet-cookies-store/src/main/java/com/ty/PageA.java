package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value="/page-a")
public class PageA extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie=new Cookie("Pi", "3.14");
		cookie.setMaxAge(5000);
		resp.addCookie(cookie);
		Cookie cookie2=new Cookie("name", "priya");
		cookie.setMaxAge(24*60*60);
		resp.addCookie(cookie2);
		
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("<html><body>");
		printWriter.print("<h1>cokkie created</h1>");
		printWriter.print("</body></html>");
		System.out.println("cookie added");
	}
}
