package atm2;

import java.util.Locale;
import java.util.Scanner;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class AtmClientApp {

	public static void main(String[] args) {

		// First, construct an ATM object and a Scanner object
		// if you call the myATM constructor with a double, it loses some accuracy
		// Use a long value after the decimal here to show how rounding works.
		Atm myATM2 = new Atm("7777", "1115.375923");
		Scanner input = new Scanner(System.in);

		// Next, prompt the user to enter his/her PIN
		System.out.println("Welcome to the Bank of WCCI!");
		System.out.println("Please enter your PIN: ");
		String inputPIN2 = input.nextLine();

		// Give the user 3 tries to enter the correct PIN
		// If it is correctly entered, continue, otherwise exit the program.
		int nbrTries = 1;
		boolean bTriesRemaining = true;
		boolean bValidPIN = myATM2.allowAccess(inputPIN2);
		while (!bValidPIN && bTriesRemaining) {
			if (nbrTries >= 3) {
				bTriesRemaining = false;
			} else {
				System.out.println("InValid PIN, try again!");
				inputPIN2 = input.nextLine();
				bValidPIN = myATM2.allowAccess(inputPIN2);
				nbrTries++;
			}
		}

		if (!bValidPIN) {
			System.out.println("Invalid security information.  Please contact customer service for assistance.");
			System.exit(0);
		} else {
			System.out.println("Valid PIN!");
		}

		
		String inputChoice;
		do {
			System.out.println("Please select from the following WCCI Banking Options:");
			System.out.println("Press 1 to deposit funds");
			System.out.println("Press 2 to withdraw funds");
			System.out.println("Press 3 to show your balance");
			System.out.println("Press 4 to exit");

			inputChoice = input.nextLine();
			switch (inputChoice) {
			case "1":
				System.out.println("Enter deposit amount: ");
				String depAmount = input.nextLine();
				System.out.println(
						"After depositing " + depAmount + " your new " + "balance is " + myATM2.deposit(depAmount));
				break;
			case "2":
				System.out.println("Enter withdraw amount: ");
				String withdrawAmount = input.nextLine();
				System.out.println("After withdrawing " + withdrawAmount + " your new " + "balance is "
						+ myATM2.withdraw(withdrawAmount));
				break;
			case "3":
				System.out.println("Your balance is	" + formatBalance(myATM2.getBalance()));
				break;

			case "4":
				System.out.println("Goodbye");
				break;
			}
			// } while (!input.nextLine().equals("4"));
		} while (!inputChoice.equals("4"));
		input.close();
	}

	public static String formatBalance(BigDecimal bal) {
		System.out.println("\tBigDecimal bal is " + bal);
		bal = bal.setScale(2, BigDecimal.ROUND_HALF_UP);
		System.out.println("\tUnformatted: with 2 decimals and rounding " + bal.toString());
		NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
		double money = bal.doubleValue();
		String s = n.format(money);
		System.out.println("\tFormatted: " + s);
		return s;
	}

}
