package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchStudent2 {
	
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
			PreparedStatement ps = con.prepareStatement("select * from student where id=?");
			System.out.println("Enter ID : ");
			ps.setInt(1, sc.nextInt());
			ResultSet rs = ps.executeQuery();
			rs.next();
			System.out.println("ID:"+rs.getInt(1)+" , Name:"+rs.getString(2));
			System.out.println("Name Fetched");
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		sc.close();
		
	}

}
