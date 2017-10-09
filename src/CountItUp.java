import java.util.Scanner;

public class CountItUp {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner input = new Scanner(System.in);
		
		int inputNbr = input.nextInt();
		
		int count = 0;
		while (count <= inputNbr) {
			System.out.print(count);
			count++;
		}

		System.out.println("\nI just counted to " + inputNbr);
		input.close();
		
		
		
	}

}
