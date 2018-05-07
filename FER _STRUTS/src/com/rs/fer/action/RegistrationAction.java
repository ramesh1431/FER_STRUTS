package com.rs.fer.action;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


import com.rs.fer.bean.User;
import com.rs.fer.service.FERService;
import com.rs.fer.service.FERServiceImpl;

public class RegistrationAction extends org.apache.struts.action.Action{
	private final static String SUCCESS = "success";
	private final static String FAILURE = "failure";

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		FERService ferService = new FERServiceImpl();
		//RegistrationForm registrationform =(RegistrationForm)form;
				
		User user =new User();
	user.setFirstName(request.getParameter("firstname"));
	user.setMiddleName(request.getParameter("middlename"));
	user.setLastName(request.getParameter("lastname"));
	user.setEmail(request.getParameter("email"));
	user.setPhone(request.getParameter("phone"));
	user.setUsername(request.getParameter("username"));
	user.setPassword(request.getParameter("password"));
	/*DataSource datasource=getDataSource(request, "FER _STRUTS");
	Connection connection =datasource.getConnection();*/
	//DataSource datasource=getDataSource(request, "FER _STRUTS");
	Connection connection =getDataSource(request, "FER _STRUTS").getConnection();
	
	boolean registrationFlag = ferService.registration(user,connection);
	if(registrationFlag){
	return mapping.findForward(SUCCESS);
	}else{
		return mapping.findForward(FAILURE);
	}
		
	}

	private Connection getConnectin() {
		// TODO Auto-generated method stub
		return null;
	}
	
}