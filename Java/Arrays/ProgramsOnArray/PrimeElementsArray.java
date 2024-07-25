package ProgramsOnArray;

import java.util.Arrays;

public class PrimeElementsArray {
	
	public static int prime(int num)
	{	
		while(true)		
		{
			int den=2;
			while (den<num) 
			{
				if(num%den==0)
				{
					break;
				}
				den++;
			}
			if(num==den)
			{
				return num;
			}
			else
			{
				num++;
			}
		} 
	}
	
	public static void main(String[] args) {
		
		int[] a = {11,22,33,44,55,66,77,88,99};
		
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = prime(a[i]);
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
