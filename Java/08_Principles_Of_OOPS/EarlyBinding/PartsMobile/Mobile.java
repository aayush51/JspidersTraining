package EarlyBinding.PartsMobile;

public class Mobile {
	    
        String brand;
        String model;
        Battery b1;
        Camera c1;
        
		public Mobile() {

		}
		
		Mobile(String brand, String model, int capacity, int voltage, int megaPixels, String resolution) {
			this.brand = brand;
			this.model = model;
			b1 = new Battery(capacity, voltage);
			c1 = new Camera(megaPixels, resolution);
		}
		
		public void displayMobile() {
			System.out.println("Mobile Details: ");
			System.out.println("Brand: " + brand);
			System.out.println("Model: " + model);
			b1.displayBattery();
			c1.displayCamera();
		}

}
