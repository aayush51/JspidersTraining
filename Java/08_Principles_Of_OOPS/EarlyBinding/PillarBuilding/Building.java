package EarlyBinding.PillarBuilding;

public class Building {
	String buildingName;
    String buildingAddress;
    int buildingFloors;
    int noOfPillars;
    Pillar p1;
    
	public Building() {

	}
	
	Building(String buildingName, String buildingAddress, int buildingFloors, int noOfPillars, String cementName, int height, int width, int depth) {
		this.buildingName = buildingName;
		this.buildingAddress = buildingAddress;
		this.buildingFloors = buildingFloors;
		this.noOfPillars = noOfPillars;
		p1 = new Pillar(cementName, height, width, depth);
		//this.p1 = new Pillar(cementType, height, width, depth);
	}
    
	public void displayBuilding() {
		System.out.println("Building Name: " + buildingName);
		System.out.println("Building Address: " + buildingAddress);
		System.out.println("Building Floors: " + buildingFloors);
		System.out.println("No of Pillars: " + noOfPillars);
		p1.displayPillarDetails();
	}

}
