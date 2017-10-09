import java.util.Scanner;

public class ForLoopPracticeFindMinMaxByAlan {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i=1; i<=5; i++) {
			System.out.println("enter an integer");
			int number = input.nextInt();
			
			if (number<min) {
				min = number;
			}
			if (number>max) {
				max = number;
			}
		}
		System.out.println("min is " + min);
		System.out.println("max is " + max);
	}

}
