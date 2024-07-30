package VisionWaves;

import java.util.Arrays;

public class ProQ02 {
	
//	Q2] Store factors of numbers in separate array
	
	public static void main(String[] args) {
		int[] factors = factors(20);
		System.out.println(Arrays.toString(factors));
	}
	
	public static int[] factors(int num) {
		//Counting Number of Factors for Array size
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num%i==0) {
				count++;
			}
		}
		
		//Creating and Adding Factors to Array
		int[] result = new int[count];
		int it=0;
		for (int i = 1; i <= num; i++) {
			if (num%i==0) {
				result[it++]=i;
			}
		}
		
		return result;
	}
}
