import java.util.Scanner;

public class LoopPractice2 {

	public static void main(String[] args) {
		
		
		// First, determine our random number between 1 and 10
		int max = 10;
		int min = 1;
		int random = (int )(Math.random() * 10 + 1);
		
		
		System.out.println("Pick a number between 1 and 10");
		Scanner input = new Scanner(System.in);
		int userGuess = input.nextInt();
		
		int nbrTries = 1;
		while (userGuess != random) {
			System.out.println("Sorry - wrong guess #" + nbrTries + " guess again!");
			userGuess = input.nextInt();
			nbrTries++;
		}
		System.out.println("Yay!  You guessed the correct number " + random + " in " + nbrTries + " tries");
		
	}

}
