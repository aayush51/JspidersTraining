package VisionWaves;

import java.util.Scanner;

public class ProQ14 {
//	Q14] Check if string is palindrome or not
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		
		sc.close();
		
		str = str.toLowerCase();
		int i = 0 , j = str.length()-1 ;
		for ( ; i <= j ; i++ , j--) {
			if(str.charAt(i) != str.charAt(j)) {
				break;
			}
		}
		if(i>j) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}
	
}
