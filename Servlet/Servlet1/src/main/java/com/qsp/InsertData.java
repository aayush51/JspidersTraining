package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
@WebServlet("/Storedata")
public class InsertData {
	
	public static int insert(String name,long phone,String email,String gender,String address) {
		int n = 0 ;
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp","postgres","root");
			PreparedStatement ps = con.prepareStatement("insert into entries values (?,?,?,?,?)");
			ps.setString(1, name);
			ps.setLong(2, phone);
			ps.setString(3, email);
			ps.setString(4, gender);
			ps.setString(5, address);
			n=ps.executeUpdate();
			con.close();
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return n;
		
	}

}
