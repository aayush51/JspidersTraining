package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStudent {
	
public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
			PreparedStatement ps = con.prepareStatement("delete from student where id=?");
			ps.setInt(1, 7);
			ps.execute();
			System.out.println("Deleted");
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	
	}
}
