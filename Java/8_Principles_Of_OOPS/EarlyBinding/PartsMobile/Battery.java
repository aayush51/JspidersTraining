package EarlyBinding.PartsMobile;

public class Battery {
	int capacity;
    int voltage;
    
	public Battery() {

	}
	
	Battery(int capacity, int voltage) {
		this.capacity = capacity;
		this.voltage = voltage;
	}
	
	public void displayBattery() {
		System.out.println("Battery Details: ");
		System.out.println("Capacity: " + capacity);
		System.out.println("Voltage: " + voltage);
	}

}
