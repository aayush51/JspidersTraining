package com.qsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		pw.write(getServletInfo());
		
		pw.println("<html>"); 
        pw.println("<head>"
        		+ "<title>My first Servlet</title>"
        		+ "<style> "
        		+ "h2 {"
        		+ "color:green;"
        		+ "font-size:4rem;"
        		+ "} "
        		+ "h3 {"
        		+ "color:blue;"
        		+ "font-size:3rem;"
        		+ "} "
        		+ "</style>"
        		+ "</head>"); 
        pw.println("<body>"); 
        pw.println("<h2>Welcome!</h2>"
        		+ "<h3>My Name is AAYUSH</h3>"); 
        pw.println("</body>"); 
        pw.println("</html>"); 
        
        pw.close(); 
	}

}
