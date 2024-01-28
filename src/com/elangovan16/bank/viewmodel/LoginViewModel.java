package com.elangovan16.bank.viewmodel;

import com.elangovan16.bank.dto.Customer;
import com.elangovan16.bank.repository.BankRepository;
import com.elangovan16.bank.view.LoginView;

public class LoginViewModel {
	private LoginView loginView;

	public LoginViewModel(LoginView loginView) {
		this.loginView = loginView;
	}

	public Customer getCustomer(int id) {
		return BankRepository.getInstance().getCustomer(id);
	}

	public void deposit(Customer cus, int n) {
		if (n > 0) {
			int balance = cus.getBalance();
			cus.setTransaction("Deposited : " + balance + " + " + n + " = " + (balance + n));
			balance += n;
			cus.setBalance(balance);
			loginView.SuccessMSG("Deposite Successful");
		} else {
			loginView.errMSG("Deposite Fail");
		}
	}

	public void withdraw(Customer cus, int amt) {
		int balance = cus.getBalance();
		if (amt > 0 && cus.getBalance() >= amt) {
			cus.setTransaction("Withdrawn : " + balance + " - " + amt + " = " + (balance - amt));
			balance -= amt;
			cus.setBalance(balance);
			loginView.SuccessMSG("Withdrawn Successful");
		} else if (balance < amt) {
			loginView.errMSG("Bank balance insufficient");
		}
	}
}
