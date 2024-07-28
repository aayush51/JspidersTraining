package Inheritance.Hierarchical.Mobile;

public class Xiomi extends Mobile {
	String Model;
	Boolean MIUI;
	Boolean FastCharge;

	public Xiomi() {

	}

	Xiomi(int batterymAh, int memoryGB, int storageGB, int cameraMP, int priceRs, String Model, Boolean MIUI,
			Boolean FastCharge) {
		this.batterymAh = batterymAh;
		this.memoryGB = memoryGB;
		this.storageGB = storageGB;
		this.cameraMP = cameraMP;
		this.priceRs = priceRs;

		this.Model = Model;
		this.MIUI = MIUI;
		this.FastCharge = FastCharge;
	}

	public void displayXiomiDetails() {
		displayMobileDetails();
		System.out.println("Model: " + Model);
		System.out.println("MIUI: " + MIUI);
		System.out.println("Fast Charge: " + FastCharge);
	}
}
