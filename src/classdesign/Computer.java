package classdesign;

import java.text.NumberFormat;
import java.util.Currency;

public class Computer {

	// Instance data
	private String make;
	private String model;
	private double price;

// constructor
public Computer(String make, String model, Double price) {
	this.make = make;
	this.model = model;
	this.price = price; 
}


// getters and setters
public String getMake() {
	return make;
}

public String getModel() {
	return model;
}

public Double getPrice() {
	return price;
}

// setters
public void setPrice(double price) {
	this.price = price;
}

// Method of behavior
public String download(boolean isDownLoading) {
	if (isDownLoading) {
		return this.make + " is downloading... ";
	} else {
		
		return this.make + " is available for download";
	}
}

// instead of the object's toString which prints the memory location,
// let's print information that is more relevant to us
@Override
public String toString() {
	
	/*
	 String currentLocale = ;
	Currency currentCurrency = Currency.getInstance(currentLocale);
	    NumberFormat currencyFormatter = 
	        NumberFormat.getCurrencyInstance(currentLocale);
	    currencyFormatter.format(price));
	  */  
	return   "Make: " + make
	+ "\n" + "Model: " + model
	+ "\n" + "Price: " + price;
}

}