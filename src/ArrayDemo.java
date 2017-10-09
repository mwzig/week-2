
public class ArrayDemo {

	public static void main(String[] args) {

		int[] cupValues = new int[5];

		cupValues[0] = 42;
		cupValues[1] = 86;
		cupValues[2] = 23;
		cupValues[3] = 8;
		cupValues[4] = 100;

		for (int i = 0; i < 5; i++) {
			System.out.println(cupValues[i]);
		}

		String source = "my-file-name";
		String[] elements = source.split("-");
		
		System.out.println(elements[0]);
		System.out.println(elements[1]);
		System.out.println(elements[2]);
		
		System.out.println(elements[0] +
				elements[1].substring(0,1).toUpperCase() +
				elements[1].substring(1).toLowerCase() +
				elements[2].substring(0,1).toUpperCase() +
				elements[2].substring(1).toLowerCase() );
		
		
	}
	
	
	

}
