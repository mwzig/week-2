import java.util.Scanner;

public class InputNbtAddToIt {

	public static void main(String[] args) {
		
		System.out.println("Enter an integer");
		Scanner input = new Scanner(System.in);
		int userNbr = input.nextInt();
		
		int count = 1;
		int sum =  0;
		while (count < userNbr) {
			System.out.println("the count is " + count);
			sum += count;
		}

	}

}
