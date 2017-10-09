
public class CodingBat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(stringX("xxHixx"));
		//System.out.println(stringYak("HiyakHi"));
		int[] testArray = {1,2,7,1};
		int[] testArray2 = {2,7,4};
		//System.out.println(has271(testArray));
		System.out.println(has271(testArray2));
	}

	public static String stringX(String str) {
		String newString = "";
		for (int i = 0; i < str.length(); i++) {
			if ((i == 0) || (i == str.length() - 1)) {
				newString += str.charAt(i);
			} else {
				if (str.charAt(i) != 'x') {
					newString += str.charAt(i);
				}
			}
		}
		return newString;
	}

	public static String stringYak(String str) {

		String newString = "";
		String stringToSearch;
		int i = 0;

		stringToSearch = str;
		do {
			i = stringToSearch.indexOf("yak");
			if (i == 0) {
				newString = stringToSearch.substring(i + 3);
				System.out.println("i=0, newString = " + newString);
				stringToSearch = newString;
			} else if (i > 0) {
				newString = stringToSearch.substring(0, i);
				newString += stringToSearch.substring(i + 3);
				System.out.println("i=" + i + " newString = " + newString);
				stringToSearch = newString;
			}

		} while (i >= 0);

		return stringToSearch;
	}

	public static boolean has271(int[] nums) {
		boolean hasPattern = false;

		for (int i = 0; i <= nums.length - 3; i++) {
			System.out.println("*********************");
			System.out.println("i = " + i);
			System.out.println("nums[i] = " + nums[i]);
			System.out.println("nums[i] + 5 = " + (nums[i]+5));		
			System.out.println("nums[i+1] = " + nums[i+1]);
			System.out.println("next check");
			
			System.out.println("num[i] - 2 = " + (nums[i]-2));
			System.out.println("num[i] - 1 + " + (nums[i]-1));
			System.out.println("num[i+2] = " + (nums[i+2]));
			
			System.out.println("into the loop");
			if ((nums[i] + 5) == nums[i + 1]) {
				System.out.println("nums[i] + 5 == nums[i+1]");
				System.out.println("nums[i] -2 = " + (nums[i]-2) );
				if (  (nums[i] - 1 == nums[i + 2] ) ||
				   (nums[i] -2 == nums[i+2] ) ){
					hasPattern = true;
				}
			}
		}
		return hasPattern;
	}

}