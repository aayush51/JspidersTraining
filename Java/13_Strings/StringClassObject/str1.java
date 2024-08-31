package StringClassObject;

public class str1 {
	
	public static void main(String[] args) {

//		Creating String Object with new operator and constructor
		
		String s1 = new String("Hello");
		System.out.println(s1);
		String s2 = new String("Hello");
		System.out.println(s2);
		
		System.out.println("s1==s2 : " + (s1==s2));
		
		System.out.println("s1.equals(s2) : " +  s1.equals(s2));
		System.out.println("s1.equals(\"Hello\") : "+ s1.equals("Hello"));
		
		System.out.println("s1.hashCode() : "+s1.hashCode());
		System.out.println("s2.hashCode() : "+s2.hashCode());
	}

}
