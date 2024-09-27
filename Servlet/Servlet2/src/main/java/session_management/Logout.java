package session_management;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/logout")
public class Logout extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		session.invalidate();
		PrintWriter pw = resp.getWriter();
		pw.print("<h1>You are Logged Out");
		pw.print("<br>");

		pw.print("<a href='/Servlet2/page1'>Go To Page1</a>");
		pw.print("<br>");
		pw.print("<br>");

		pw.print("<a href='/Servlet2/page2'>Go To Page2</a>");
		pw.print("<br>");
		pw.print("<br>");

		pw.print("<a href='/Servlet2/login2.html'>Go To Login2</a>");

	}
}
