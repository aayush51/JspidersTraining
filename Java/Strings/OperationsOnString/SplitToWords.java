package OperationsOnString;

import java.util.Arrays;

public class SplitToWords {
	
	public static String[] splitToWords(String str , char  ch) {
		String[] words = new String[countOfWords(str,ch)];
		for (int i = 0 , j = 0; i < words.length; i++) {
			String ans = "";
			for (; j < str.length(); j++) {
				if(str.charAt(j) == ch) {
					j++;
					break;
				}
				else {
					ans+=str.charAt(j);
				}
			}
			words[i] = ans;
		}
		return words;
	}
	
	public static int countOfWords(String str,char ch) {
		int count = 0, i = 0;
		for (; i < str.length(); i++) {
			if (str.charAt(i)==ch) {
				count++;
			}
		}
		if(str.isEmpty()) {
			return 0;
		}
		if(count>0) {
			return count+1;
		}
		else {
			return 1;
		}
	}
	
	public static String[] reverse(String str) {
		String[] st = splitToWords(str,' ');
		for(int i=0 ; i<st.length ; i++) {
			String s = "";
			for(int j=st[i].length()-1; j>=0; j--) {
				s+=st[i].charAt(j);
			}
			st[i]=s;
		}
		return st;
	}
	
	public static void main(String[] args) {
		String str = "Hi My Name Is Aayush !";
//		System.out.println(countOfWords(str));
//		String[] strWords = splitToWords(str);
//		System.out.println(Arrays.toString(strWords));
		System.out.println(Arrays.toString(reverse(str)));
	}

}
