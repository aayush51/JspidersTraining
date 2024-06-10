package Downcasting.FatherSon;

public class FatherSonDriver {

	public static void main(String[] args) {
		Father f = new Son(); //Up casting
		f.Drinking();
		
		System.out.println("-------------------------------");
		
//		 f.Smoking(); // Error: The method Smoking() is undefined for the type Father
		 
		//Down casting
		
		Son s = (Son) f;
		
		s.Drinking();
		s.Smoking();
		
		
	}

}
