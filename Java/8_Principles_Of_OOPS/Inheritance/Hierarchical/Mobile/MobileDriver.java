package Inheritance.Hierarchical.Mobile;

public class MobileDriver {
	
	public static void main(String[] args) {
		
		System.out.println("-------------------Samsung Details--------------------");
		
		Samsung s = new Samsung(4500, 8, 128, 64, 60000, "S21", true, true);
//	    Samsung s = new Samsung();
		s.displaySamsungDetails();
//		System.out.println(s.toString());
//		System.out.println(s);
//		System.out.println(this);
//		s.displayMobileDetails();
		
//		System.out.println("-------------------Xiomi Details--------------------");
//
//		Xiomi x = new Xiomi(5000, 6, 128, 48, 25000, "Note 10", true, true);
//		x.displayXiomiDetails();
//		
//		System.out.println("-------------------iphone Details--------------------");
//
//		iphone i = new iphone(4000, 4, 64, 12, 80000, "12 Pro", true, true);
//		i.displayiphoneDetails();
	}

}
