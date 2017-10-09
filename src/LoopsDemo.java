import java.util.Scanner;

public class LoopsDemo {

	public static void main(String[] args) {
		int count = 1;
		while (count < 11) {
			System.out.println("The count is " + count);
			count++;
		}
		System.out.println("after loop, count is " + count);
		
		
		Scanner input = new Scanner(System.in);
		String porridgeTemp;
		
		do {
			System.out.println("Please specify porridge temp.");
			System.out.println("Type \"help\" to list options.");
			porridgeTemp = input.nextLine();
			
			if (porridgeTemp.equals("help")) {
				System.out.println("Options: too hot, too cold, just right");
			}
		} while (porridgeTemp.equals("help"));
			
		System.out.println("Finished first do while loop **************************************************");
			
		// now do this with a while loop
		System.out.println("Please specify porridge temp.");
		System.out.println("Type \"help\" to list options.");
		
		porridgeTemp = input.nextLine();
		while (porridgeTemp.equals("help")) {
			System.out.println("Options: too hot, too cold, just right");
			porridgeTemp = input.nextLine();
		}
		System.out.println("out of the loop");
		
		
	}

}
