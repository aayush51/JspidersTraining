package StringClassObject;

import java.util.Arrays;

public class strMethods {
	
	public static void main(String[] args) {
		
		String s = "India is my country and my country is very beautiful and progressive!";
		
		System.out.println(s.charAt(0));
		System.out.println(s.concat(" I love my country."));
		System.out.println(s.contains("Pakistan"));
		System.out.println(s.endsWith("!"));
		
		String s2 = "heLLo";
		System.out.println(s2.equals("hello"));
		System.out.println(s2.equalsIgnoreCase("hello"));
		
		System.out.println(s.indexOf('z'));
		System.out.println(s.indexOf('a',10));
		System.out.println(s.indexOf("very"));
		System.out.println(s.indexOf("and", 30));
		System.out.println(s.isBlank());
		System.out.println("".isBlank());
		System.out.println(s.lastIndexOf('p'));
		System.out.println(s.lastIndexOf("and"));
		System.out.println(s.lastIndexOf('a', 10));
		System.out.println(s.lastIndexOf("and", 30));
		System.out.println(s.length());
		System.out.println(s.replace('a', '@'));
		System.out.println(s.replace("country", "COUNTRY"));
		System.out.println(s.replaceAll(s, s2));
		System.out.println(s.replaceFirst("my", "our"));
		
		String[] ar = s.split(" ");
		System.out.println(Arrays.toString(ar));
		
		System.out.println(s.substring(24));
		System.out.println(s.substring(24, 52));
		
		char[] ch = s.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println("        tejus      ".trim());
		System.out.println(s.repeat(2));
//		System.out.println(String.valueOf(s));
	}

}
