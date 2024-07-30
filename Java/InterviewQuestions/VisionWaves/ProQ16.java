package VisionWaves;

import java.util.Scanner;

public class ProQ16 {
	
//	Q16] Manipulate Given String aBcDeFgH.... 
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = s.nextLine();
		str = str.toLowerCase();
		String ans = "";
		for (int i = 0; i < str.length() ; i++) {
			if(i%2!=0) {
				ans+=str.substring(i,i+1).toUpperCase();
			}
			else {
				ans+=str.substring(i,i+1);
			}
		}
		System.out.println(ans);
		
		s.close();
		
	}

}
