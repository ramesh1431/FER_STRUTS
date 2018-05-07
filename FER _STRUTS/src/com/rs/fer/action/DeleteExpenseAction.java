package com.rs.fer.action;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.rs.fer.bean.Expense;
import com.rs.fer.service.FERService;
import com.rs.fer.service.FERServiceImpl;

public class DeleteExpenseAction extends DispatchAction {

	public ActionForward deleteExpenseDropdown(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		FERService ferService = new FERServiceImpl();
		List<Expense> expenses = ferService.getExpenses();
		session.setAttribute("expenses", expenses);
		return mapping.findForward("DeleteExpense");

	}

	public ActionForward deleteExpenseStatus(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();
		String idobj = request.getParameter("id");
		FERService ferService = new FERServiceImpl();
		int id = Integer.parseInt(idobj);
		DataSource datasource=getDataSource(request, "FER _STRUTS");
		Connection connection =datasource.getConnection();
		boolean deleteExpense = ferService.deleteExpense(id,connection);
		session.setAttribute("deleteExpense", deleteExpense);
		return mapping.findForward("deleteExpenseStatus");

	}


}
