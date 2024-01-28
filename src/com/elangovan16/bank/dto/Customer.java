package com.elangovan16.bank.dto;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String customerName;
	private int balance;
	private int customerId;
	private List<String> transaction;

	public Customer() {
		this.transaction = new ArrayList<>();
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public List<String> getTransaction() {
		return transaction;
	}

	public void setTransaction(String s) {
		transaction.add(s);
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
