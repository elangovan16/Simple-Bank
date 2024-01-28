package com.elangovan16.bank.repository;

import java.util.HashMap;
import java.util.Map;

import com.elangovan16.bank.dto.Customer;

public class BankRepository {
	private static BankRepository repository;
	private Map<Integer, Customer> customers = new HashMap<>();

	private BankRepository() {

	}

	public static BankRepository getInstance() {
		if (repository == null) {
			repository = new BankRepository();
		}
		return repository;
	}

	public Map<Integer, Customer> getCustomers() {
		return customers;
	}

	public void addCustomers(Customer cus) {
		customers.put(cus.getCustomerId(), cus);
	}

	public Customer getCustomer(int id) {
		Customer cus = null;
		if (customers.containsKey(id)) {
			cus = customers.get(id);
		}
		return cus;
	}

}
