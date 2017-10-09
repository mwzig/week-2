import java.util.Scanner;


public class ForLoopPracticePrintNameBackwards {

	public static void main(String[] args) {
		
		System.out.println("Enter a name: ");
		Scanner input = new Scanner(System.in);
		
		String name = input.nextLine();
		
		for (int i = (name.length() - 1) ; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
		
	}

}
