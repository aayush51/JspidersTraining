package test;

import java.sql.*;
import java.util.Scanner;

public class UpdateBank {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
			PreparedStatement ps = con.prepareStatement("update bank set location=? where id=?");
			System.out.println("===========Update Location of Bank By ID=========");
			System.out.println("Enter ID ");
			ps.setInt(2, s.nextInt());
			System.out.println("Enter New Location ");
			ps.setString(1, s.next());
			ps.execute();
			System.out.println("Updated");
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		s.close();

	}

}
