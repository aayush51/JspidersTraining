package BasicsOfString;

import java.util.Arrays;

public class st2 {
	public static void main(String[] args) {
		String str = "Jspiders";
		char ch [] = new char[str.length()];
		
//		String To Array Convert
		for (int i = 0; i < str.length();i++) {
			ch[i] = str.charAt(i);
		}
		
//		Sort Arrays To Get Characters in Alphabetical Order
		Arrays.sort(ch);
		String ans = "";
		
//		Array Back To String
		for (int i = 0; i < str.length(); i++) {
			ans += ch[i];
		}
		System.out.println(ans);
	}

}
