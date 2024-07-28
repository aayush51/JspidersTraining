package EarlyBinding.ProcessorComputer;

public class Processor {
	String brand;
	String model;
	int cores;
	int threads;
	double baseClock;
	double boostClock;
	double price;
	
	//public Processor() {
		
	//}
	
	Processor(String brand, String model, int cores, int threads, double baseClock, double boostClock,
			double price) {
		this.brand = brand;
		this.model = model;
		this.cores = cores;
		this.threads = threads;
		this.baseClock = baseClock;
		this.boostClock = boostClock;
		this.price = price;
	}
	
	void displayProcessor() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Cores: " + cores);
		System.out.println("Threads: " + threads);
		System.out.println("Base Clock: " + baseClock);
		System.out.println("Boost Clock: " + boostClock);
		System.out.println("Price: " + price);
	}

}
