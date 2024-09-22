package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrintDataEntries {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp","postgres","root");
			PreparedStatement ps = con.prepareStatement("select * from entries");
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				System.out.print("Name:"+rs.getString("name")+" ");
				System.out.print("Phone No:"+rs.getString("phone")+" ");
				System.out.print("Email id:"+rs.getString("email")+" ");
				System.out.print("Gender:"+rs.getString("gender")+" ");
				System.out.print("Address:"+rs.getString("address")+" ");
			}
			ps.execute();
			con.close();
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
