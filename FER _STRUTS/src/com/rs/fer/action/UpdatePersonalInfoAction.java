package com.rs.fer.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.rs.fer.bean.PersonalInfo;
import com.rs.fer.service.FERService;
import com.rs.fer.service.FERServiceImpl;

public class UpdatePersonalInfoAction extends DispatchAction {
	FERService ferService = new FERServiceImpl();
	private final static String UPDATEPERSONALNAME = "UpdatePersonalName";
	private final static String UPDATEPERSONALCONTACT = "UpdatePersonalContact";

	public ActionForward nameInfo(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();
		FERService ferService = new FERServiceImpl();
		String username = session.getAttribute("username").toString();

		PersonalInfo personalInfo = ferService.getPersonalInfo(username);
		session.setAttribute("personalInfo", personalInfo);

		return mapping.findForward(UPDATEPERSONALNAME);
	}

	public ActionForward contactInfo(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		PersonalInfo personalInfo = (PersonalInfo) session.getAttribute("personalInfo");

		personalInfo.getUser().setFirstName(request.getParameter("firstName"));
		personalInfo.getUser().setMiddleName(request.getParameter("middleName"));
		personalInfo.getUser().setLastName(request.getParameter("lastName"));

		return mapping.findForward(UPDATEPERSONALCONTACT);
	}

	public ActionForward addressInfo(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		PersonalInfo personalInfo = (PersonalInfo) session.getAttribute("personalInfo");
		personalInfo.getUser().setEmail(request.getParameter("email"));
		personalInfo.getUser().setPhone(request.getParameter("phone"));

		return mapping.findForward("AddressInfo");
	}

	public ActionForward review(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		PersonalInfo personalInfo = (PersonalInfo) session.getAttribute("personalInfo");
		personalInfo.getAddress().setCountry(request.getParameter("country"));
		personalInfo.getAddress().setState(request.getParameter("state"));
		personalInfo.getAddress().setDistric(request.getParameter("distric"));
		personalInfo.getAddress().setMandal(request.getParameter("mandal"));
		personalInfo.getAddress().setZip(request.getParameter("zip"));
		
	
		

		return mapping.findForward("ReviewPersonalInfo");
	}

	public ActionForward personalInfoStatus(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		FERService ferService = new FERServiceImpl();
		HttpSession session = request.getSession();

		PersonalInfo personalInfo = (PersonalInfo) session.getAttribute("personalInfo");
		//boolean updateFlag = ferService.getUpdatePersonalInfo();

		return mapping.findForward("UpdatePersonalInfoStatus");

	}

}
