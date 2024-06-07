package EarlyBinding.PartsMobile;

public class MobileDriver {

	public static void main(String[] args) {
		Mobile m1 = new Mobile("Samsung", "Galaxy S20", 5000, 5, 64, "1080p");
		m1.displayMobile();
		
		System.out.println("----------------------------------------");
		
		m1.b1.displayBattery();
		
		System.out.println("----------------------------------------");
		
		m1.c1.displayCamera();
		
		System.out.println("----------------------------------------");
		
		Mobile m2 = new Mobile("Apple", "iPhone 11", 3110, 3, 12, "720p");
		m2.displayMobile();
		
		System.out.println("----------------------------------------");
		
		m2.b1.displayBattery();
		
		System.out.println("----------------------------------------");
		
		m2.c1.displayCamera();
		
		
	}

}
