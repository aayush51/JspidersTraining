package EarlyBinding.PillarBuilding;

public class Pillar {
	String cementName;
	int height;
	int width;
	int depth;
	
	public Pillar() 
	{
		
	}
	
	Pillar(String cementName, int height, int width, int depth) {
		this.cementName = cementName;
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	public void displayPillarDetails() {
		System.out.println("Cement Name: " + cementName);
		System.out.println("Height: " + height);
		System.out.println("Width: " + width);
		System.out.println("Depth: " + depth);
	}
	
}
