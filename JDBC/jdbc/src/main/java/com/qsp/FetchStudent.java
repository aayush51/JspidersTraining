package com.qsp;

import java.sql.*;

public class FetchStudent {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
			
//			Statement stm = con.createStatement();
			
			PreparedStatement ps = con.prepareStatement("select * from student order by id");
			
//			stm.execute("select * from student");
//			ResultSet rs = stm.getResultSet();
			
//			ResultSet rs = stm.executeQuery("select * from student order by id");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				System.out.println("id: "+rs.getInt("id") + " | " + "name: "+rs.getString("name") );
			}
			
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
