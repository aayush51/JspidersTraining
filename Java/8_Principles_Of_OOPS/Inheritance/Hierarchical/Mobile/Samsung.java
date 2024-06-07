package Inheritance.Hierarchical.Mobile;

public class Samsung extends Mobile {
	String Model;
	Boolean KnoxSecurity;
	Boolean SamsungPay;

	public Samsung() {

	}

	Samsung(int batterymAh, int memoryGB, int storageGB, int cameraMP, int priceRs, String Model, Boolean KnoxSecurity,
			Boolean SamsungPay) {
		this.batterymAh = batterymAh;
		this.memoryGB = memoryGB;
		this.storageGB = storageGB;
		this.cameraMP = cameraMP;
		this.priceRs = priceRs;

		this.Model = Model;
		this.KnoxSecurity = KnoxSecurity;
		this.SamsungPay = SamsungPay;
	}

	public void displaySamsungDetails() {
		displayMobileDetails();
		System.out.println("Model: " + Model);
		System.out.println("Knox Security: " + KnoxSecurity);
		System.out.println("Samsung Pay: " + SamsungPay);
	}
	
}
