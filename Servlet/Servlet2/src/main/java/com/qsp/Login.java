package com.qsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("un");
		String pass = req.getParameter("ps");
		if(name.equals("XYZ") && pass.equals("123")) {
			RequestDispatcher rd = req.getRequestDispatcher("home");
			rd.forward(req, resp);
		}
		else {
			PrintWriter pw = resp.getWriter();
			pw.print("<h1>Wrong Credentials</h1>");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, resp);
		}
	}
}
