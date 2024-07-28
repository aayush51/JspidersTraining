package Inheritance.Hierarchical.Mobile;

public class Mobile {
	int batterymAh;
	int memoryGB;
	int storageGB;
	int cameraMP;
	int priceRs;
	
	public Mobile() {
		
	}
	
	Mobile(int batterymAh, int memoryGB, int storageGB, int cameraMP, int priceRs) {
//		System.out.println(batterymAh);
		
		this.batterymAh = batterymAh;
		this.memoryGB = memoryGB;
		this.storageGB = storageGB;
		this.cameraMP = cameraMP;
		this.priceRs = priceRs;
	}
	
	public void displayMobileDetails() {
		System.out.println("Battery: " + batterymAh + " mAh");
		System.out.println("Memory: " + memoryGB + " GB");
		System.out.println("Storage: " + storageGB + " GB");
		System.out.println("Camera: " + cameraMP + " MP");
		System.out.println("Price: Rs." + priceRs);
		
		System.out.println(this);
	}
}
