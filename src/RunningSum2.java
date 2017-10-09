import java.util.Scanner;

public class RunningSum2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter lower integer: ");
		int lowInt = input.nextInt();

		System.out.println("Enter higher integer: ");
		int highInt = input.nextInt();

		int sum = 0;

		while (highInt < lowInt) {
			System.out.println("Your high number is less than your low number.");
			System.out.println("Enter a new high number.");
			highInt = input.nextInt();
		}

		while (lowInt <= highInt) {
			sum += lowInt;
			lowInt++;
		}

		input.close();

		System.out.println(sum);

	}

}
