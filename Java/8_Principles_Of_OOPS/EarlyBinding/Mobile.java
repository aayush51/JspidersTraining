package EarlyBinding;

public class Mobile {
	String brand;
    String model;
    double price;
    int ram;
    int storage;
    Battery b1 ;
    
	public Mobile() {

	}
	
	public Mobile(String brand, String model, double price, int ram, int storage,String batbrand, double mAh, double batprice) {
		b1 = new Battery(batbrand, mAh, batprice);
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.ram = ram;
		this.storage = storage;
	}
	
	public void displayMobile() {
		System.out.println("Mobile Brand: " + brand);
		System.out.println("Mobile Model: " + model);
		System.out.println("Mobile Price: " + price);
		System.out.println("Mobile RAM: " + ram);
		System.out.println("Mobile Storage: " + storage);
		b1.displayBattery();
	}

}
