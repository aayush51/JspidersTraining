package NonStatic;

public class BottleDriver {
	
	public static void main(String[] args) {
		Bottle bottle1 = new Bottle();
		bottle1.brand = "Pepsi";
		bottle1.price = 150;
		bottle1.capacity = 1.5;
		bottle1.color = "Blue";
		bottle1.material = "Plastic";
		bottle1.shape = "Round";
		bottle1.type = "Soda";

		bottle1.displayBottle();
		
		System.out.println("--------------------------------------");
		
		Bottle bottle2 = new Bottle();
		
		bottle2.displayBottle();
	}

}
