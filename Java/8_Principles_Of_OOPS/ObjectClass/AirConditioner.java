package ObjectClass;

// Object class is the root class in Java
// We are extending the our class with Object class
// This is done by default, even if we don't write it
public class AirConditioner extends Object {
	// Attributes
	String brand;
	int price;
	int maxTemp;
	int minTemp;
	String mode;
	
	public AirConditioner() {
		// Calling the constructor of the Object class using super() keyword to initialize the attributes of the class 
		super();
		
	}
	
	public AirConditioner(String brand, int price, int maxTemp, int minTemp, String mode) {
		super();
		this.brand = brand;
		this.price = price;
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
		this.mode = mode;
	}
	
	// Overriding toString() method of Object class to print the object in a user friendly way
	
	public String toString() {
		return "Brand: " + brand + "\nPrice: " + price + "\nMax Temp: " + maxTemp + "\nMin Temp: " + minTemp
				+ "\nMode: " + mode;
	}
	
	// Overriding equals() method of Object class to compare the objects based on the attributes of the class
	
	public boolean equals(Object obj) {
		AirConditioner ac = (AirConditioner) obj; // Down casting
		if (this.brand==ac.brand && this.price==ac.price && this.maxTemp==ac.maxTemp && this.minTemp==ac.minTemp && this.mode==ac.mode) {
			return true;
		}
		return false;
	}
	
	// Overriding hashCode() method of Object class to generate a hash code based on the attributes of the class
	
	public int hashCode() {
		int hc = 0;
		hc = hc + brand.hashCode()+price+maxTemp+minTemp+mode.hashCode();
		return hc;
	}
	
	// Hand Shake between equals() and hashCode() methods:
	// If two objects are equal, then their hash codes must be equal.
	// If two objects are not equal, then their hash codes need not be equal.
	
}
