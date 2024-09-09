package com.qsp;

import java.sql.*;

public class DeleteEmployee {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded");
			
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
			System.out.println("Connection Created !");
			
			Statement stm = con.createStatement();
			System.out.println("Statement Created !");
			
			int num = stm.executeUpdate("delete from employee where name='kunal'");
			System.out.println(num+" rows deleted !");
			
			con.close();
			System.out.println("Connection Closed ...");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}		
	}

}
