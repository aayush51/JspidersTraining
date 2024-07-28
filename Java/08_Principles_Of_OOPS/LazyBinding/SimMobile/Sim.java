package LazyBinding.SimMobile;

public class Sim {
	String brand ;
	String type ;
	boolean is5G ;
	boolean isRecharged ;
	
	public Sim() 
	{
		
	}
	
	public Sim(String brand, String type, boolean is5G, boolean isRecharged) 
	{
		this.brand = brand;
		this.type = type;
		this.is5G = is5G;
		this.isRecharged = isRecharged;
	}
	
	public void displaySim() {
		System.out.println("Brand: " + brand);
		System.out.println("Type: " + type);
		System.out.println("5G: " + is5G);
		System.out.println("Recharged: " + isRecharged);
	}

}
