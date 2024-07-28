package ProgramsOnArray2;

import java.util.Arrays;

public class PositiveNegativeSorting2 {
	
	public static void main(String[] args) {
		int[] ar = {3,2,99,5,-6,-3,1,3,-2,0,-1,87};
		for (int i = 0 ; i < ar.length; i++) {
			for (int j = 0 ; j < ar.length ; j++) {
				if (ar[i]<0 && ar[j]>0)
				{
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
				else if (ar[i]==0) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(ar));

	}

}
