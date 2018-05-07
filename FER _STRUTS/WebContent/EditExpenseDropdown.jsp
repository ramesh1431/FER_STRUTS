<%@page import="com.rs.fer.bean.Expense,java.util.*"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>


	<%
		List<Expense> expenses = (List<Expense>) session.getAttribute("expenses");
			if (expenses != null && !expenses.isEmpty()) {
	%>

<html:form action="displayEditExpense.do?method=displayEditExpense">
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

	</select> <html:submit value='Edit' /></td>
	</html:form>

	<%
		} else {
	%>
No expenses found..
<%
		}
	%>
