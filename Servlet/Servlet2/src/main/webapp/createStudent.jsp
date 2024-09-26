<%@page import="com.qsp.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student</title>
</head>
<body>

	<%
	Student stud = new Student();
	stud.setId(101);
	stud.setName("Gaurav");
	request.setAttribute("stud", stud);
	RequestDispatcher rd = request.getRequestDispatcher("printStudent.jsp");
	rd.forward(request, response);
	%>

</body>
</html>