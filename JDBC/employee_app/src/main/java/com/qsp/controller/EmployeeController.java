package com.qsp.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.qsp.model.Employee;

public class EmployeeController {
	
	static Connection con;
	static {
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void addEmployee(Employee employee) {
		try {
			PreparedStatement ps = con.prepareStatement("");
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
