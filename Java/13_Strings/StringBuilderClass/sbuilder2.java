package StringBuilderClass;

public class sbuilder2 {
	
	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Qspiders");
		StringBuilder sb2 = sb1.append("Deccan");
		StringBuilder sb3 = new StringBuilder("Hello");
		
		System.out.println(sb1.append(sb1.hashCode()));
		System.out.println(sb2);
		System.out.println(sb3.append(sb3.hashCode()));
		System.out.println(sb1==sb2);
		System.out.println(sb3==sb1);
		
		String s1 = "Jspiders";
		String s2 = s1.concat("Deccan");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		
	}

}