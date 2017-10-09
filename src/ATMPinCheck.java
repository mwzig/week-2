import java.util.Scanner;

public class ATMPinCheck {

	public static void main(String[] args) {

		int savedPin = 5001;
		int nbrTries = 0;
		int pinNbr; 
		
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your 4-digit pin number");

		do {
			pinNbr = input.nextInt();
			nbrTries++;
			if (pinNbr == savedPin) {
				break;
			} else if (nbrTries < 3) {
				System.out.println("Invalid pin number. Please try again.");
			}
			System.out.println("nbrTries = " + nbrTries);
		} while (nbrTries < 3 );

		if (pinNbr == savedPin) {
			System.out.println("Correct pin number entered!");
		} else {
			System.out.println("Incorrect pin and you are out of tries");
		}
	}
}
