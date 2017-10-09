import java.util.Scanner;

public class CountItUpEvens {

	public static void main(String[] args) {
	
		System.out.println("Enter a number:");
		Scanner input = new Scanner(System.in);
		
		int inputNbr = input.nextInt();
		int nbrEvens = 0;
		
		int index = 0;
		while (index <= inputNbr) {
			if (index%2 == 0) {
				System.out.print(index + " ");
				nbrEvens++;
			}
			index++;
		}
		
		System.out.println("\nI found " + nbrEvens + " even numbers");
		

	}

}
