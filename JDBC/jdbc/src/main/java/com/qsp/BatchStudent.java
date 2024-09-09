package com.qsp;

import java.sql.*;

public class BatchStudent {

	public static void main(String[] args) {

		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
			Statement stm = con.createStatement();
			stm.addBatch("insert into student values(1,'virat')");
			stm.addBatch("insert into student values(2,'anushka')");
			stm.addBatch("update student set name='chiku' where id=1");
			stm.addBatch("delete from student where id=2");
			stm.executeBatch();
			System.out.println("Executed");
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
