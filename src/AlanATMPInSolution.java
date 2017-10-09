import java.util.Scanner;

public class AlanATMPInSolution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pin = 1234;

		System.out.println("Enter a pin");
		int pinEntered = input.nextInt();

		int count = 1;
		while (pinEntered != pin && count < 3) {
			System.out.println("invalid pin try again");
			pinEntered = input.nextInt();
			count++;

		}
		input.close();

		if (pinEntered != pin) {
			System.out.println("sorry too many attempts");

		} else {
			System.out.println("congrats");
		}

	}

}
