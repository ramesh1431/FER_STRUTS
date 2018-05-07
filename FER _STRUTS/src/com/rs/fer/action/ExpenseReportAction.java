package com.rs.fer.action;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.rs.fer.bean.Expense;
import com.rs.fer.form.ExpenseReportForm;
import com.rs.fer.service.FERService;
import com.rs.fer.service.FERServiceImpl;

public class ExpenseReportAction  extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		FERService ferService = new FERServiceImpl();
		ExpenseReportForm expensereportForm = (ExpenseReportForm) form;
		String expenseType = expensereportForm.getExpenseType();
		String fromDate = expensereportForm.getFromDate();
		String toDate = expensereportForm.getToDate();
		DataSource datasource=getDataSource(request, "FER _STRUTS");
		Connection connection=datasource.getConnection();
		List<Expense> expenasereportFlag = ferService.getExpenseReport(expenseType, fromDate, toDate,connection);
		HttpSession session = request.getSession();
         session.setAttribute("expenasereportFlag",expenasereportFlag);
		if (expenasereportFlag != null) {
			return mapping.findForward("Success");
		} else {
			return mapping.findForward("failure");

		}

	}


}
