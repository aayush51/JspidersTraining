package com.cricketer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteCricketer {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Delete Record -");

		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:postgresql://localhost:5432/cricket?user=postgres&password=root");

			PreparedStatement ps = con.prepareStatement("delete from cricketer where id=?");

			System.out.println("Enter ID ");
			ps.setInt(1, s.nextInt());

			ps.execute();

			System.out.println("Records Deleted");
			con.close();

		}

		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		s.close();
	}

}
