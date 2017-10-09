import java.util.Scanner;

public class ATMPinCheck2 {

	public static void main(String[] args) {

		int savedPin = 5001;
		int nbrTries = 0;
		int pinNbr = 0; 
		
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your 4-digit pin number");
		
		pinNbr = input.nextInt();
		nbrTries++;

		while ((pinNbr != savedPin) && (nbrTries < 3)) {
			System.out.println("Invalid pin number. Please try again.");
			pinNbr = input.nextInt();
			nbrTries++;
		}
		
		if (pinNbr == savedPin) {
			System.out.println("Correct pin number entered!");
		} else {
			System.out.println("Incorrect pin and you are out of tries");
		}
	}
}
