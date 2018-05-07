<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<html:form action="/Register">

		<table border="1" align="center">
			<tr>
				<td colspan="2" align="center">RegistrationForm</td>
			</tr>
			<tr>
				<td>firstname</td>
				<td><input type="text" name="firstname" value=""></td>
			</tr>
			<tr>
				<td>middlename</td>
				<td><input type="text" name="middlename" value=""></td>
			</tr>
			<tr>
				<td>lastname</td>
				<td><input type="text" name="lastname" value=""></td>
			</tr>
			<tr>
				<td>email</td>
				<td><input type="text" name="email" value=""></td>
			</tr>
			<tr>
				<td>phone</td>
				<td><input type="text" name="phone" value=""></td>
			</tr>
			<tr>
				<td>username</td>
				<td><input type="text" name="username" value=""></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="password" name="password" value=""></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Register"></td>
			</tr>
		</table>
		</html:form>
</body>
</html>