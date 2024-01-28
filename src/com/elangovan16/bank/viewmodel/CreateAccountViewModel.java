package com.elangovan16.bank.viewmodel;

import com.elangovan16.bank.dto.Customer;
import com.elangovan16.bank.repository.BankRepository;
import com.elangovan16.bank.view.CreateAccountView;

public class CreateAccountViewModel {
	private CreateAccountView createAccountView;

	public CreateAccountViewModel(CreateAccountView createAccountView) {
		this.createAccountView = createAccountView;
	}

	public void createAccount(Customer cus) {
		BankRepository.getInstance().addCustomers(cus);
	}
}
