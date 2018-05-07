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
	<html:form action="/ResetPassword">
		<table border="1" align="center">
			<tr>
				<td colspan="2" align="center">Reset Password</td>
			</tr>
			<tr>
				<td>Current Password</td>
				<td><html:text name="ResetPasswordForm"
						property="currentPassword" /></td>
			</tr>
			<tr>
				<td>New Password</td>
				<td><html:password name="ResetPasswordForm"
						property="newPassword" /></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><html:password name="ResetPasswordForm"
						property="confirmPassword" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><html:submit value="Reset" />
		</table>
	</html:form>
</body>
</html>