import java.text.NumberFormat;
import java.util.Locale;

public class InterestCompound {

	public static void main(String[] args) {
		
	
		double myMoney = 0.01;
		NumberFormat money = NumberFormat.getCurrencyInstance(Locale.US);
		
		for (int i = 0; i < 30; i++) {
			myMoney *=2;
			System.out.println("The value after " + (i+1) + " days is " + money.format(myMoney));
			}
		
		System.out.println("the value is " + money.format(myMoney));
		
	}

}
