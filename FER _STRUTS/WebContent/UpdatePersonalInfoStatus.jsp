 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page
	import="com.rs.fer.bean.Address, com.rs.fer.service.FERService,com.rs.fer.service.FERServiceImpl,java.util.List, com.rs.fer.bean.PersonalInfo,com.rs.fer.bean.User"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		FERService ferService = new FERServiceImpl();
		//User user = new User();

		//Address address = new Address();

		String userName = session.getAttribute("username").toString();
		PersonalInfo personalinfo = (PersonalInfo) session.getAttribute("personalInfo");

		/* boolean isUserUpdate = ferService.PersonalInfo(personalinfo);
	
		if (isUserUpdate) {
			out.println("PersonalInfo Updated Success...");
		} else {

			out.println("PersonalInfo Not Updated....");
		}  */
	%> 
	
</body>
</html>



