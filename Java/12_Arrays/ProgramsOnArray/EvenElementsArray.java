package ProgramsOnArray;

import java.util.Arrays;

public class EvenElementsArray {
	
	public static void main(String[] args) {
		
		int [] a = {66,9,51,7,4,3,6,22};
		
		for (int i = 0; i < a.length;i++) {
			if(a[i]%2!=0)
			{
				a[i] = a[i] + 1;
			}
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
