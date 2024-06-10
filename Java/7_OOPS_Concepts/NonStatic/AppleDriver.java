package NonStatic;

public class AppleDriver {
	
	public static void main(String[] args) {
		Apple apple1 = new Apple();
		apple1.color = "Red";
		apple1.type = "Fuji";
		apple1.origin = "Japan";
		apple1.weight = 200;
		
		apple1.displayColor();
		apple1.displayType();
		apple1.displayOrigin();
		apple1.displayWeight();
		
		System.out.println("--------------------------------------");

		apple1.displayApple();

		System.out.println("--------------------------------------");

		Apple apple2 = new Apple();

		apple2.displayApple();
	}

}
