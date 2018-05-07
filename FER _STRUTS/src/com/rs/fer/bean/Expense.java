package com.rs.fer.bean;

public class Expense {

	private int id;
	private String expensetype;
	private String date;
	private String price;
	private String numberofitems;
	private String total;
	private String bywhom;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public void setPrice(String string) {
		this.price = string;
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
	
}