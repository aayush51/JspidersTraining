package test;

import java.sql.*;

public class FetchAll {
	
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
			PreparedStatement ps = con.prepareStatement("select * from bank order by id");
			System.out.println("================Bank Database==============");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("id:" + rs.getInt(1));
				System.out.println("name:" + rs.getString(2));
				System.out.println("location:" + rs.getString(3));
				System.out.println("=========================================");
			}
			
			System.out.println("Fetched");
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
