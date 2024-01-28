package com.elangovan16.bank.view;

import com.elangovan16.bank.util.Get;
import com.elangovan16.bank.viewmodel.BankViewModel;

public class BankView {
	private BankViewModel bankViewModel;

	public BankView() {
		bankViewModel = new BankViewModel(this);
	}

	public void start() {
		boolean flag = true;
		do {
			info();
			int choice = Get.getInt();
			switch (choice) {
			case 1 -> {
				LoginView login = new LoginView();
				login.login();
			}
			case 2 -> {
				CreateAccountView account = new CreateAccountView();
				account.createAccount();
			}
			case 0 -> {
				flag = false;
			}
			default -> {
				System.err.println("Invalid Input...");
			}
			}
		} while (flag);
	}

	public void info() {
		System.out.println("+----------------------+");
		System.out.println("|  1) Login            |");
		System.out.println("|  2) CreateAccount    |");
		System.out.println("|  3) Exit..           |");
		System.out.println("+----------------------+");
		System.out.print("--->Enter Choice : ");
	}

}
