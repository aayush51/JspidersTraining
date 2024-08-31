package OperationsOnString;

public class ToUpperCase {
	
	public static String toUpperCase(String str) {
		String result = "";
		for (int i = 0; i < str.length();i++) {
			char c = str.charAt(i);
			if (c>='a' && c<='z') {
				result= result + (char)(c-32);
			}
			else {
				result+=c;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String str1 = "HeLlo There";
		System.out.println(toUpperCase(str1));
	}

}
