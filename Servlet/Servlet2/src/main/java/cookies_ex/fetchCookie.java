package cookies_ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/get-cookie")
public class fetchCookie extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] c = req.getCookies();
		PrintWriter pw = resp.getWriter();
		for (Cookie cookie : c) {
			System.out.println(cookie.getName());
			pw.print("<h1>Name:"+cookie.getName()+"</h1>");
			System.out.println(cookie.getValue());
			pw.print("<h1>Value:"+cookie.getValue()+"</h1>");
		}
	}
}
