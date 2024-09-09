package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchEmployee {
	
public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded");
			
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
			System.out.println("Connection Created !");
			
			Statement stm = con.createStatement();
			System.out.println("Statement Created !");
			
			ResultSet rs = stm.executeQuery("select * from employee order by id");
			System.out.println("Query Executed !");
			System.out.println("------------------------------------------");
			while(rs.next())
			{
				System.out.println("id: "+rs.getInt("id"));
				System.out.println("name: "+rs.getString("name"));
				System.out.println("phone number: "+rs.getLong("phone"));
				System.out.println("salary: "+rs.getDouble("sal"));
				System.out.println("------------------------------------------");
			}
			
			con.close();
			System.out.println("Connection Closed !");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
}
