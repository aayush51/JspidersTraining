package com.qsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

@SuppressWarnings("serial")
public class FirstServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		pw.print("<h1>Hello</h1>");
		pw.print("<h1>How are you ?</h1>");
		pw.print("<h1>Tata</h1>");
		pw.print("<h1>Bye Bye</h1>");
		pw.print("<h1>Bye Bye</h1>");

	}

}
