
public class DoubleX {

	public static void main(String[] args) {
		
		// this mimics codingbat - we are calling the method "doubleX" here
		// just like codingbat, so we have to pass it a parameter.
		// you could change the value of "abcxx" to "aaaaaa" or "bxxcc" and so on
		boolean result = doubleX("abcxx");
		System.out.println(result);
	}

	// this is really bad convoluted logic.  I am so sorry!
	public static boolean doubleX(String str) {

		int locationOfX = str.indexOf('x');
	
		// figure out if "x" is even in the string passed
		if (locationOfX >= 0) {
			// we found an "x", see if there is one in the next position
			// This is tricky, because the next position might be
			// past the end of the string
			// So, check to see if we have not passed the end of the string.
			// (Example a string of "abcdx", we can't check one beyond 
			// the x because it is the last character.
			// So, if the next character (locationOfX + 1) 
			// is less than the length, we are okay to check it
			if (locationOfX + 1 < str.length()) {
				String myVar = str.substring(locationOfX + 1, locationOfX + 2);
				if (myVar.equals("x")) {
					return true;
				} else {
					return false;
				}
				// this means "x" is the last character in the string
				// so we cannot check past it, so return false
				
			} else {
				return false;
			}
		
		// we hit this else if we do NOT find an 'x' in the string
		} else {
			return false;
		}

	}

}
