package OperationsOnString;



public class CharArrayToString {
	
	public static String CharToString(char[] ch) {
		String ans = "";
		for (int i = 0; i < ch.length ; i++)
		{
			ans += ch[i];
		}
		return ans;
	}
	public static void main(String[] args) {
		char[] charArray = {'H','e','l','l','o'};
		System.out.println(CharToString(charArray));
	}

}
