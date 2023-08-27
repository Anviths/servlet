package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Product extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("product_name");
		String quantity=req.getParameter("product_quantity");
		String price=req.getParameter("product_price");
		String description=req.getParameter("product_description");
		
		System.out.println("product name"+name);
		System.out.println("product quantity"+quantity);
		System.out.println("product price"+price);
		System.out.println("product dec"+description);
		System.out.println("=================");
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("<html><body>");
		printWriter.print("<h3> Product Name  :"+name+"</h3>");
		printWriter.print("<h3> product Quantity :"+quantity+"</h3>");
		printWriter.print("<h3> product  Price :"+price+"</h3>");
		printWriter.print("<h3> product description :"+description+"</h3>");
		printWriter.print(" </body></html>");
	}
}
