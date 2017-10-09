import java.util.Scanner;

public class MethodsForGene {

	public static void main(String[] args) {
		
		System.out.println("Enter order #1 cost");
		Scanner input = new Scanner(System.in);
		double amount1 = input.nextInt();
		double amount1WithTax = calcSalesTax(amount1);
		
		System.out.println("enter order #2 cost");
		double amount2 = input.nextInt();
		double amount2WithTax = calcSalesTax(amount2);
		
		double totalValue = amount1WithTax + amount2WithTax;
		System.out.println("The total amount with tax is " + totalValue);

	}

	public static double calcSalesTax(double salesAmount) {
		double amountWithTax = salesAmount * 1.075;
		System.out.println("totalAmount is " + amountWithTax);
		return amountWithTax;
	}
}
