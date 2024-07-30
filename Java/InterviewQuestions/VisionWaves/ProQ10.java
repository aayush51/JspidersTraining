package VisionWaves;

import java.util.Arrays;
import java.util.Scanner;

public class ProQ10 {
	
//	Q10] Convert String into Character array and Store its respective ascii values in different array
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = s.next();
		
		//Converting String to Char Array
		char[] c = str.toCharArray(); 
		System.out.println(Arrays.toString(c));
		int[] asciiAr = new int[c.length];
		for (int i = 0; i < c.length; i++) {
			int ascii = c[i];
			asciiAr[i] = ascii;
		}
		System.out.println(Arrays.toString(asciiAr));
		
		s.close();
	}
	
//	public static char[] toCharacterArray(String s) {
//		char[] charArray = new char[s.length()];
//		for (int i = 0; i < s.length(); i++) {
//			charArray[i] = s.charAt(i);
//		}
//		return charArray;
//	}

}
