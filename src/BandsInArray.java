import java.util.Scanner;

public class BandsInArray {

	public static void main(String[] args) {

		String bands[] = new String[5];
		Scanner input = new Scanner(System.in);

		System.out.println("We would like to know your 5 favorite bands!");
		for (int i = 0; i < bands.length; i++) {
			System.out.println("enter band # " + (i + 1));
			bands[i] = input.nextLine();
		}

		for (int i = bands.length-1; i >= 0; i--) {
			System.out.println("Band " + (i + 1) + " is " + bands[i]);
		}

	}

}
