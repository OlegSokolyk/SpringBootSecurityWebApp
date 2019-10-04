<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>

	<h1>Login page</h1>
	<form:form action="/login" method="POST">
		<label for="focusedInput">E-mail address</label>
		<input type="email" name="email">
		<br> 
		
		<label for="focusedInput">Password</label>
		<input type="password" name="password">
		<br>
		
		<label>Remember me</label>
		<input type="checkbox" name="rememberme"/>
		<br>
		<input type="submit">
	</form:form>

</body>
</html>
