package com.elangovan16.bank.view;

import java.util.List;

import com.elangovan16.bank.dto.Customer;
import com.elangovan16.bank.util.Get;
import com.elangovan16.bank.viewmodel.LoginViewModel;

public class LoginView {
	private LoginViewModel loginViewModel;
	static String green = "\u001b[32m"; // green ANSI
	static String reset = "\u001b[0m";

	public LoginView() {
		loginViewModel = new LoginViewModel(this);
	}

	public void login() {
		boolean flag = false;
		Customer cus = validateLogIn();
		if (cus == null) {
			System.out.println("Sorry Customer Not Found");
		} else {
			flag = true;
			System.out.println("WelCome " + cus.getCustomerName());
		}
		while (flag) {
			info();
			int choice = Get.getInt();
			switch (choice) {
			case 0 -> {
				System.exit(0);
			}
			case 1 -> {
				System.out.println("......................");
				System.out.println("Balance = " + cus.getBalance());
				System.out.println("......................");
				System.out.println();
			}
			case 2 -> {
				System.out.println("......................");
				System.out.println("Enter a amount to deposit : ");
				System.out.println("......................");
				int n = Get.getInt();
				loginViewModel.deposit(cus, n);
				System.out.println();
			}
			case 3 -> {
				System.out.println("......................");
				System.out.println("Enter a amount to Withdraw :");
				System.out.println("......................");
				int amtW = Get.getInt();
				loginViewModel.withdraw(cus, amtW);
				System.out.println();
			}
			case 4 -> {
				System.out.println("...........................");
				System.out.println("|  Previous Transactions  |");
				System.out.println("...........................");
				List<String> Transactions = cus.getTransaction();
				for (int i = Transactions.size() - 1; i >= 0; i--) {
					System.out.println(Transactions.get(i));
				}
				System.out.println("......................");
				System.out.println();
			}
			default -> {
				System.err.println("In-Valid Input...");
			}
			}
		}
	}

	private void info() {
		System.out.println("+----------------------------+");
		System.out.println("|  1) Check Balance          |");
		System.out.println("|  2) Deposit Amount         |");
		System.out.println("|  3) Withdraw Amount        |");
		System.out.println("|  4) Previous Transactions  |");
		System.out.println("|  0) Exit ...               |");
		System.out.println("+----------------------------+");
		System.out.print("--->Enter Choice : ");
	}

	private Customer validateLogIn() {
		System.out.print("Enter CustomerId : ");
		int id = Get.getInt();
		Customer cus = loginViewModel.getCustomer(id);
		return cus;
	}

	public void SuccessMSG(String s) {
		System.out.println(green + s + reset);
	}

	public void errMSG(String e) {
		System.err.println(e);
	}

}
