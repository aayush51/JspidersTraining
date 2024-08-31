package StringBufferClass;

public class sbuffer1 {
	
	public static void main(String[] args) {
		
//		StringBuffer s = "Hello"; CTE
		
		StringBuffer s1 = new StringBuffer("Hello");
		StringBuffer s2 = new StringBuffer("Hello");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));  //false 
											//Because equals and hashCode of 
											//Object Class are not overridden
											//in StringBuffer class
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}

}
