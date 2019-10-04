<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>

	<sec:authorize access="isAuthenticated()">
		<sec:authentication property="principal.username" var="user"/>
		User authenticated: ${user }
		
		<form:form action="/logout" method="post">
			<input type="submit" value="logout">
		</form:form>
	</sec:authorize>

	<sec:authorize access="isAuthenticated()">
	<h2>
		Show login page <a href="/login">Login</a> <br>
		Show register page <a href="/register"></a>
	</h2>
	</sec:authorize>
</body>
</html>