package EarlyBinding.PillarBuilding;

public class BuildingDriver {

	public static void main(String[] args) {
		
		Building b1 = new Building("Sumitra Apartment","Shivaji Nagar,Pune", 5 , 150 ,"Asian Cement", 1200, 200 , 200);
		b1.displayBuilding();
		
		System.out.println("-----------------------------------");
		
		b1.p1.displayPillarDetails();
	}

}
