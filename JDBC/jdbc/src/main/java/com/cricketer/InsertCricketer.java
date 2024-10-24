package com.cricketer;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.postgresql.util.PSQLException;

public class InsertCricketer {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:postgresql://localhost:5432/cricket?user=postgres&password=root");

			PreparedStatement ps = con.prepareStatement("insert into cricketer values (?,?,?,?,?,?,?)");
			System.out.println("Enter ID ");
			ps.setInt(1, s.nextInt());
			System.out.println("Enter Name ");
			s.nextLine();
			ps.setString(2, s.nextLine());
			System.out.println("Enter Grade ");
			ps.setString(3, s.next());
			System.out.println("Enter Age ");
			ps.setInt(4, s.nextInt());
			System.out.println("Enter Jersey Number ");
			ps.setInt(5, s.nextInt());
			System.out.println("Enter Role ");
			s.nextLine();
			ps.setString(6, s.nextLine());
			System.out.println("Enter Style ");
			ps.setString(7, s.next());

			ps.execute();

			System.out.println("Inserted");
			con.close();

		}

		catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (InputMismatchException ime) {
			System.out.println("Enter Correct Input !");
		} catch (PSQLException psqle) {

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}

		s.close();
	}

}
