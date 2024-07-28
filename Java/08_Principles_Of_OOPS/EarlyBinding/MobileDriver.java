package EarlyBinding;

public class MobileDriver {

	public static void main(String[] args) {
		Mobile m1 = new Mobile("Samsung", "Galaxy S21", 150000, 8, 128, "Samsung", 4000, 9000);
		m1.displayMobile();
		
		System.out.println("---------------------------------");
		
		m1.b1.displayBattery();
		
		System.out.println("---------------------------------");
		
		Mobile m2 = new Mobile("Apple", "iPhone 12", 140000, 4, 64, "Apple", 3500, 12000);
		
		m2.displayMobile();
		
		System.out.println("---------------------------------");
		
		m2.b1.displayBattery();
		
		System.out.println("---------------------------------");
	}

}
