package VisionWaves;

import java.util.Scanner;

public class ProQ15 {
	
//	Q15] Remove a element from String
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = s.nextLine();
		System.out.println("Enter Element to remove : ");
		char search = s.next().charAt(0);
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != search) {
				newStr += ch;
			}
		}
		System.out.println(newStr);
		
		s.close();
	}

}
