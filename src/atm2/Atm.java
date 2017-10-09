package atm2;

import java.math.BigDecimal;

public class Atm {

	private String requiredPin;
	private BigDecimal balance;

	public Atm(String requiredPin, String balance) {
		this.requiredPin = requiredPin;
		this.balance = new BigDecimal(balance);

	}

	public BigDecimal getBalance() {
		return balance;
	}

		public boolean allowAccess(String enteredPin) {
		return (enteredPin.equals(this.requiredPin));

	}

	public BigDecimal deposit(String amount) {
		BigDecimal d = new BigDecimal(amount);
		System.out.println("amount to add " + amount);
		System.out.println("amount to add " + d);
		balance = balance.add(d);
		System.out.println("balance is " + balance.toString());
		return balance;
	}

	public BigDecimal withdraw(String amount) {
		BigDecimal d = new BigDecimal(amount);
		balance = balance.subtract(d);
		return balance;
	}

}
