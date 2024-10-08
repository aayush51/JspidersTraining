package session_management;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/login2")
public class Login2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("un");
		String pass = req.getParameter("ps");
		if(name.equals("XYZ") && pass.equals("123")) {
			HttpSession session = req.getSession();
			session.setAttribute("name", name);
			session.setAttribute("pass", pass);
			RequestDispatcher rd = req.getRequestDispatcher("page1");
			rd.forward(req, resp);
		}
		else {
			PrintWriter pw = resp.getWriter();
			pw.print("<h1>Wrong Credentials</h1>");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, resp);
		}
	}
}
