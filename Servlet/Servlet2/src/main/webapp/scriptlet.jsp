<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Script-let</title>
</head>
<body>
	<!-- Declaration Tag -->
	<%!public int add(int a, int b) {
		return a + b;
	}%>
	<!-- Script-let Tag -->
	<%
	int res = add(10, 20);
	%>
	<h1>
		Addition is
		<!-- Expression Tag -->
		<%=res%></h1>
</body>
</html>