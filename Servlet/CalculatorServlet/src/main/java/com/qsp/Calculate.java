package com.qsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/Calculate")
public class Calculate extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("Calculator.html");
		PrintWriter pw = resp.getWriter();
		String str1 = req.getParameter("n1");
		String str2 = req.getParameter("n2");
		try {
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);
			String operation = req.getParameter("op");
			System.out.println(operation);
			if (operation.equals("add")) {
				rd.include(req, resp);
				pw.print("<h3 class='ans'> Addition of " + num1 + " and " + num2 + " is :" + (num1 + num2) + "</h3>");
			} else if (operation.equals("subtract")) {
				rd.include(req, resp);
				pw.print("<h3 class='ans'> Subtraction of " + num1 + " and " + num2 + " is :" + (num1 - num2) + "</h3>");
			} else if (operation.equals("multiply")) {
				rd.include(req, resp);
				pw.print("<h3 class='ans'> Multiplication of " + num1 + " and " + num2 + " is :" + (num1 * num2) + "</h3>");
			} else if (operation.equals("divide")) {
				rd.include(req, resp);
				pw.print("<h3 class='ans'> Division of " + num1 + " and " + num2 + " is :" + ((double)num1/(double)num2) + "</h3>");
			}
		} catch (NumberFormatException nfe) {
			rd.include(req, resp);
			pw.print("<h2 class='error'>Error - Enter Valid Values</h2> <br>");
		} catch (Exception e) {
			rd.include(req, resp);
			pw.print("<h2 class='error'>Error - Select Operation to Perform</h2> <br>");
		}

	}
}
