package StringBuilderClass;

public class sbuilder1 {
	
	public static void main(String[] args) {
		
//		StringBuilder s = "Hello"; CTE
		
		StringBuilder s1 = new StringBuilder("Hello");
		StringBuilder s2 = new StringBuilder("Hello");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));  //false 
											//Because equals and hashCode of 
											//Object Class are not overridden
											//in StringBuilder class
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}

}
