package com.elangovan16.bank.util;

import java.util.Scanner;

public class Get {
	static Scanner sc = new Scanner(System.in);
	static int id = 10000000;

	public static int getId() {
		id = id + 1;
		return id;
	}

	public static int getInt() {
		int n;
		while (true) {
			if (sc.hasNextInt()) {
				n = sc.nextInt();
				sc.nextLine();
				return n;
			}
			sc.nextLine();
			System.err.print("Enter a Number : ");
		}
	}
}
