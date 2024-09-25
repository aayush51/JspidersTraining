package com.qsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/webservlet")
public class Webservlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("nm");
		String phone = req.getParameter("ph");
		String email = req.getParameter("em");
		
		PrintWriter pw = resp.getWriter();
		pw.print("<h1>Name:"+name+"</h1>");
		pw.print("<h1>Phone No.:"+phone+"</h1>");
		pw.print("<h1>Email ID:"+email+"</h1>");
		
	}
}
