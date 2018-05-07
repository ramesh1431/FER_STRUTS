<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@page
	import="com.rs.fer.service.FERService,com.rs.fer.service.FERServiceImpl,com.rs.fer.bean.PersonalInfo"%>
<jsp:useBean id="user" class="com.rs.fer.bean.User" scope="session" />

<%
	PersonalInfo personalInfo = (PersonalInfo) session.getAttribute("personalInfo");
%>

<html:form action="displayPersonalInfo.do?method=AddressInfo">                        

	<table border='1'>

		<tr>
			<td>Email</td>
			<td><input type='text' name='email'
				value="<%=personalInfo.getUser().getEmail()%>"></td>
		</tr>
		<tr>
			<td>Phone</td>
			<td><input type='text' name='phone'
				value="<%=personalInfo.getUser().getPhone()%>"></td>

		</tr>

		<tr>
			<td colspan='2' align='center'><input type='submit' value='Next'></td>
		</tr>
	</table>
</html:form>