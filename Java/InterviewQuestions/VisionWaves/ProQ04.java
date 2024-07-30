package VisionWaves;

import java.util.Arrays;
import java.util.Scanner;

public class ProQ04 {
	
//	Q4] Reverse each word in sentence
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.nextLine();
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			String temp="";
			for(int j = words[i].length()-1 ;j>=0;j--) {
				temp+=words[i].charAt(j);
			}
			words[i] = temp;
		}
		System.out.println(Arrays.toString(words));
		sc.close();
	}
	
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter String :");
//		String str = sc.nextLine();
//		String[] split = splitString(str);
//		String ans = "";
//		for (int i = 0; i < split.length; i++) {
//			if(i!=split.length-1) {
//				ans+=reverseWord(split[i])+ " ";
//			}
//			else {
//				ans+=reverseWord(split[i]) ;
//			}
//		}
//		System.out.println(ans);
//		sc.close();
//	}
//	
//	public static String reverseWord(String str) {
//		String result = "";
//		for (int i = str.length()-1 ; i >= 0 ; i--) {
//			result += str.charAt(i);
//		}
//		return result;
//	}
//	
//	public static String[] splitString(String str) {
//		int WordCount = 1;
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i)==' ') {
//				WordCount++;
//			}
//		}
//		System.out.println(WordCount);
//		String[] result = new String[WordCount];
//		for(int i=0 , j=0; i<result.length ; i++ ) {
//			String temp="";
//			for(;j<str.length();) {
//				if(str.charAt(j)==' ') {
//					j++;
//					break;
//				}
//				else {
//					temp+=str.charAt(j);
//					j++;
//				}
//			}
//			result[i]=temp;			
//		}
//		return result;
//	}

}
