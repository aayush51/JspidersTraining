package Upcasting.FatherSon;

public class FatherSonDriver {

	public static void main(String[] args) {
		//normal object creation 
		//in this case, we can access all the methods of the subclass and the superclass 
		Son s = new Son();
		s.Drinking();
		s.Smoking();
		
		System.out.println("-------------------------------");
		
		// Upcasting
		Father f = new Son();
		f.Drinking();
//		 f.Smoking(); // Compile Time Error
		
		
//		 Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//				The method Smoking() is undefined for the type Father
//
//				at Upcasting.FatherSon.FatherSonDriver.main(FatherSonDriver.java:15)
		
		
	}
}
