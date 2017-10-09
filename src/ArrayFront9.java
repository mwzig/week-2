
public class ArrayFront9 {

	public static void main(String[] args) {
		
		int nums[] = {1, 2, 9, 3, 4};
		
		boolean bFound9 = false;
		  
		  for (int i = 0; i < nums.length; i++) {
			System.out.println("i is " + i);
			System.out.println("nums[i] is " + nums[i]);
		    if (i < 4) {
		      if (nums[i] == 9) {
		    	  System.out.println("here");
		        bFound9 = true;
		      }
		    }
		    
		  }
		  
		  // TODO Auto-generated method stub

	}

}
