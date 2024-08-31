package OperationsOnString;

public class ReverseSentence {
	
	public static String[] stringToArray( String ip , char ch) {
		String[] words = new String[countWords(ip, ch)];
		for (int i = 0 , j = 0; i < words.length; i++) {
			String temp = "";
			for (; j < ip.length(); j++) {
				if(ip.charAt(j) == ch) {
					j++;
					break;
				}
				else {
					temp+=ip.charAt(j);
				}
			}
			words[i] = temp;
		}
		return words;
	}
	public static int countWords(String str,char ch) {
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
	public static String reverse(String ip) {
		String ans = "";
		for(int i=ip.length()-1 ; i>=0; i-- ) {
			char c = ip.charAt(i);
			if((c>='0' && c<='9' )||( c>='a' && c<='z' )|| (c>='A' && c<='Z')) {
				ans+=ip.charAt(i);	
			}
		}
		for(int i=ip.length()-1 ; i>=0; i-- ) {
			char c = ip.charAt(i);
			if(!((c>='0' && c<='9' )||( c>='a' && c<='z' )|| (c>='A' && c<='Z'))) {
				ans+=ip.charAt(i);	
			}
		}
		return ans;
	}
	public static String reverseSentence(String ip) {
		String[] answer = stringToArray(ip,' ');
		String rev = "";
		for (int i = 0; i < answer.length ; i++) {
			answer[i] = reverse(answer[i]);
			if(i < answer.length-1) {
				rev+=answer[i]+' ';
			}
			else {
				rev+=answer[i];
			}
		}
		return rev;
	}
	public static void main(String[] args) {
		String s = "Today is a holiday! Can we go some where?";
		System.out.println(reverseSentence(s));
//		System.out.println(s.length());
//		System.out.println(s.indexOf('!'));
	}
}
