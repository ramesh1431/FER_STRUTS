package com.rs.fer.service;

import java.sql.Connection;
import java.util.List;

import com.rs.fer.bean.Address;
import com.rs.fer.bean.Expense;
import com.rs.fer.bean.PersonalInfo;
import com.rs.fer.bean.User;

public interface FERService {
	boolean registration(User user,Connection connection);

	boolean addExpense(Expense expense);

	boolean deleteExpense(int expenseid,Connection connection);

	boolean editExpense(Expense expense);

	Expense getExpense(int expenseId);
	

	List<Expense> getExpenseReport(String expensetype, String fromdate, String todate,Connection connection);

	List<Expense> getExpenses();

	boolean resetPassword(String username, String oldpassword, String newpassword,Connection connection);

	PersonalInfo getPersonalInfo(String username);

	boolean updatePersonalInfo(User user, Address address);

	boolean Login(String username, String password, Connection connection);

	// boolean deleteExpense(int expenseId);

}
