package ProgramsOnArray;
import java.util.*;
public class LRrotateArray1 {
	
	public static int[] Lrotate(int[] array) {
		int temp = array[0];
		for(int i = 0; i < array.length-1; i++) {
			array[i] = array[i+1];
		}
		array[array.length-1] =temp;
		return array;
	}
	public static int[] Rrotate(int[] array) {
		int temp = array[array.length-1];
		for(int i = array.length-1 ; i > 0 ; i--) {
			array[i] = array[i-1];
		}
		array[0] =temp;
		return array;
	}
	
	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50,60,70,80};

		int[] half1 = new int[a.length/2];
		int[] half2 = new int[a.length/2];
		
		int[] b = new int[a.length];
		
		for(int i=0; i<a.length; i++)
		{
			if(i<a.length/2)
			{
				half1[i] =a[i];
//				System.out.println(Arrays.toString(half1));
			}
			else
			{
				half2[i-half2.length] =a[i];
//				System.out.println(Arrays.toString(half2));
			}
		}
		
// 		left rotation , right rotation 
//		Lrotate(half1);
//		Rrotate(half2);
		
		LeftRotateArray.Lrotate(half1, 3);
		RightRotateArray.Rrotate(half2, 3);
		
		for(int i=0; i<b.length; i++)
		{
			if(i<half1.length)
			{
				b[i] = half1[i];
			}
			else
			{
				b[i] = half2[i-half2.length];
			}
		}
		
		System.out.println(Arrays.toString(b));
		

	}

}
