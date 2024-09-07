package test;

import java.sql.*;
import java.util.Scanner;

public class FetchBank {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
			PreparedStatement ps = con.prepareStatement("select * from bank where id=?");
			System.out.println("===========Fetch Bank By ID=========");
			System.out.println("Enter ID ");
			ps.setInt(1, s.nextInt());
			ResultSet rs = ps.executeQuery();
			rs.next();
			System.out.println("id:" + rs.getInt(1));
			System.out.println("name:" + rs.getString(2));
			System.out.println("location:" + rs.getString(3));
			System.out.println("Fetched");
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		s.close();

	}

}
