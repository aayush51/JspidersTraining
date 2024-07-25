package Static_NonStatic;

public class NewClass1 {
	int a = 99 ; 
	public static void main(String[] args) {
//		System.out.println(a); 
		// CTE : Cannot make a static reference to the non-static field a
		//Static methods can only access static members
		//Non-Static methods can access both static and non-static members
	}
}
