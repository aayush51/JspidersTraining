package EarlyBinding.EngineCar;

public class Engine {
	String brand;
	double power;
	double price;

	public Engine() {

	}

	Engine(String brand, double power, double price) {
		this.brand = brand;
		this.power = power;
		this.price = price;
	}

	public void displayEngine() {
		System.out.println("Engine Brand: " + brand);
		System.out.println("Engine Power: " + power);
		System.out.println("Engine Price: " + price);
	}

}
