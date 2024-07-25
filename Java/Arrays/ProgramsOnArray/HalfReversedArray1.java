package ProgramsOnArray;
import java.util.*;
public class HalfReversedArray1 {
	
	public static void main(String[] args) {
		
		int [ ] ar = {10,20,30,40,50,60,70,80,90,100};
		int [ ] br = new int [ar.length];
		for (int i = 0 ; i < ar.length; i++) 
		{
			if(i<ar.length/2) 
			{
				br[i] = ar[i];
			}
			else
			{
				for(int j=0;j<ar.length/2;j++)
				{
					int temp=ar[ar.length/2+j];
					br[i] = ar[ar.length-j-1];
					br[br.length-j-1] =temp;
					
				}
				
			}
		}
		System.out.println(Arrays.toString(br));
	}

}
