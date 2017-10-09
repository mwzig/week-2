import java.util.Random;
import java.util.Scanner;

public class AlanRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();

		int randNumber = generator.nextInt(10) + 1;
		
		
		System.out.println("Enter a number from 1-10");
		int guess = input.nextInt();
		int nbrGuesses = 1;
		
		System.out.println("the number to guess is " + randNumber);
		
		while ((nbrGuesses < 3) && (guess != randNumber)) {
			System.out.println("Try again!");
			if (guess > randNumber) {
				System.out.println("Your number is too high ");
			} else {
				System.out.println("Your number is too low ");
			}
			nbrGuesses++;
			guess = input.nextInt();
			
		}

		if (guess == randNumber) {
			System.out.println("You guessed it!  The number is " + randNumber);
		}
		else {
			System.out.println("You tried 3 times and missed!  The number is " + randNumber);
		}
		

	}

}
