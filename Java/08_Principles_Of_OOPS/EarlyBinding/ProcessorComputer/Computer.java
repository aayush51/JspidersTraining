package EarlyBinding.ProcessorComputer;

public class Computer {
	String brand;
    String model;
    double price;
    int ram;
    int storage;
    Processor p1;
    
    public Computer() {
    	
    }
    
	Computer(String brand, String model, double price, int ram, int storage, String processorBrand,
			String processorModel, int cores, int threads, double baseClock, double boostClock, double processorPrice) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.ram = ram;
		this.storage = storage;
		p1 = new Processor(processorBrand, processorModel, cores, threads, baseClock, boostClock, processorPrice);
	}
	
	public void displayComputer() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Price: " + price);
		System.out.println("RAM: " + ram);
		System.out.println("Storage: " + storage);
		p1.displayProcessor();
	}
}
