package com.rs.fer.action;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.rs.fer.form.ResetPasswordForm;
import com.rs.fer.service.FERService;
import com.rs.fer.service.FERServiceImpl;

public class ResetPasswordAction extends Action {
	 private final static String ResetSuccess = "success";
	 private final static String Resetfail = "failure";

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		FERService ferService = new FERServiceImpl();
		ResetPasswordForm resetPasswordForm = (ResetPasswordForm) form;
		HttpSession session = request.getSession();
		String username = session.getAttribute("username").toString();
		String currentPassword = resetPasswordForm.getCurrentPassword();
		String newPassword = resetPasswordForm.getNewPassword();
		String confirmPassword = resetPasswordForm.getConfirmPassword();
		DataSource datasource=getDataSource(request, "FER _STRUTS");
		Connection connection =datasource.getConnection();
		boolean resetPasswordFlag = ferService.resetPassword(username, currentPassword, confirmPassword,connection);
		if (resetPasswordFlag) {
			return mapping.findForward("success");
		} else {
			return mapping.findForward("failure");

		}
	}
}
