package com.qsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TakeIpStore6 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("nm");
		String phone = req.getParameter("ph");
		String email = req.getParameter("em");
		String gender = req.getParameter("gn");
		String address = req.getParameter("ad");
		
		int n = InsertData.insert(name, Long.parseLong(phone), email, gender, address);
		if(n==1) {
			System.out.println("Data is inserted");
		}
		else {
			System.out.println("Data is not inserted");
		}
	}
}
