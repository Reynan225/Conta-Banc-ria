package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account acc;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();

		while (true) {

			System.out.print("Is there na initial deposit (y/n)? ");
			char option = sc.next().charAt(0);
			option = Character.toLowerCase(option);
			
			if (option == 'y') {

				System.out.print("Enter initial deposit value: ");
				double balance = sc.nextDouble();

				acc = new Account(number, holder, balance);
				break;

			} else if (option == 'n') {

				acc = new Account(number, holder);
				break;

			} else {
				System.out.println("Invalid option, please try again!\n");
			}

		}

		System.out.println("\nAccount data:\n" + acc);

		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		acc.deposit(amount);

		System.out.println("\nUpdated account data:\n" + acc);

		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		acc.withdraw(amount);
		System.out.println("Updated account data:\n" + acc);
		sc.close();
	}

}