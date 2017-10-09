import java.util.Scanner;

public class ForLoopPracticeFindMinMax {

	public static void main(String[] args) {

		System.out.println("You will be prompted to enter 5 numbers and I will find the max and min");
		Scanner input = new Scanner(System.in);
		int min = 0;
		int max = 0;
		int userInt;

		for (int i = 0; i < 5; i++) {
			System.out.println("enter an integer: ");
			userInt = input.nextInt();
			if (i == 0) {
				min = userInt;
				max = userInt;
			} else {
				if (userInt > max) {
					max = userInt;
				} else if (userInt < min) {
					min = userInt;
				}
			}
		}
		System.out.println("min is " + min + " max is " + max);
	}
}
