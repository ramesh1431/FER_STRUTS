package com.rs.fer.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AddExpenseForm extends ActionForm {

	
	private int Id;
	private String expensetype;
	private String date;
	private String price;
	private String numberofitems;
	private String total;
	private String bywhom;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getExpensetype() {
		return expensetype;
	}
	public void setExpensetype(String expensetype) {
		this.expensetype = expensetype;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getNumberofitems() {
		return numberofitems;
	}
	public void setNumberofitems(String numberofitems) {
		this.numberofitems = numberofitems;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getBywhom() {
		return bywhom;
	}
	public void setBywhom(String bywhom) {
		this.bywhom = bywhom;
	}
	

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		
		ActionErrors Errors = new ActionErrors();
		/*if (expensetype == null || expensetype.length() < 1) {
			Errors.add("expenseType", new ActionMessage("error.expensetype.required"));
		}
		if (date == null || date.length() < 1) {
			Errors.add("date", new ActionMessage("error.date.required"));
		}

		if (price == null || price.length() < 1) {
			Errors.add("price", new ActionMessage("error.price.required"));
		}*/

		if (numberofitems.matches("^[234]")) {
			Errors.add("numberofitems", new ActionMessage("md"));
		}

		/*if (total == null || total.length() < 1) {
			Errors.add("totalamount", new ActionMessage("error.totalamount.required"));
		}

		if (bywhom == null || bywhom.length() < 1) {
			Errors.add("bywhom", new ActionMessage("error.bywhom.required"));
		}*/

	
		return Errors;
	}
}



	

	