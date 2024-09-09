package com.qsp;

import java.sql.*;
import java.util.Scanner;

public class DeleteStudent2 {
	
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
			PreparedStatement ps = con.prepareStatement("delete from student where id=?");
			System.out.println("Enter ID which record you want to Delete : ");
			ps.setInt(1, sc.nextInt());
			ps.execute();
			System.out.println("Deleted");
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		sc.close();
		
	}

}
