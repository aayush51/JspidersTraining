package test;

import java.sql.*;
import java.util.Scanner;

public class DeleteBank {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
			PreparedStatement ps = con.prepareStatement("delete from bank where id=?");
			System.out.println("===========Delete Bank By ID=========");
			System.out.println("Enter ID ");
			ps.setInt(1, s.nextInt());
			ps.execute();
			System.out.println("Deleted");
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		s.close();

	}

}
