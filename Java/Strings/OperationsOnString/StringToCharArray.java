package OperationsOnString;

import java.util.Arrays;

public class StringToCharArray {
	
	public static char[] toCharArr(String str) {
		char[] result = new char[str.length()];
		for (int i = 0; i < str.length();i++) {
			result[i] = str.charAt(i);
		}
		return result;
	}
	
	public static void main(String[] args) {
		String str = "Hello world";
		char[] ar = toCharArr(str);
		System.out.println(Arrays.toString(ar));
	}
	
}
