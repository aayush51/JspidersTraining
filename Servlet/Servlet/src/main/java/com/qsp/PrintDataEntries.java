package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PrintDataEntries {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp","postgres","root");
			PreparedStatement ps = con.prepareStatement("select * from entries");
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				System.out.print("Name:");
			}
		}
		
	}

}
