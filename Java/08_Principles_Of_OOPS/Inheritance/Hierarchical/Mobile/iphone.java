package Inheritance.Hierarchical.Mobile;

public class iphone extends Mobile {
	String Model;
	Boolean FaceID;
	Boolean TouchID;
	
	public iphone() {

	}
	
	iphone(int batterymAh, int memoryGB, int storageGB, int cameraMP, int priceRs, String Model, Boolean FaceID,
			Boolean TouchID) {
		this.batterymAh = batterymAh;
		this.memoryGB = memoryGB;
		this.storageGB = storageGB;
		this.cameraMP = cameraMP;
		this.priceRs = priceRs;
		
		this.Model = Model;
		this.FaceID = FaceID;
		this.TouchID = TouchID;
	}
	
	public void displayiphoneDetails() {
		displayMobileDetails();
		System.out.println("Model: " + Model);
		System.out.println("FaceID: " + FaceID);
		System.out.println("TouchID: " + TouchID);
	}

}
