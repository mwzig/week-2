import java.util.Scanner;

public class WorkItDay2ArrayPractice {

	public static void main(String[] args) {
		//printPeerNames();
		//printPeerNames2();
		// findTheLetter();
		splitTheString();
	}
	public static void printPeerNames() {
	
		String[] peerNames = {"Sarah", "Mary", "Michael", "Mary"};
		
		for (int i = 0; i<peerNames.length; i++) {
			System.out.println(peerNames[i].charAt(0));
		}
		
			
	}
	public static void printPeerNames2() {
		
		String[] peerNames = new String[4];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			System.out.println("enter a name: ");
			peerNames[i] = input.nextLine();
		}
		
		for (int i = 0; i<peerNames.length; i++) {
			System.out.println(peerNames[i].charAt(0));
		}
			
	}

public static void findTheLetter() {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = input.nextLine();
		System.out.println("Enter a letter to find in that word");
		String letterToFind = input.nextLine();
		
		int i = word.indexOf(letterToFind);
		System.out.println("the word is " + word);
		System.out.println("the letter is " + letterToFind);
		System.out.println("i is " + i);
		if (i >= 0) {
			System.out.println("your word " + word + " contains " + letterToFind);
		} else {
			System.out.println("your  " + word + "does not contain " + letterToFind);
		}
		
		
}
public static void splitTheString() {
	
	String stringToSplit = "What's the question? The answer is the answer.";	
	String[] parts = stringToSplit.split("\\?");
	//String[] elements = source.split(", ");

	System.out.println("the question is " + parts[0]);
	
		
}
}
