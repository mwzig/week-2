package atm;

import java.util.Scanner;
import java.math.BigDecimal;

public class AtmClientApp {

	public static void main(String[] args) {

		// logic using the basic constructor
		Scanner input = new Scanner(System.in);
		Atm myATM = new Atm();

		System.out.println("Please enter your PIN: ");
		String inputPIN = input.nextLine();

		while (!myATM.allowAccess(inputPIN)) {
			System.out.println("InValid PIN, try again!");
			inputPIN = input.nextLine();
		}

		System.out.println("Your PIN is valid..");

		// logic using the constructor that takes data
		System.out.println("(With constructor - Please enter your PIN: ");
		String inputPIN2 = input.nextLine();
		Atm myATM2 = new Atm("7777", 10.50);

		while (!myATM2.allowAccess(inputPIN2)) {
			System.out.println("InValid PIN, try again!");
			inputPIN2 = input.nextLine();
		}
		System.out.println("Your PIN is valid..");

		// logic using the constructor that takes BigDecimal
		
		Atm myATM3 = new Atm("7777", 10.50, 11.50);

		System.out.println("Welcome to the Bank of WCCI!");

		String inputChoice;
		do {
			System.out.println("Press 1 to deposit funds");
			System.out.println("Press 2 to withdraw funds");
			System.out.println("Press 3 to show your balance");
			System.out.println("Press 4 to exit");

			inputChoice = input.nextLine();
			switch (inputChoice) {
			case "1":
				System.out.println("Enter deposit amount: ");
				double depAmount = input.nextDouble();
				System.out.println(
						"After depositing " + depAmount + " your new " + "balance is " + myATM.deposit(depAmount));
				break;
			case "2":
				System.out.println("Enter withdraw amount: ");
				double withdrawAmount = input.nextDouble();
				System.out.println("After withdrawing " + withdrawAmount + " your new " + "balance is "
						+ myATM.withdraw(withdrawAmount));
				break;
			case "3":
				System.out.println("Your balance is	" + myATM.getBalance());
				break;

			case "4":
				System.out.println("Goodbye");
				break;
			}
			 } while (!input.nextLine().equals("4"));
		//} //while (!inputChoice.equals("4"));
	}

}
