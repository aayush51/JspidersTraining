<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>
	<form:form action="update" modelAttribute="user" method="get">
		<form:input path="id"/> <br>
		<form:input path="name"/> <br>
		<form:input path="phone"/> <br>
		<form:button>update</form:button>
	</form:form>

</body>
</html>