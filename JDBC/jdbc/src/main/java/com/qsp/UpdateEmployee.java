package com.qsp;

import java.sql.*;

public class UpdateEmployee {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded");
			
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
			System.out.println("Connection Created !");
			
			Statement stm = con.createStatement();
			System.out.println("Statement Created !");

//			int num = stm.executeUpdate("update employee set name='vinay' where name='gaurav'");
			int num = stm.executeUpdate("update employee set sal=33900 where name='mahesh'");
			System.out.println(num+" rows updated !");
			
			con.close();
			System.out.println("Connection Closed ...");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}		
	}

}
