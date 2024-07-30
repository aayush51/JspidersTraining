package VisionWaves;

import java.util.Arrays;
import java.util.Scanner;

public class ProQ01 {
	
//	Q1] Reverse array and store in new array / different array
	
	public static void main(String[] args) {
		
		//Taking Inputs for Array elements
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		int size = sc.nextInt();
		System.out.println("Enter Elements of Array : ");
		int[] ar = new int[size];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		
		System.out.println("Before Reversing - "+Arrays.toString(ar));
		
		//Reversing Array With Storing Elements From Backwards
		int[] rev = new int[size];
		int it = 0;
		for (int i = ar.length-1; i >= 0 ; i--) {
			rev[it++] = ar[i];
		}
		
		System.out.println("After Reversing - "+Arrays.toString(rev));
		
		sc.close();
	}

}
