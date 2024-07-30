package VisionWaves;

import java.util.Scanner;

public class ProQ13 {
	
//	Q13] Convert 1st letter into capital and rest in lower case
	
	public static void main(String[] args) {
		 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = s.nextLine();
		String[] ar = str.split(" ");
		String ans = "";
		for (int i = 0; i < ar.length; i++) {
			ar[i] = ar[i].substring(0,1).toUpperCase()+ar[i].substring(1,ar[i].length());
			if (i != ar.length - 1) {
				ans+=ar[i] + " ";
			}
			else {
				ans+=ar[i];
			}
		}
		System.out.println(ans);
		
		s.close();
	}

}
