import java.util.Random;
import java.util.Scanner;

public class GuessTheBigTenMascot {

	public static void main(String[] args) {

		String[] teamList = { "Buckeyes", "Wolverines", "Nittany Lions", "CornHuskers", "Badgers", "Spartans",
				"Hawkeyes", "Hoosiers", "Golden Gophers", "Terrapins", "Wildcats", "Boilermakers" };

		// figure out which team name the user has to guess

		Random randomNbrGetr = new Random();
		int teamNbrToMatch = randomNbrGetr.nextInt(12);
		System.out.println("my random number is " + teamNbrToMatch);

		String teamNameToMatch = teamList[teamNbrToMatch];
		System.out.println("the random team to match is " + teamNameToMatch);

		int nbrGuesses = 1;
		System.out.println("Guess which Big 10 team I am thinking of - you get 4 tries");
		Scanner input = new Scanner(System.in);
		String userGuess = input.nextLine();

		while ( (nbrGuesses < 4) && (!userGuess.equalsIgnoreCase(teamNameToMatch)) ) {
			System.out.println("userGuess is " + userGuess.toLowerCase());
			System.out.println("team to match is " + teamNameToMatch.toLowerCase());
			System.out.println("nbr of guesses is " + nbrGuesses);
			System.out.println("Sorry, wrong guess, try again: ");
			userGuess = input.nextLine();
			nbrGuesses++;
		}

		if (userGuess.equalsIgnoreCase(teamNameToMatch)) {
			System.out.println("You guessed it!!!!!  Wooohooo");
		} else {
			System.out.println("Sorry, the correct team is " + teamNameToMatch);
		}

	}

}
