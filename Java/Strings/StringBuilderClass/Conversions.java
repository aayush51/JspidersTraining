package StringBuilderClass;

public class Conversions {
	
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Qspiders");
		String s1 = new String(sb1);
		StringBuilder sb2 = new StringBuilder(s1);
		
		System.out.println(sb2);
	}

}
