<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>
	<h2>Register New User</h2>
	
	<form:form action="/register" method="POST" modelAttribute="registerModel">
		<form:errors path="*" cssClass="color: red;"/>
		
		<label>Email address:</label>
		<form:input path="email"/>
		<br>
		
		<label>Password:</label>
		<form:input path="password"/>
		<br>
		
		<label>Password Confirmation</label>
		<form:input path="confirmPassword"/>
		<br>
		
		<input type="submit" value="Register">
	
	</form:form>
</body>
</html>