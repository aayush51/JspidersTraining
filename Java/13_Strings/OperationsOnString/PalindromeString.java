package OperationsOnString;

public class PalindromeString {
	
	public static boolean isPalindrome(String s) {
		boolean result = false;
		int i = 0,j = s.length()-1;
		for ( ; i < j; i++ , j--) {
			if (s.charAt(i) != s.charAt(j))
			{
				break;
			}
		}
		if(i<j) {
			result = false;	
		}
		else {
			result = true;
		}
		return result;
	}
	
	public static void main(String[] args) {
		String s = "malayalam";
		System.out.println(isPalindrome(s));
	}
}
