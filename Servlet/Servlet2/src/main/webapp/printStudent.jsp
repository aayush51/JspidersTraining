<%@page import="com.qsp.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>
</head>
<body>

	<%
	Student stud = (Student) request.getAttribute("stud");
	%>
	<h1>
		ID:
		<%=stud.getId()%></h1>
	<h1>
		Name:
		<%=stud.getName() %></h1>

</body>
</html>