package com.qsp;

import java.sql.*;
import java.util.Scanner;

public class InsertStudent2 {
	
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?)");
			System.out.println("Enter ID : ");
			ps.setInt(1, sc.nextInt());
			System.out.println("Enter Name : ");
			ps.setString(2, sc.next());
			ps.execute();
			System.out.println("Inserted");
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		sc.close();
		
	}

}
