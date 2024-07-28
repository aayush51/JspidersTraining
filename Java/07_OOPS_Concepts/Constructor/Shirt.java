package Constructor;

public class Shirt {
	String color;
	char size;
	String Brand;
	double price;
	
	//Constructor
	Shirt()
	{
		System.out.println("from no arg constructor");
	}
	
	public void displayShirt() {
		System.out.println("Color: " + color);
		System.out.println("Size: " + size);
		System.out.println("Brand: " + Brand);
		System.out.println("Price: " + price);
	}

}
