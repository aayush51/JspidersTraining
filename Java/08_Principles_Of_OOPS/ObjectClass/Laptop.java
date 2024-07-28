package ObjectClass;

public class Laptop extends Object 		{
	
	String name;
	int ram;
	int storage;
	int battery;
	String processor;
	String graphics;
	String os;
	String type;
	int price;
	String display;
	int refreshRate;
	
	public Laptop() {
		super();
	}
	
	public Laptop(String name, int ram, int storage, int battery, String processor, String graphics, String os,
			String type, int price, String display, int refreshRate) {
		super();
		this.name = name;
		this.ram = ram;
		this.storage = storage;
		this.battery = battery;
		this.processor = processor;
		this.graphics = graphics;
		this.os = os;
		this.type = type;
		this.price = price;
		this.display = display;
		this.refreshRate = refreshRate;
	}
	
	public void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("RAM: " + ram + " GB");
		System.out.println("Storage: " + storage + " GB");
		System.out.println("Battery: " + battery + " mAh");
		System.out.println("Processor: " + processor);
		System.out.println("Graphics: " + graphics);
		System.out.println("OS: " + os);
		System.out.println("Type: " + type);
		System.out.println("Price: " + price + " INR");
		System.out.println("Display: " + display);
		System.out.println("Refresh Rate: " + refreshRate + " Hz");
	}
	
    public String giveReference() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

}
