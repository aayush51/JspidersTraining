package session_management;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/page2")
public class Page2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("name");
		String pass = (String) session.getAttribute("pass");
		if("XYZ".equals(name) && "123".equals(pass)) {
			PrintWriter pw = resp.getWriter();
			pw.print("<h1>From Page 2</h1>");
			pw.print("<a href='/Servlet2/page1'>Go To Page1</a>");
			pw.print("<br>");
			pw.print("<br>");
			pw.print("<a href='/Servlet2/logout'>------ LogOut -----</a>");


		}
		else {
			PrintWriter pw = resp.getWriter();
			pw.print("<h1>You are Logged Out");
		}
		
	}
}
