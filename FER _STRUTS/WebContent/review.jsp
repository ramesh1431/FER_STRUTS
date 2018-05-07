<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<%@page
	import="com.rs.fer.service.FERService,com.rs.fer.service.FERServiceImpl,com.rs.fer.bean.PersonalInfo"%>

<jsp:useBean id="user" class="com.rs.fer.bean.User" scope="session" />
<jsp:useBean id="address" class="com.rs.fer.bean.Address"
	scope="session" />

<%
	PersonalInfo personalInfo = (PersonalInfo) session.getAttribute("personalInfo");
	personalInfo.getAddress().setCountry(request.getParameter("country"));
	personalInfo.getAddress().setState(request.getParameter("state"));
	personalInfo.getAddress().setDistric(request.getParameter("distric"));
	personalInfo.getAddress().setMandal(request.getParameter("mandal"));
	personalInfo.getAddress().setZip(request.getParameter("zip"));
%>

<html:form action="displayPersonalInfo.do?method=personalInfoStatus">

	<table border='1'>
		<tr>
			<td>First Name</td>
			<td><%=personalInfo.getUser().getFirstName()%></td>
		</tr>	

		<tr>
			<td>Middle Name</td>
			<td><%=personalInfo.getUser().getMiddleName()%></td>
		</tr>

		<tr>
			<td>Last Name</td>
			<td><%=personalInfo.getUser().getLastName()%></td>
		</tr>

		<tr>
			<td>Email</td>
			<td><%=personalInfo.getUser().getEmail()%></td>
		</tr>

		<tr>
			<td>phone</td>
			<td><%=personalInfo.getUser().getPhone()%></td>
		</tr>

		<tr>
			<td>Country</td>
			<td><%=personalInfo.getAddress().getCountry()%></td>
		</tr>

		<tr>
			<td>State</td>
			<td><%=personalInfo.getAddress().getState()%></td>
		</tr>
		<tr>
			<td>Distric</td>
			<td><%=personalInfo.getAddress().getDistric()%></td>
		</tr>




		<tr>
			<td>Zip</td>
			<td><%=personalInfo.getAddress().getZip()%></td>
		</tr>

		<tr>
			<td colspan='2'><input type='submit' value='previous'> <input
				type='submit' value='update'></td>
		</tr>
	</table>
</html:form>