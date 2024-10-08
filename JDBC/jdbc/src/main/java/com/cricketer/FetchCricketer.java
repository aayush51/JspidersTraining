package com.cricketer;

import java.sql.*;

public class FetchCricketer {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:postgresql://localhost:5432/cricket?user=postgres&password=root");
			PreparedStatement ps = con.prepareStatement("select * from cricketer order by id");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + ") Name:" + rs.getString(2) + ", Grade:" + rs.getString(3) + ", Age:"
						+ rs.getInt(4) + ", Jersey No:" + rs.getInt(5) + ", Role:" + rs.getString(6) + ", Style:"
						+ rs.getString(7));
			}
			System.out.println("fetched");
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
