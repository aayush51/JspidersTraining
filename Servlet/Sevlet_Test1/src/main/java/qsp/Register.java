package qsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/reg")
public class Register extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String ename = req.getParameter("name");
		int eid = Integer.parseInt(req.getParameter("id"));
		int esal = Integer.parseInt(req.getParameter("sal"));
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root");
			PreparedStatement ps = con.prepareStatement("insert into emp values (?,?,?)");
			ps.setString(1, ename);
			ps.setInt(2, eid);
			ps.setInt(3, esal);
			ps.execute();
			System.out.println("Inserted");
			PrintWriter pw = resp.getWriter();
			pw.print("<h1>Inserted</h1>");
			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
