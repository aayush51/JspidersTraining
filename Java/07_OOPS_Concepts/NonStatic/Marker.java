package NonStatic;

public class Marker {
	String name="Camlin";
	String color;
	double price;
	
	// Non Static Block
	{
		System.out.println("from non static block");
	}
	{
		System.out.println("from non static block 2");
	}
	Marker()
	{
		System.out.println(name);
		System.out.println("From Marker Constructor");
	}
	{
		System.out.println("from non static block 3");
	}

	public void displayMarker() {
		System.out.println("Name: " + name);
		System.out.println("Color: " + color);
		System.out.println("Price: " + price);
	}

	Marker(String name, String color, double price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	{
		System.out.println("from non static block 4");
	}
}
