package com.cricketer;

import java.sql.*;
import java.util.Scanner;

public class CustomFetching {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:postgresql://localhost:5432/cricket?user=postgres&password=root");

			PreparedStatement ps = con.prepareStatement("select * from cricketer order by id");

			ResultSet rs = ps.executeQuery();
			
			ResultSetMetaData rsm = rs.getMetaData();
			
			int count = rsm.getColumnCount();
			for (int i = 1; i <= count; i++) {
				System.out.print(rsm.getColumnName(i) + "   ");
			}
			System.out.println();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4)
						+ " " + rs.getInt(5) + " " + rs.getString(6) + " " + rs.getString(7));
			}
			System.out.println("fetched");

			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		s.close();
	}

}
