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
	<html:form action="/ExpenseReport">
		<table border="1" align="center">
			<tr>
				<td colspan="2" align="center">Get Expense Report</td>
			</tr>
			<tr>
				<td>Expense Type</td>
				<td><html:text name="ExpenseReportForm" property="expenseType" /></td>
			</tr>
			<tr>
				<td>From Date</td>
				<td><html:text name="ExpenseReportForm" property="fromDate" /></td>
			</tr>
			<tr>
				<td>To Date</td>
				<td><html:text name="ExpenseReportForm" property="toDate" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><html:submit value="Submit" />
		</table>
	</html:form>
</body>
</html>