import java.util.Scanner;

public class ForLoopPracticeCountItUp {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int nbr = input.nextInt();
		
		for (int i = 0; i <= nbr; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\nI just counted to " + nbr);

	}

}
