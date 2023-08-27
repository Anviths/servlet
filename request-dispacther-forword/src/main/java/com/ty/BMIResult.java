package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BMIResult extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double height= (Double) req.getAttribute("height");
		double weight= (Double) req.getAttribute("weight");;
		double value= (Double) req.getAttribute("value");;
		
		String res="";
		if(value<18) {
			res="under weight";
		}
		else if(value>18 && value<25) {
			res="normal";
		}
		else {
			res="over weigth";
		}
		
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("<html><body>");
		printWriter.print("<h1> Weight = "+weight+"</h1>");
		printWriter.print("<h1> Height= "+height+"</h1>");
		printWriter.print("<h1> Value = "+value+"</h1>");
		printWriter.print("<h1> BMI result = "+res+"</h1>");
		printWriter.print("</body></html>");

		System.out.println(weight);
		System.out.println(height);
		System.out.println(value);
	}
}
