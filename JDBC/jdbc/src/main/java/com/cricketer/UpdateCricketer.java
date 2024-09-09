package com.cricketer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateCricketer {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Change ID -");

		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:postgresql://localhost:5432/cricket?user=postgres&password=root");

			PreparedStatement ps = con.prepareStatement("update cricketer set id=? where id=?");
			System.out.println("Enter old ID ");
			ps.setInt(2, s.nextInt());
			System.out.println("Enter new ID ");
			ps.setInt(1, s.nextInt());

			ps.execute();

			System.out.println("ID Updated");
			con.close();

		}

		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		s.close();
	}

}
