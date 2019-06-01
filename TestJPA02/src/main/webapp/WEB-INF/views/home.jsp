<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

	<h1>Test kiểu khác</h1>
	<c:forEach var="item" items="${ds }">
		<h3>${item.getFirstName() } ${item.getLastName() }</h3>
	</c:forEach>
	
	<c:forEach var="item" items="${users }">
		<h3>${item.getFullname() }</h3>
	</c:forEach>

</body>
</html>
