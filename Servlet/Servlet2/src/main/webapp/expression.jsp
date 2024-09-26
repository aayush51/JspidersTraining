<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expression tag</title>
</head>
<body>
	<%!int a = 5, b = 3;
	String str = a > b ? "a is greater" : "b is greater";%>

	<h1>
		a=<%=a%></h1>
	<h1>
		b=<%=b%></h1>
	<h1><%=str%></h1>

</body>
</html>