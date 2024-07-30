package VisionWaves;

import java.util.Arrays;
import java.util.Scanner;

public class ProQ09 {
	
//	Q9] Find second largest element in array 
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = s.nextInt();
		int[] ar = new int[size];
		for (int i = 0; i < size; i++) {
			ar[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(ar));
		
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++) {
				if(ar[i]<ar[j]) {
					int temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		
		System.out.println("Second Largest Element : " +ar[1]);
		
		s.close();
	}
}
