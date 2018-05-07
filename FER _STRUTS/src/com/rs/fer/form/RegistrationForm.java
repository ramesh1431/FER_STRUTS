package com.rs.fer.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class RegistrationForm extends ActionForm {
	private static final long seriolVersionUID=1L;

	private String firstname;
	public String middlename;
	public String lastname;
	public String email;
	public String phone;
	public String username;
	public String password;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
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
	public static long getSeriolversionuid() {
		return seriolVersionUID;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {

		ActionErrors errors = new ActionErrors();
		System.out.println("into validate");
		if (firstname == null || firstname.length() < 1) {
			errors.add("firstName", new ActionMessage("msg1"));
		}
		if (middlename == null || middlename.length() < 1) {
			errors.add("middleName", new ActionMessage("msg2"));
		}
		if(lastname==null || lastname.length()<1){
			errors.add("middleName", new ActionMessage("msg3"));
		}

		if (email == null || email.length() < 1) {
			errors.add("email", new ActionMessage("msg4"));
		}

		if (phone.matches("[789][0-9]{9}")) {
			errors.add("phone", new ActionMessage("msg5"));
		}

		if (username == null || username.length() < 1) {
			errors.add("username", new ActionMessage("msg6"));
		}

		if (password == null || password.length() < 1) {
			errors.add("password", new ActionMessage("msg7"));
		}

		return errors;

	}
}
