package VisionWaves;

import java.util.Arrays;
import java.util.Scanner;

public class ProQ06 {
	
//	Q6] Count of repeated element in array (Repeated element taken from user)
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = s.nextInt();
		int[] ar = new int[size];
		for (int i = 0; i < size; i++) {
			ar[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(ar));
		System.out.println("Duplicated Elements : ");
		int count = 0;
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++) {
				if(ar[i]==ar[j]) {
					count++;
					System.out.println(ar[i]);
				}
			}
		}
		System.out.println("Count : "+count);
		
		s.close();
		
	}
}
