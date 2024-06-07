package LazyBinding;

public class ComputerDriver {
	
	public static void main(String[] args) {
		Computer c = new Computer("Dell", "Windows", "i5", 8, 512);
		c.displayComputer();
		
		System.out.println("---------------------------------------");
		
		c.insertPendrive("SanDisk", 128, 2000, 100);
		
		System.out.println("---------------------------------------");
		
		c.p.displayPendrive();
	}

}
