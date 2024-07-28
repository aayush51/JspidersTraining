package Constructor;

public class MobileDriver {
	
	public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.displayMobile();
        
        System.out.println("-------------------------------------------");
        
        Mobile m2 = new Mobile("Samsung", "Galaxy S10", "Black", 50000);
        m2.displayMobile();
	}

}
