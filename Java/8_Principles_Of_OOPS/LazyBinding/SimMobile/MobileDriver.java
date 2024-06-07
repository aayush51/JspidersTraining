package LazyBinding.SimMobile;

public class MobileDriver {

	public static void main(String[] args) {
		Mobile m1 = new Mobile("Samsung", 2, true, true);
		m1.displayMobile();
		
		System.out.println("-------------------------------");
		
		m1.insertSim("Airtel", "4G", false, true);
		
		System.out.println("-------------------------------");
		
		m1.s1.displaySim();
		
		System.out.println("-------------------------------");
		
		m1.insertSim("Jio", "5G", true, false);
		
		System.out.println("-------------------------------");
		
		m1.s1.displaySim();
		
	}

}
