package loose_coupling;

public class AppleDriver {
	
	public static void main(String[] args) {
		
		EatingFruit eat = new EatingFruit();
		eat.fruit = new Kiwi();
		eat.startEating();
		
	}
}
