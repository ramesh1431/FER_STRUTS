package com.rs.fer.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class ExpenseReportForm  extends ActionForm {

	private String expensetype;
	private String fromDate;
	private String toDate;

	public String getExpenseType() {
		return expensetype;
	}

	public void setExpenseType(String expenseType) {
		this.expensetype = expenseType;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();

		if (expensetype == null || expensetype.length() < 1) {
			errors.add("expensetype", new ActionMessage("error.expensetype.required"));
		}
		if (fromDate == null || fromDate.length() < 1) {
			errors.add("fromDate", new ActionMessage("error.fromDate.required"));
		}
		if (toDate == null || toDate.length() < 1) {
			errors.add("toDate", new ActionMessage("error.toDate.required"));
		}
		return errors;
}


}
