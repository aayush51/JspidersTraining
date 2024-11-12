package com.qsp;


import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class MyController {

	@GetMapping("/newpage")
	public String getHiii() {
		return "home.jsp";
	}

	@GetMapping("/reg")
	public void register(jakarta.servlet.http.HttpServletRequest req, jakarta.servlet.http.HttpServletResponse resp)
			throws IOException {
		PrintWriter pw = resp.getWriter();
		String user = req.getParameter("un");
		String phone = req.getParameter("ph");
		String email = req.getParameter("em");
		pw.print("<h1>Username: " + user + "</h1>");
		pw.print("<h1>Phone: " + phone + "</h1>");
		pw.print("<h1>Email: " + email + "</h1>");

	}

	@GetMapping("/sum")
	public void sum(@RequestParam int num1, @RequestParam int num2, HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		PrintWriter pw = resp.getWriter();
		int result = num1 + num2;
		pw.print("<h1>" + result + "</h1>");
	}

}
