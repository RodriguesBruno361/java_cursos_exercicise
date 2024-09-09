package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Account;

public class Main {
	public static void main(String[] args) {

		Account account;

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Enter holder name: ");
		String holder = sc.nextLine();

		System.out.print("Enter account number: ");
		int number = sc.nextInt();

		System.out.println("You will make an initial deposit (y/n)?");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.println("What is the deposit amount?");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}

		System.out.println("---------");
		System.out.println("Account data: ");
		System.out.println(account);
		System.out.println("---------");

		System.out.println("Enter with deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updating account ");
		System.out.println("Updated account!");
		System.out.println(account);
		System.out.println("---------");

		System.out.println("Enter a withdrawl amount: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updating account ");
		System.out.println("Updated account!");
		System.out.println(account);
		System.out.println("---------");

		sc.close();
	}
}
