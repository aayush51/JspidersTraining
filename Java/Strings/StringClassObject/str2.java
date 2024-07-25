package StringClassObject;

public class str2 {
	
	public static void main(String[] args) {
		
//		Creating String Object with String Literal 
		String s1 = "hello";
		String s2 = "hello";
		System.out.println("s1==s2 : " + (s1==s2));
		System.out.println("s1.equals(s2) : "+s1.equals(s2));
		System.out.println("s1.hashCode() : "+s1.hashCode());
		System.out.println("s2.hashCode() : "+s2.hashCode());

	}

}
