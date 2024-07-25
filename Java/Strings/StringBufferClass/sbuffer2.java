package StringBufferClass;

public class sbuffer2 {
	
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Qspiders");
		StringBuffer sb2 = sb1.append("Deccan");
		StringBuffer sb3 = new StringBuffer("Hello");
		
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
