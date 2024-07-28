package ObjectClass;

public class LaptopDriver {

	public static void main(String[] args) {
		Laptop laptop1 = new Laptop("Dell XPS 15", 16, 512, 86, "Intel i7 10th Gen", "Nvidia GTX 1650 Ti", "Windows 10",
				"Gaming", 150000, "4K OLED", 60);
		Laptop laptop2 = new Laptop("MacBook Pro 16", 16, 512, 100, "Intel i9 9th Gen", "AMD Radeon Pro 5500M", "MacOS",
				"Professional", 200000, "Retina", 60);

		laptop1.printDetails();
		System.out.println();
		laptop2.printDetails();
		System.out.println();
		
		System.out.println(laptop1);
		System.out.println(laptop2);
		System.out.println();
		
		System.out.println(laptop1.toString());
		System.out.println(laptop2.toString());
		System.out.println();
		
		System.out.println(laptop1.giveReference());
		System.out.println(laptop2.giveReference());
		
	}

}
