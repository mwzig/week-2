package alanatm;

import java.util.Scanner;

public class atmClient {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Atm account = new Atm("1234", 100.00);

		System.out.println("Enter your PIN: ");
		String enteredPin = input.nextLine();

		while (!account.allowAccess(enteredPin)) {
			System.out.println("Invalid! Try again: ");
			enteredPin = input.nextLine();
		}

		System.out.println("Welcome to Bank of We Can Code IT!");
		String choice;
		do {
			System.out.println("Choose an option.");
			System.out.println("Press 1 to deposit funds.");
			System.out.println("Press 2 to withdrawal funds.");
			System.out.println("Press 3 to check balance.");
			System.out.println("Press 4 to exit.");
			choice = input.nextLine();

			if (choice.equals("1")) {
				System.out.println("Enter a deposit amount");
				double depositAmount = input.nextDouble();
				input.nextLine();
				account.makeDeposit(depositAmount);
			} else if (choice.equals("2")) {
				System.out.println("Enter a withdrawal amount");
				double withdrawAmount = input.nextDouble();
				input.nextLine();
				account.makeWithdraw(withdrawAmount);
			} else if (choice.equals("3")) {
				System.out.println("Your balance is " + account.getBalance());
			} else if (choice.equals("4")){
				System.out.println("Goodbye");
				break;	
			}
			System.out.println("What else would you like to do?");
		} while (!choice.equals("4"));
		
	}
}
