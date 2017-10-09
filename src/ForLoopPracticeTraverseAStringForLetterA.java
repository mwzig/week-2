import java.util.Scanner;

public class ForLoopPracticeTraverseAStringForLetterA {

	public static void main(String[] args) {
		
		System.out.println("Enter a name: ");
		Scanner input = new Scanner(System.in);
		String nameToParse = input.nextLine();
		String nameToParseLC = nameToParse.toLowerCase();
		
		int nbrOfA = 0;
		int nameLength = nameToParse.length();
		for (int i = 0; i < nameLength; i++) {
			if (nameToParseLC.charAt(i) == 'a') {
				nbrOfA++;
			}
		}
		
		System.out.println("There are " + nbrOfA + " a's in " + nameToParse);

	}

}
