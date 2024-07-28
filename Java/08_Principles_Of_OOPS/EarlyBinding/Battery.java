package EarlyBinding;

public class Battery {
	String brand;
	double mAh;
	double price;
	
	public Battery()
	{
		
	}
	
	Battery(String brand, double mAh, double price) {
		this.brand = brand;
		this.mAh = mAh;
		this.price = price;
	}
	
	public void displayBattery() {
		System.out.println("Battery Brand: " + brand);
		System.out.println("Battery mAh: " + mAh);
		System.out.println("Battery Price: " + price);
	}
}
