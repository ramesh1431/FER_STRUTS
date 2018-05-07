<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="color: red">
		<html:errors />
	</div>
	<form action="Login">
		<table border="1" align="center">
			<tr>
				<td colspan="2" align="center">Login Form</td>
			</tr>
			<tr>
				<td>username</td>
				<td><html:text property="username" name="LoginForm" /></td>
			</tr>
			<tr>
				<td>password</td>
				<td><html:text property="password" name="LoginForm" /></td>
			</tr>
			<td colspan="2" align="center"><html:submit value="Login"/> <a
				href="Register.jsp">Register</a></td>
		</table>
	</form>

	

</body>
</html>