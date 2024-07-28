package StringPrograms;

import java.util.Arrays;

public class AnagramString {
	
	public static void main(String[] args) {
		
		String s1 = "god";
		String s2 = "dog";
		if(s1.length()==s2.length()) {
			char [] ch1 = s1.toCharArray();
			char [] ch2 = s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			int i = 0;
			for(;i< ch1.length ;i++) {
				if(ch1[i]!=ch2[i]) {
					break;
				}
			}
			if(i==s2.length()) {
				System.out.println("It is Anagram");
			}
			else {
				System.out.println("Not anagram");
			}
		}
		else {
			System.out.println("Not anagram");
		}
	}

}
