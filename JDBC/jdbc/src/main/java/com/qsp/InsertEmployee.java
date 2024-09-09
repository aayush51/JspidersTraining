package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertEmployee {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver Loaded !");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
			System.out.println("Connection Created !");
			Statement stm = con.createStatement();
			System.out.println("Statement Created !");
//			stm.execute("insert into employee values (106,'avdhut',9243893355,35500)");
//			int num = stm.executeUpdate("insert into employee values (107,'mahesh',9155892255,39500),(108,'kunal',9985692456,28000),(109,'harsh',8197498251,49500),(110,'mahesh',9785212791,34200)");
			int num = stm.executeUpdate("insert into employee values (111,'kunal',9155892255,39500),(112,'kunal',9985692456,28000),(113,'kunal',8197498251,49500),(114,'kunal',9785212791,34200)");
			System.out.println(num+" rows inserted !");
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
