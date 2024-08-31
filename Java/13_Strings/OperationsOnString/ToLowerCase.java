package OperationsOnString;

public class ToLowerCase {
	
	public static String toLowerCase(String str) {
		String result = "";
		for (int i = 0; i < str.length();i++) {
			char c = str.charAt(i);
			if (c>='A' && c<='Z') {
				result += (char)(c+32);
			}
			else {
				result += c ;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String str1 = "HeLLO WorLD!";
		System.out.println(toLowerCase(str1));	
	}

}
