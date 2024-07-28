package EarlyBinding.ProcessorComputer;

public class ComputerDriver {

	public static void main(String[] args) {

		Computer c1 = new Computer("Asus", "ROG Strix", 150000, 16, 512, "AMD", "Ryzen 9 5900X", 12, 24, 3.7, 4.8, 50000);
		c1.displayComputer();
		System.out.println("-----------------------------------");
		c1.p1.displayProcessor();
	}

}
