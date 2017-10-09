package alanatm;


public class Atm {

	private String requiredPin;
	private double balance;
	
	public Atm(String requiredPin, double balance) {
		this.requiredPin = requiredPin;
		this.balance = balance;
	}

	public boolean allowAccess(String enteredPin) {
		return requiredPin.equals(enteredPin);
		}
	
	public void makeDeposit(double amount){
		balance += amount;
	}
	
	public void makeWithdraw(double amount) {
		balance -=amount;
	}
	
	public double getBalance() {
		return balance;
	}
	}