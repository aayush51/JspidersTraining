package VisionWaves;

import java.util.Scanner;

public class ProQ05 {

//	Q5] Count of vowels and consonants in array and string
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = s.nextLine();
		int vowels=0;
		int consonants=0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u') {
				vowels++;
			}
			else
			{
				consonants++;
			}
		}
		System.out.println("Vowels: "+vowels);
		System.out.println("Consonants: "+consonants);
		
		s.close();
	}
	
}
