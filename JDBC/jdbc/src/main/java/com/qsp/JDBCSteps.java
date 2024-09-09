package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSteps {
	
	public static void main(String[] args) {
		
		try {
			// 1st Step Load and Register Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver class is loaded");
			
			// 2nd Step Create Connection
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres" , "root" );
//			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root" );
			System.out.println("Connection created !! ");
			
			// 3rd Step Create Statement
			Statement stm = con.createStatement();
			System.out.println("Statement created !! ");
			
			// 4th Step Execute Query
			boolean res = stm.execute("insert into student values (101,'anish'),(102,'tejas')");
			System.out.println(res+" Query Executed !! ");
			
			// 5th Step Close Connection
			con.close();
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
