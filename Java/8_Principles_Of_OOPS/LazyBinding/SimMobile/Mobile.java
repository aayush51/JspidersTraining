package LazyBinding.SimMobile;

public class Mobile {
	String brand ;
	int simSlots ;
	boolean supports5G ;
	boolean isCharged ;
	
	Sim s1 ;
	
	public Mobile() {

	}
	
	public Mobile(String brand, int simSlots, boolean supports5G, boolean isCharged) {
		this.brand = brand;
		this.simSlots = simSlots;
		this.supports5G = supports5G;
		this.isCharged = isCharged;
	}
	
	public void insertSim(String brand, String type, boolean is5G, boolean isRecharged) {
		s1 = new Sim(brand, type, is5G, isRecharged);
		System.out.println("Sim inserted");
	}
	
	
	public void displayMobile() {
		System.out.println("Brand: " + brand);
		System.out.println("Sim Slots: " + simSlots);
		System.out.println("5G: " + supports5G);
		System.out.println("Charged: " + isCharged);
	}

}
