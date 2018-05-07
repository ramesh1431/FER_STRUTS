<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<div style="color: red">
	<html:errors />

</div>
<html:form action="AddExpense"><html:errors/>
	<table align='center' border='2'>
		<tr>
			<td colspan='2' align='center'>AddExpense</td>
		</tr>

		<tr>
			<td>Expensetype</td>
			<td><html:text name="AddExpenseForm" property="expensetype" /></td>

		</tr>
		<tr>
			<td>date</td>
			<td><html:text name="AddExpenseForm" property="date" /></td>
		</tr>
		<tr>
			<td>price</td>
			<td><html:text name="AddExpenseForm" property="price" /></td>
		</tr>
		<tr>
			<td>Numberofitems</td>
			<td><html:text name="AddExpenseForm" property="numberofitems" /></td>
		</tr>
		<tr>
			<td>Total</td>
			<td><html:text name="AddExpenseForm" property="total" /></td>
		</tr>
		<tr>
			<td>Bywhom</td>
			<td><html:text name="AddExpenseForm" property="bywhom" /></td>
		</tr>
		<tr>
			<td colspan='2' align='center'><html:submit value="Add" /></td>
		</tr>
	</table>
</html:form>