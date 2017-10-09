
public class SpringXplosion {

	public static void main(String[] args) {
		String result = stringSplosion("code");

	}
	public static String stringSplosion(String str) {
		  int length = str.length();
		  String result = "";
		  for (int i = 0; i < length; i++) {
		    result += str.substring(0, i+1);
		    System.out.println("i is " + i);
		    System.out.println("result is " + result);
		    
		  }
		  
		  return result;
		  
		  
		  
		}

}
