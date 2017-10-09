import java.util.Scanner;

public class RunningSum {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		int number = input.nextInt();
		
		int count = 1;
		int sum = 0;
		
		while (count <= number) {
			sum += count;
			count++;
		}
		input.close();
		
		System.out.println(sum);
		
		

	}

}
