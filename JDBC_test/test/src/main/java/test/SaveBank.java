package test;

import java.sql.*;
import java.util.Scanner;

public class SaveBank {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
			PreparedStatement ps = con.prepareStatement("insert into bank values(?,?,?)");
			System.out.println("================Bank Database==============");
			System.out.println("Enter ID ");
			ps.setInt(1, s.nextInt());
			System.out.println("Enter Name ");
			ps.setString(2, s.next());
			System.out.println("Enter Location ");
			ps.setString(3, s.next());
			ps.execute();
			System.out.println("Inserted");
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		s.close();

	}

}
