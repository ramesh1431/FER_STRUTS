<%@page import="com.rs.fer.bean.PersonalInfo"%>
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<jsp:useBean id="user" class="com.rs.fer.bean.User" scope="session" />

<%
	PersonalInfo personalInfo = (PersonalInfo) session
			.getAttribute("personalInfo");
%>

<html:form action="displayPersonalInfo.do?method=ContactInfo">
	<table border='1' align='center'>
		<tr>
			<td colspan='2' align='center'>Updatename</td>
		</tr>
		<tr>
			<td>FirstName</td>
			<td><input type='text' name='firstName'
				value="<%=personalInfo.getUser().getFirstName()%>"></td>
		</tr>
		<tr>
			<td>MiddleName</td>
			<td><input type='text' name='middleName'
				value="<%=personalInfo.getUser().getMiddleName()%>"></td>
		</tr>
		<tr>
			<td>LastName</td>
			<td><input type='text' name='lastName'
				value="<%=personalInfo.getUser().getLastName()%>"></td>
		</tr>
		<tr>
			<td colspan='2' align='center'><input type='submit' value='Next'></td>

		</tr>

	</table>
</html:form>