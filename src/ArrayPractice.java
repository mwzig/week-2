import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPeople();
		printGPAs();
		printVacaSpots();
		printNbrLettersInName();
	}
	public static void printPeople() {
		String names[] = {"Mary", "Sarah", "Mori"};
		
		for (int i=0; i < names.length; i++) {
			System.out.println("name " + i + " is " + names[i]);
		}
	}
	
	public static void printGPAs() {
		double [] gpaArray = {4, 3.7, 2.9, 1.2};
		
		for (int i=0; i < gpaArray.length; i++) {
			System.out.println("gpa " + i + " is " + gpaArray[i]);
		}
	}
	
	public static void printVacaSpots() {
		
		String[] vacaSpots = {"Bar Harbour", "Myrtle Beach" , "Grand Tetons", "Sedona"};
		
		System.out.println("The first vacation spot in the list is " + vacaSpots[0]);
		System.out.println("The last vacation spot in the list is " + vacaSpots[vacaSpots.length -1]);
		
		// search the array and give feedback on if Mary's favorite vaca spot of
		// Bar Harbour is in the array or not.
		
		
		for (int i = 0; i < vacaSpots.length; i++) {
			System.out.println("the spot is " + vacaSpots[i]);
			if (vacaSpots[i].equals("Bar Harbour")) {
				System.out.println("hey, your fav is there!");
			}
		}
		
	}
	
	public static void printNbrLettersInName() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your last name");
		String lName = input.nextLine();
		
		char[] letters = lName.toCharArray();
		
		System.out.println("the first letter is " + letters[0]);
		System.out.println("the last letter is " + letters[letters.length-1]);
		System.out.println("there are " + letters.length + " letters in your last name."
				+ "");
		
	}
	
	
}
