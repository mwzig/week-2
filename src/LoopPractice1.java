import java.util.Scanner;

public class LoopPractice1 {

	public static void main(String[] args) {
		System.out.println("Please enter a message, and I will repeat it back 5 times!");
		Scanner input = new Scanner(System.in);
		String userMsg = input.nextLine();
		
		
		int count = 0;
		while (count < 5) {
			System.out.println("Your message is \"" + userMsg + "\"");
			count++;
		}
	}
}
