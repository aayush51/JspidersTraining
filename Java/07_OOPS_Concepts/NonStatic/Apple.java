package NonStatic;

public class Apple {
	String color;
	String type;
	String origin;
	int weight;
	
	public void displayColor() {
		System.out.println("Color: " + color);
	}
	
	public void displayType() {
		System.out.println("Type: " + type);
	}
	
	public void displayOrigin() {
		System.out.println("Origin: " + origin);
	}
	
	public void displayWeight() {
		System.out.println("Weight: " + weight);
	}
	
	public void displayApple() {
		displayColor();
		displayType();
		displayOrigin();
		displayWeight();
	}

}
