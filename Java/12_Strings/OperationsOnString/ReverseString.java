package OperationsOnString;

public class ReverseString {
	
	public static String reverse(String str) {
		String ans="";
		for (int i=str.length()-1; i>=0; i--) {
			ans+=str.charAt(i);
		}
		return ans;
	}
	
	public static void main(String[] args) {
		String s1 = "Hello , world!";
		System.out.println(reverse(s1));
	}

}
