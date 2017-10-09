import java.util.Scanner;

public class UserNameRevisited {

	public static void main(String[] args) {
		
		System.out.println("Enter a user name (min. 4 chars):");
		Scanner input = new Scanner (System.in);
		
		String userName = input.nextLine();
		
		while (userName.length() < 4) {
			System.out.println("not long enough! try again!");
			userName = input.nextLine();
		}

		System.out.println("Welcome " + userName + "!");
	}

}
