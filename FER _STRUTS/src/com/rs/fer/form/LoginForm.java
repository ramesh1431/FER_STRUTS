package com.rs.fer.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginForm extends ActionForm {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}



	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if (username==null || username.length()< 1) {
			errors.add("username", new ActionMessage("error.userName.required"));
		}
		if (password == null || password.length() < 1) {
			errors.add("password", new ActionMessage("error.password.required"));
		}
		return errors;
	}


	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.username="enter username";
		this.password="enter password";
	}

}

