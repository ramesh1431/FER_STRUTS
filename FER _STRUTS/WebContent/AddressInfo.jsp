<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<%@page
	import="com.rs.fer.service.FERService,com.rs.fer.service.FERServiceImpl,com.rs.fer.bean.PersonalInfo"%>

<jsp:useBean id="address" class="com.rs.fer.bean.Address"
	scope="session" />
<jsp:useBean id="user" class="com.rs.fer.bean.User" scope="session" />

<%
	PersonalInfo personalInfo = (PersonalInfo) session.getAttribute("personalInfo");
%>
<html:form action="displayPersonalInfo.do?method=review">
	<table border='1'>

		<tr>
			<td>Country</td>
			<td><input type='text' name='country'
				value="<%=personalInfo.getAddress().getCountry()%>"></td>
		</tr>


		<tr>
			<td>State</td>
			<td><input type='text' name='state'
				value="<%=personalInfo.getAddress().getState()%>"></td>
		</tr>
		<tr>
			<td>Distric</td>
			<td><input type='text' name='distric'
				value="<%=personalInfo.getAddress().getDistric()%>"></td>
		</tr>

		<tr>
			<td>Mandal</td>
			<td><input type='text' name='mandal'
				value="<%=personalInfo.getAddress().getMandal()%>"></td>
		</tr>
		<tr>
			<td>Zip</td>
			<td><input type='text' name='zip'
				value="<%=personalInfo.getAddress().getZip()%>"></td>
		</tr>
		
		<tr>
			<td colspan='2' align='center'><input type='submit' value='Next'></td>
		</tr>
	</table>
</html:form>
