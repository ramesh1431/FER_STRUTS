package com.rs.fer.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AddressForm extends ActionForm {

	public int id;
	public String country;
	public String state;
	public String mandal;
	public String distric;
	public String zip;
	public String userid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMandal() {
		return mandal;
	}
	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	public String getDistric() {
		return distric;
	}
	public void setDistric(String distric) {
		this.distric = distric;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if (country == null || country.length() < 1) {
			errors.add("addressline1", new ActionMessage("error.addressline1.required"));
		}
		if (state == null || state.length() < 1) {
			errors.add("addressline2", new ActionMessage("error.addressline2.required"));
		}
		if (mandal == null || mandal.length() < 1) {
			errors.add("city", new ActionMessage("error.city.required"));
		}
		if (distric == null || distric.length() < 1) {
			errors.add("state", new ActionMessage("error.state.required"));
		}
		
		if (zip == null || zip.length() < 1) {
			errors.add("zip", new ActionMessage("error.zip.required"));
		}
		return super.validate(mapping, request);
	}
}
