package com.elangovan16.bank.view;

import java.util.Scanner;

import com.elangovan16.bank.dto.Customer;
import com.elangovan16.bank.util.Get;
import com.elangovan16.bank.viewmodel.CreateAccountViewModel;

public class CreateAccountView {
	Scanner sc = new Scanner(System.in);
	private CreateAccountViewModel createAccountViewModel;
	static String green = "\u001b[32m"; // green ANSI
	static String reset = "\u001b[0m";

	public CreateAccountView() {
		createAccountViewModel = new CreateAccountViewModel(this);
	}

	public void createAccount() {
		Customer cus = new Customer();
		System.out.print("Enter Your Name : ");
		String name = sc.nextLine();
		System.out.print("Initial deposit Money : ");
		int money = sc.nextInt();
		sc.nextLine();
		int id = Get.getId();
		System.out.println(green + "Account Created" + reset);
		System.out.println("+-------------------------------");
		System.out.println("| Name        : " + name);
		System.out.println("| CustomerId  : " + id);
		System.out.println("| Balance     : " + money);
		System.out.println("+-------------------------------");
		cus.setCustomerName(name);
		cus.setBalance(money);
		cus.setCustomerId(id);
		cus.setTransaction("Initial Deposited : " + money);
		createAccountViewModel.createAccount(cus);
	}

}
