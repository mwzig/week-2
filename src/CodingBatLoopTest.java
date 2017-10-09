import java.util.Scanner;

public class CodingBatLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a string");
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		System.out.println("Enter an integer");
		int nbrTimesToConcat = input.nextInt();
		
		String returnString = stringTimes(inputString, nbrTimesToConcat);
		System.out.println(returnString);
		

		
	}
	public static String stringTimes(String str, int n) {
		  
		  String multsOfInput = "";
		  String result = "";
		  
		  System.out.println("The input string is " + str);
		  System.out.println("The number input is " + n);
		  
		  for (int i = 0; i < n; i++) {
			System.out.println("in the loop");
		    result = result.concat(str);
		    System.out.println(" the str is " + str);
		    System.out.println("n is " + n);
		    System.out.println("result  is " + result);
		    	
		    
		  }
		  
		  System.out.println("result is " + result);
		  return result;
		  
		}

}
