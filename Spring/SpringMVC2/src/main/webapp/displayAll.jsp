<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display All</title>
</head>
<body>

	<table>

		<tr>
			<td>ID</td>
			<td>NAME</td>
			<td>PHONE</td>
			<td>EDIT</td>
			<td>DELETE</td>
		</tr>

		<c:forEach var="user" items="${list}">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.phone}</td>
				<td><a href="edit?id=${emp.id}"> edit</a></td>
				<td><a href="delete?id=${emp.id}"> delete</a></td>
			</tr>

		</c:forEach>

	</table>

</body>
</html>