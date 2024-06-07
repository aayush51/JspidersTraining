package LazyBinding;

public class Pendrive {
	String brand;
	int capacity;
	double price; 
	double speed;
	
	public Pendrive() {
		
	}
	
	Pendrive(String brand, int capacity, double price, double speed) {
		this.brand = brand;
		this.capacity = capacity;
		this.price = price;
		this.speed = speed;
	}
	
	public void displayPendrive() {
		System.out.println("Brand: " + brand);
		System.out.println("Capacity: " + capacity + " GB");
		System.out.println("Price: " + price + " INR");
		System.out.println("Speed: " + speed + " Mbps");
	}

}
