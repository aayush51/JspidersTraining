package OperationsOnString;

//import java.util.Arrays;

public class SortChars {
	
	public static String sort(String str) {
		String ans = "";
		char[] ch = str.toCharArray();
		for(int i = 0; i < ch.length-1; i++) {
			for(int j = 0; j < ch.length-i-1; j++) {
				if(ch[j]>ch[j+1])
				{
					char t = ch[j];
					ch[j] = ch[j+1];
					ch[j+1] = t;
				}
			}
		}
		for(int i = 0 ; i < ch.length ; i++) {
			ans+=ch[i];
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		String s = "yzxbaaca";
		String sorted = sort(s);
		System.out.println(sorted);
		
	}
}
