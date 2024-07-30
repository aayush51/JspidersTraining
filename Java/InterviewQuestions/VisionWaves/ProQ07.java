package VisionWaves;

import java.util.Arrays;
import java.util.Scanner;

public class ProQ07 {
	
//	Q7] Store even and odd numbers from array in two different arrays(even array and odd array)
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = s.nextInt();
		int[] ar = new int[size];
		for (int i = 0; i < size; i++) {
			ar[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(ar));
		int evenSize = 0;
		int oddSize = 0;
		for(int i = 0; i < size; i++) {
			if(ar[i]%2==0) {
				evenSize++;
			}
			else {
				oddSize++;
			}
		}
		int[] evenAr = new int[evenSize];
		int[] oddAr = new int[oddSize];
		for(int i = 0 , j = 0 , k = 0 ; i < size; i++) {
			if(ar[i]%2==0) {
				evenAr[j++]=ar[i];
			}
			else {
				oddAr[k++]=ar[i];
			}
		}
		
		System.out.println("Even Array : " + Arrays.toString(evenAr));
		System.out.println("Odd Array : " + Arrays.toString(oddAr));
		
		s.close();
	}

}
