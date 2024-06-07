package Constructor;

public class Mobile {
	String brand;
	String model;
	String color;
	double price;

	// Constructor
	Mobile() {
		System.out.println("from no arg constructor");
	}

	public void displayMobile() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
		System.out.println("Price: " + price);
	}

}
