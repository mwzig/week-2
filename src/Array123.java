import java.util.Arrays;

public class Array123 {

	public static void main(String[] args) {
		  
		 int nums[] = {1,1,2,1,2,3};
		
		  boolean bFound = false;
		
		
		  if (nums.length >=3) {

		      String theString = "";
		      for (int i = 0; i<nums.length; i++) {
		    	  theString += nums[i];
		    	  System.out.println(" the string is " + theString);
		      }
		      
		      for (int i = 0; i<theString.length() - 3; i++) {
		    	  System.out.println("i is " + i);
		    	  System.out.println(" the substring is " + theString.substring(i,i+3));
		        if (theString.substring(i, i+3).equals("123")) {
		          bFound = true;
		        }
		      }
		  }
		      

	}

}
