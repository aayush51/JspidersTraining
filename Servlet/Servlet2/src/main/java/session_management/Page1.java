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
@WebServlet("/page1")
public class Page1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String name = (String) session.getAttribute("name");
		String pass = (String) session.getAttribute("pass");
		if("XYZ".equals(name) && "123".equals(pass)) {
			PrintWriter pw = resp.getWriter();
			pw.print("<h1>From Page 1</h1>");
			pw.print("<a href='/Servlet2/page2'>Go To Page2</a>");
		}
		else {
			PrintWriter pw = resp.getWriter();
			pw.print("<h1>You are Logged Out");
		}
		
	}
}
