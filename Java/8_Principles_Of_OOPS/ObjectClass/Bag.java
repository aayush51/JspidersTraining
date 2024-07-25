package ObjectClass;

public class Bag {
	String brand;
	String color;
	double price;
	double capacity;
	
	public Bag()
	{
		super();
	}
	
	public Bag(String brand, String color, double price, double capacity)
	{
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.capacity = capacity;
	}
	
	public String toString()
	{
		return "[Brand: " + brand + ",Color:" + color + ",Price:" + price + ",Capacity:" + capacity + "]";
	}
	
    public String giveReference() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
