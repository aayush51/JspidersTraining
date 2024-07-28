package LazyBinding;

public class Computer {
	String brand;
	String OS;
	String processor;
	int ram;
	int storage;
	
	Pendrive p;
	
	public Computer() {

	}
	
	Computer(String brand, String OS, String processor, int ram, int storage)
	{
		this.brand = brand;
		this.OS = OS;
		this.processor = processor;
		this.ram = ram;
		this.storage = storage;
	}
	
	public void insertPendrive(String brand, int capacity, double price, double speed) 
	{
		p = new Pendrive(brand, capacity, price, speed);
		System.out.println("Pendrive inserted successfully");
	}
	
	public void displayComputer() {
		System.out.println("Brand: " + brand);
		System.out.println("OS: " + OS);
		System.out.println("Processor: " + processor);
		System.out.println("RAM: " + ram + " GB");
		System.out.println("Storage: " + storage + " GB");
	}

}
