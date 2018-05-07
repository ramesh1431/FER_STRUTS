<%@ page
	import="com.rs.fer.bean.Expense, java.util.Iterator,java.util.List"%>
	<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
	<% List<Expense> expenses=(List<Expense>)session.getAttribute("expenasereportFlag"); %>
		<table border='1' align='center'>
		<tr>
			<td>expenseType</td>
			<td>price</td>
			<td>numberOfitems</td>
			<td>total</td>
			<td>byWhom</td>
			<td>Action</td>
		</tr>

		<%
			Iterator expenseit = expenses.iterator();
			while (expenseit.hasNext()) {
				Expense expense = (Expense) expenseit.next();
		%><tr>
			<td><%=expense.getExpensetype()%></td>
			<td><%=expense.getPrice()%></td>
			<td><%=expense.getNumberofitems()%></td>
			<td><%=expense.getTotal()%></td>
			<td><%=expense.getBywhom()%></td>

			<td><input type='button' value='Edit'> <input
				type='button' value='Delete'></td>
			<%
				}
			%>
		</tr>
	</table>