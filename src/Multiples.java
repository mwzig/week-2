
public class Multiples {

	public static void main(String[] args) {
		
		int count = 0;
		
		do {
			if (count % 5 == 0) {
				System.out.println(count);
			}
			count ++;
		} while (count <= 100);
		
		count = 0;
		while (count <=100) {
			System.out.println(count);
			count +=5;
		}
		
		

	}

}
