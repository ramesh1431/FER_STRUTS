<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.rs.fer.bean.Expense,java.util.*"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<html:form action="displayDeleteExpense.do?method=deleteExpenseStatus">

	<%
		List<Expense> expenses = (List<Expense>) session.getAttribute("expenses");
			if (expenses != null && !expenses.isEmpty()) {
	%>


	<td><select name='id'>
			<%
				for (Expense expense : expenses) {
			%>
			<option value='<%=expense.getId()%>'>
				<%=expense.getExpensetype()%>,
				<%=expense.getDate()%>,
				<%=expense.getPrice()%>,
				<%=expense.getNumberofitems()%>,
				<%=expense.getTotal()%>,
				<%=expense.getBywhom()%></option>
			<%
				}
			%>

	</select> <html:submit value='Delete' /></td>

	<%
		} else {
	%>
No expenses found..
<%
		}
	%>
</html:form>
