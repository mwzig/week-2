package classdesign;

public class ComputerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer comp1 = new Computer("Dell", "Latitude", 600.00);
		Computer comp2 = new Computer("Mac", "Pro", 700.00);
		
		System.out.println(comp1);
		
		
		System.out.println("The make is " + comp1.getMake());
		System.out.println("The model is " + comp1.getModel());
		System.out.println("The price is " + comp1.getPrice());
		
		System.out.println("To String shows: \n" + comp1.toString());
		
		comp1.setPrice(500.00);
		System.out.println("To String after price: " + comp1.getPrice());
		
		System.out.println(comp1.download(true));
		System.out.println(comp2.download(true));

	}

}
