package com.rs.fer.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class ResetPasswordForm extends ActionForm {
	private String currentPassword;
	private String newPassword;
	private String confirmPassword;

	public String getCurrentPassword() {
		return currentPassword;
	}

	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if (currentPassword == null || currentPassword.length() < 1) {
			errors.add("currentPassword", new ActionMessage("error.currentPasword.required"));
		}
		if (newPassword == null || newPassword.length() < 1) {
			errors.add("newPassword", new ActionMessage("error.newPasword.required"));
		}
		if (confirmPassword == null || confirmPassword.length() < 1) {
			errors.add("confirmPassword", new ActionMessage("error.confirmPassword.required"));
		}
		return errors;
	}

}
