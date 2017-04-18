<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="loginSubmit.do" commandName="loginCommand"
		method="POST">
		<center>
			<table bgcolor="red">
				<tr bgcolor="yellow">
					<td>Username</td>
					<td><form:input path="username" type="text" /></td>
					<td><font color="red"><form:errors path="username" /></font></td>

				</tr>
				<tr bgcolor="yellow">
					<td>Password</td>
					<td><form:input path="password" type="password" /></td>
					<td><font color="red"> <form:errors path="password" /></font></td>

				</tr>
				<tr>
					<td colspan="3" align="center"><input type="submit"
						value="Login"></td>
				</tr>
			</table>
		</center>
	</form:form>
</body>
</html>