package CollectionsClass;

import java.util.Objects;

public class Mobile implements Comparable<Mobile> {
	
	String name;
	int ram;
	int memory;
	int battery;
	boolean fingerprintSensor;
	double price;
	
	public Mobile(String name, int ram, int memory, int battery, boolean fingerprintSensor, double price) {
		super();
		this.name = name;
		this.ram = ram;
		this.memory = memory;
		this.battery = battery;
		this.fingerprintSensor = fingerprintSensor;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", ram=" + ram + ", memory=" + memory + ", battery=" + battery
				+ ", fingerprintSensor=" + fingerprintSensor + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(battery, fingerprintSensor, memory, name, price, ram);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mobile other = (Mobile) obj;
		return battery == other.battery && fingerprintSensor == other.fingerprintSensor && memory == other.memory
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && ram == other.ram;
	}

	@Override
	public int compareTo(Mobile o) {
		return this.name.compareTo(o.name);
	}
	
	
	
	
	
}
