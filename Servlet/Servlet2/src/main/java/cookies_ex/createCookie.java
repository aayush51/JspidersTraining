package cookies_ex;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/cookie")
public class createCookie extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie1 = new Cookie("Name","Dinga");
		cookie1.setMaxAge(60);
		Cookie cookie2 = new Cookie("pass", "123");
		
		resp.addCookie(cookie1);
		resp.addCookie(cookie2);
	}
}
