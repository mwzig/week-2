package atm;

import java.math.BigDecimal;

public class Atm {

	private String requiredPin = "4747";
	double  balance = 7000.05;
	private BigDecimal cdBal;
	
	// constructors
	public Atm() {
		
	}
	
	public Atm(String requiredPin, double balance, double cdBal) {
		this.requiredPin = requiredPin;
		this.balance = balance;
		this.cdBal = new BigDecimal(cdBal);
	}
	public Atm(String requiredPin, double balance) {
		this.requiredPin = requiredPin;
		this.balance = balance;
	
	}
	
	// getters and setters
	
	
	public boolean allowAccess(String enteredPin) {
		return (enteredPin.equals(this.requiredPin));
			
	}
	public double getBalance() {
		return balance;
	}
	public double deposit (double amount) {
		balance += amount;
		return balance;
	}
	
	public double withdraw (double amount) {
		balance -= amount;
		return balance;
	}
	
}
